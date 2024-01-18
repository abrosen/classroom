/*
Marty Stepp and Stuart Reges
Oct 18 2006

The DrawingPanel class provides a simple interface for drawing persistent
images using a Graphics object.  An internal BufferedImage object is used
to keep track of what has been drawn.  A client of the class simply
constructs a DrawingPanel of a particular size and then draws on it with
the Graphics object, setting the background color if they so choose.

To ensure that the image is always displayed, a timer calls repaint at
regular intervals.
*/

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.filechooser.FileFilter;

// A drawing surface for painting 2D graphics.
public class DrawingPanel extends FileFilter
        implements ActionListener, MouseMotionListener {
    // class constants
    private static final String TITLE = "Drawing Panel";
    private static final int DELAY = 250;  // delay between repaints in millis

    // shared variables
    private static boolean PRETTY = true;  // true to anti-alias
    
    // fields
    private int width, height;    // dimensions of window frame
    private JFrame frame;         // overall window frame
    private JPanel panel;         // overall drawing surface
    private BufferedImage image;  // remembers drawing commands
    private Graphics2D g2;        // graphics context for painting
    private JLabel statusBar;     // status bar showing mouse position  
    private JFileChooser chooser; // file chooser to save files
    private int timerCount;       // to help bring the window to the front

    // construct a drawing panel of given width and height enclosed in a window
    public DrawingPanel(int width, int height) {
        this.width = width;
        this.height = height;
        this.image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        
        this.statusBar = new JLabel(" ");
        this.statusBar.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        this.panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
        this.panel.setBackground(Color.WHITE);
        this.panel.setPreferredSize(new Dimension(width, height));
        this.panel.add(new JLabel(new ImageIcon(image)));
        
        // listen to mouse movement
        this.panel.addMouseMotionListener(this);
        
        this.g2 = (Graphics2D)image.getGraphics();
        this.g2.setColor(Color.BLACK);
        if (PRETTY) {
            this.g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        }
        
        // main window frame
        this.frame = new JFrame(TITLE);
        this.frame.setResizable(false);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.getContentPane().add(panel);
        this.frame.getContentPane().add(statusBar, "South");

        // menu bar
        this.setupMenuBar();
        
        this.frame.pack();
        this.frame.setVisible(true);
        this.frame.toFront();
        
        // repaint timer so that the screen will update
        Timer timer = new Timer(DELAY, this);
        timer.start();
    }
    
    // used for an internal timer that keeps repainting
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof javax.swing.Timer) {
            // redraw the screen at regular intervals to catch all paint operations
            this.panel.repaint();
        } else if (e.getActionCommand().equals("Exit")) {
            this.exit();
        } else if (e.getActionCommand().equals("Compare to File...")) {
            this.compareToFile();
        } else if (e.getActionCommand().equals("Save As...")) {
            this.saveAs();
        } else if (e.getActionCommand().equals("About...")) {
            JOptionPane.showMessageDialog(this.frame, 
                    "DrawingPanel\nwritten by Marty Stepp and Stuart Reges");
        }
        
        // kludge since the toFront call above doesn't seem to work
        if (timerCount < 4) {
            timerCount++;
            frame.toFront();
        }
    }
    
    // closes the frame and exits the program
    public void exit() {
        this.frame.setVisible(false);
        this.frame.dispose();
        System.exit(0);
    }

    // obtain the Graphics object to draw on the panel
    public Graphics2D getGraphics() {
        return this.g2;
    }
    
    // listens to mouse dragging
    public void mouseDragged(MouseEvent e) {}

    // listens to mouse movement
    public void mouseMoved(MouseEvent e) {
        DrawingPanel.this.statusBar.setText("(" + e.getX() + ", "
                + e.getY() + ")");
    }

    // take the current contents of the panel and write them to a file
    public void save(String filename) throws IOException {
        String extension = filename.substring(filename.lastIndexOf(".") + 1);
        
        // create second image so we get the background color
        BufferedImage image2 = new BufferedImage(this.width, this.height,
                BufferedImage.TYPE_INT_RGB);
        Graphics g = image2.getGraphics();
        g.setColor(panel.getBackground());
        g.fillRect(0, 0, this.width, this.height);
        g.drawImage(this.image, 0, 0, panel);
        
        // write file
        ImageIO.write(image2, extension, new File(filename));
    }

    // set the background color of the drawing panel
    public void setBackground(Color c) {
        this.panel.setBackground(c);
    }
    
    // show or hide the drawing panel on the screen
    public void setVisible(boolean visible) {
        this.frame.setVisible(visible);
    }
    
    // makes the program pause for the given amount of time,
    // allowing for animation
    public void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {}
    }

    // method of FileFilter interface
    public boolean accept(File file) {
        return !file.isDirectory() && 
                file.getName().toLowerCase().endsWith(".png");
    }

    // method of FileFilter interface
    public String getDescription() {
        return "PNG images (*.png)";
    }
    
    // moves given jframe to center of screen
    private void center(JFrame frame) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screen = tk.getScreenSize();
        frame.setLocation((screen.width - frame.getWidth()) / 2, 
                (screen.height - frame.getHeight()) / 2);
    }
    
    // constructs and initializes JFileChooser object if necessary
    private void checkChooser() {
        if (this.chooser == null) {
            this.chooser = new JFileChooser(System.getProperty("user.dir"));
            this.chooser.setMultiSelectionEnabled(false);
            this.chooser.setFileFilter(this);
        }
    }
    
    // compares current DrawingPanel image to an image file on disk
    private void compareToFile() {
        // save current image to a temp file
        try {
            File currentImageFile = File.createTempFile("current_image", ".png");
            this.save(currentImageFile.toString());

            // use file chooser dialog to find image to compare against
            this.checkChooser();
            if (this.chooser.showOpenDialog(this.frame) != JFileChooser.APPROVE_OPTION) {
                return;
            }
            
            // user chose a file; let's diff it
            DiffImage diff = new DiffImage();
            diff.setImage1(this.chooser.getSelectedFile().toString());
            diff.setImage2(currentImageFile.toString());
            diff.display();
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(this.frame, 
                    "Unable to compare images: \n" + ioe);
        }
    }
    
    // called when user presses "Save As" menu item
    private void saveAs() {
        // use file chooser dialog to get filename to save into
        this.checkChooser();
        if (this.chooser.showSaveDialog(this.frame) != JFileChooser.APPROVE_OPTION) {
            return;
        }

        File selectedFile = this.chooser.getSelectedFile();
        try {
            String filename = selectedFile.toString();
            if (!filename.toLowerCase().endsWith("png")) {
                // Windows is dumb about extensions with file choosers
                filename += ".png";
            }

            // confirm overwrite of file
            if (new File(filename).exists() && JOptionPane.showConfirmDialog(
                    this.frame, "File exists.  Overwrite?", "Overwrite?",
                    JOptionPane.YES_NO_OPTION) != JOptionPane.YES_OPTION) {
                return;
            }
            
            this.save(filename);  // save the file
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this.frame,
                    "Unable to save image:\n" + ex);
        }
    }

    // initializes DrawingPanel's menu bar items
    private void setupMenuBar() {
        JMenuItem saveAs = new JMenuItem("Save As...", 'A');
        saveAs.addActionListener(this);
        saveAs.setAccelerator(KeyStroke.getKeyStroke("ctrl S"));
        
        JMenuItem compare = new JMenuItem("Compare to File...", 'C');
        compare.addActionListener(this);
        compare.setAccelerator(KeyStroke.getKeyStroke("ctrl C"));
        
        JMenuItem exit = new JMenuItem("Exit", 'x');
        exit.addActionListener(this);
        
        JMenuItem about = new JMenuItem("About...", 'A');
        about.addActionListener(this);
        
        JMenu file = new JMenu("File");
        file.setMnemonic('F');
        file.add(saveAs);
        file.addSeparator();
        file.add(compare);
        file.addSeparator();
        file.add(exit);

        JMenu help = new JMenu("Help");
        help.setMnemonic('H');
        help.add(about);
        
        JMenuBar bar = new JMenuBar();
        bar.add(file);
        bar.add(help);
        this.frame.setJMenuBar(bar);
    }

    
    // Reports the differences between two images.
    private class DiffImage extends JPanel implements ActionListener, 
            ChangeListener {
        private static final long serialVersionUID = 0;
        
        private BufferedImage image1;
        private BufferedImage image2;
        private int numDiffPixels;
        private int opacity = 50;
        private String label1Text = "Expected";
        private String label2Text = "Actual";
        private boolean highlightDiffs = false;
    
        private Color highlightColor = new Color(255, 228, 0);
        private JLabel image1Label;
        private JLabel image2Label;
        private JLabel diffPixelsLabel;
        private JSlider slider;
        private JCheckBox box;
        private JMenuItem saveAsItem;
        private JMenuItem setImage1Item;
        private JMenuItem setImage2Item;
        private JFrame frame;
        private JButton colorButton;
        
        public void actionPerformed(ActionEvent e) {
            Object source = e.getSource();
            if (source == this.box) {
                highlightDiffs = box.isSelected();
                repaint();
            } else if (source == this.colorButton) {
                Color color = JColorChooser.showDialog(frame, 
                        "Choose highlight color", highlightColor);
                if (color != null) {
                    highlightColor = color;
                    colorButton.setBackground(color);
                    colorButton.setForeground(color);
                    repaint();
                }
            } else if (source == this.saveAsItem) {
                saveAs();
            } else if (source == setImage1Item) {
                setImage1();
            } else if (source == setImage2Item) {
                setImage2();
            }
        }

        // Counts number of pixels that differ between the two images.
        public void countDiffPixels() {
            if (this.image1 == null || this.image2 == null) {
                return;
            }
            
            int w1 = this.image1.getWidth();
            int h1 = this.image1.getHeight();
            int w2 = this.image2.getWidth();
            int h2 = this.image2.getHeight();
            int wmax = Math.max(w1, w2);
            int hmax = Math.max(h1, h2);
            
            // check each pair of pixels
            this.numDiffPixels = 0;
            for (int y = 0; y < hmax; y++) {
                for (int x = 0; x < wmax; x++) {
                    int pixel1 = (x < w1 && y < h1) ? this.image1.getRGB(x, y) : 0;
                    int pixel2 = (x < w2 && y < h2) ? this.image2.getRGB(x, y) : 0;
                    if (pixel1 != pixel2) {
                        this.numDiffPixels++;
                    }
                }
            }
        }
        
        // Displays differences between the two given image files.
        public void diff(File input1, File input2) throws IOException {
            this.diff(ImageIO.read(input1), ImageIO.read(input2));
            this.label1Text = input1.getName();
            this.label2Text = input2.getName();
        }
        
        // Displays differences between the two given images.
        public void diff(InputStream input1, InputStream input2) throws IOException {
            this.diff(ImageIO.read(input1), ImageIO.read(input2));
        }
        
        // Displays differences between the two given images.
        public void diff(BufferedImage image1, BufferedImage image2) {
            if (image1 == null || image2 == null) {
                throw new NullPointerException("Null images.\n\t" +
                        "image1: " + image1 + "\n\t" +
                        "image2: " + image2);
            }
            
            this.setImage1(image1);
            this.setImage2(image2);
            this.countDiffPixels();
        }
        
        // initializes diffimage panel
        public void display() {
            this.countDiffPixels();
            
            this.setupComponents();
            this.setupEvents();
            this.setupLayout();
    
            this.frame.pack();
            center(this.frame);
            
            this.frame.setVisible(true);
            this.frame.toFront();
        }
        
        // draws the given image onto the given graphics context
        public void drawImageFull(Graphics2D g2, BufferedImage image) {
            int iw = image.getWidth();
            int ih = image.getHeight();
            int w = this.getWidth();
            int h = this.getHeight();
            int dw = w - iw;
            int dh = h - ih;
    
            if (dw > 0) {
                g2.fillRect(iw, 0, dw, ih);
            }
            if (dh > 0) {
                g2.fillRect(0, ih, iw, dh);
            }
            if (dw > 0 && dh > 0) {
                g2.fillRect(iw, ih, dw, dh);
            }
            g2.drawImage(image, 0, 0, this);
        }
        
        // paints the DiffImage panel
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;
    
            // draw the expected output (image 1)
            if (this.image1 != null) {
                drawImageFull(g2, this.image1);
            }
    
            // draw the actual output (image 2)
            if (this.image2 != null) {
                Composite oldComposite = g2.getComposite();
                g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_ATOP, ((float) this.opacity) / 100));
                drawImageFull(g2, this.image2);
                g2.setComposite(oldComposite);
            }
            g2.setColor(Color.BLACK);
            
            // draw the highlighted diffs (if so desired)
            if (this.highlightDiffs && this.image1 != null && this.image2 != null) {
                int w1 = this.image1.getWidth();
                int h1 = this.image1.getHeight();
                int w2 = this.image2.getWidth();
                int h2 = this.image2.getHeight();
    
                int wmax = Math.max(w1, w2);
                int hmax = Math.max(h1, h2);
    
                // check each pair of pixels
                g2.setColor(this.highlightColor);
                for (int y = 0; y < hmax; y++) {
                    for (int x = 0; x < wmax; x++) {
                        int pixel1 = (x < w1 && y < h1) ? this.image1.getRGB(x, y) : 0;
                        int pixel2 = (x < w2 && y < h2) ? this.image2.getRGB(x, y) : 0;
                        if (pixel1 != pixel2) {
                            g2.fillRect(x, y, 1, 1);
                        }
                    }
                }
            }
        }
        
        public void save(File file) throws IOException {
            // String extension = filename.substring(filename.lastIndexOf(".") + 1);
            // ImageIO.write(this.diffImage, extension, new File(filename));
            String filename = file.getName();
            String extension = filename.substring(filename.lastIndexOf(".") + 1);
            BufferedImage img = new BufferedImage(this.getPreferredSize().width, this.getPreferredSize().height, BufferedImage.TYPE_INT_ARGB);
            img.getGraphics().setColor(this.getBackground());
            img.getGraphics().fillRect(0, 0, img.getWidth(), img.getHeight());
            this.paintComponent(img.getGraphics());
            ImageIO.write(img, extension, file);
        }
        
        public void save(String filename) throws IOException {
            save(new File(filename));
        }
        
        // Called when "Save As" menu item is clicked
        public void saveAs() {
            checkChooser();
            if (chooser.showSaveDialog(this.frame) != JFileChooser.APPROVE_OPTION) {
                return;
            }

            File selectedFile = chooser.getSelectedFile();
            try {
                save(selectedFile.toString());
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this.frame, "Unable to save image:\n" + ex);
            }
        }
        
        // called when "Set Image 1" menu item is clicked
        public void setImage1() {
            checkChooser();
            if (chooser.showSaveDialog(this.frame) != JFileChooser.APPROVE_OPTION) {
                return;
            }

            File selectedFile = chooser.getSelectedFile();
            try {
                this.setImage1(selectedFile.toString());
                this.countDiffPixels();
                this.diffPixelsLabel.setText("(" + this.numDiffPixels + " pixels differ)");
                this.image1Label.setText(selectedFile.getName());
                this.frame.pack();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this.frame, "Unable to set image 1:\n" + ex);
            }
        }
        
        // sets image 1 to be the given image
        public void setImage1(BufferedImage image) {
            if (image == null) {
                throw new NullPointerException();
            }
            
            this.image1 = image;
            this.setPreferredSize(new Dimension(
                Math.max(this.getPreferredSize().width, image.getWidth()), 
                Math.max(this.getPreferredSize().height, image.getHeight()))
            );
            if (this.frame != null) {
                this.frame.pack();
            }
            this.repaint();
        }
        
        // loads image 1 from the given filename
        public void setImage1(String filename) throws IOException {
            this.setImage1(ImageIO.read(new File(filename)));
        }
        
        // called when "Set Image 2" menu item is clicked
        public void setImage2() {
            checkChooser();
            if (chooser.showSaveDialog(frame) != JFileChooser.APPROVE_OPTION) {
                return;
            }

            File selectedFile = chooser.getSelectedFile();
            try {
                this.setImage2(selectedFile.toString());
                this.countDiffPixels();
                this.diffPixelsLabel.setText("(" + this.numDiffPixels + " pixels differ)");
                this.image2Label.setText(selectedFile.getName());
                this.frame.pack();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this.frame, "Unable to set image 2:\n" + ex);
            }
        }
        
        // sets image 2 to be the given image
        public void setImage2(BufferedImage image) {
            if (image == null) {
                throw new NullPointerException();
            }
            
            this.image2 = image;
            this.setPreferredSize(new Dimension(
                Math.max(this.getPreferredSize().width, image.getWidth()), 
                Math.max(this.getPreferredSize().height, image.getHeight()))
            );
            if (this.frame != null) {
                this.frame.pack();
            }
            this.repaint();
        }
        
        // loads image 2 from the given filename
        public void setImage2(String filename) throws IOException {
            this.setImage2(ImageIO.read(new File(filename)));
        }
        
        private void setupComponents() {
            this.frame = new JFrame("DiffImage");
            this.frame.setResizable(false);
            // this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            this.slider = new JSlider();
            this.slider.setPaintLabels(false);
            this.slider.setPaintTicks(true);
            this.slider.setSnapToTicks(true);
            this.slider.setMajorTickSpacing(25);
            this.slider.setMinorTickSpacing(5);
            
            this.box = new JCheckBox("Highlight diffs in color: ", this.highlightDiffs);
            
            this.colorButton = new JButton();
            this.colorButton.setBackground(highlightColor);
            this.colorButton.setForeground(highlightColor);
            this.colorButton.setPreferredSize(new Dimension(24, 24));
            
            this.diffPixelsLabel = new JLabel("(" + this.numDiffPixels + " pixels differ)");
            this.image1Label = new JLabel(this.label1Text);
            this.image2Label = new JLabel(this.label2Text);
            
            this.setupMenuBar();
        }
        
        // initializes layout of components
        private void setupLayout() {
            JPanel southPanel1 = new JPanel();
            southPanel1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
            southPanel1.add(this.image1Label);
            southPanel1.add(slider);
            southPanel1.add(this.image2Label);
            southPanel1.add(Box.createHorizontalStrut(20));
            
            JPanel southPanel2 = new JPanel();
            southPanel2.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
            southPanel2.add(this.diffPixelsLabel);
            southPanel2.add(Box.createHorizontalStrut(20));
            southPanel2.add(box);
            southPanel2.add(colorButton);
            
            Container southPanel = Box.createVerticalBox();
            southPanel.add(southPanel1);
            southPanel.add(southPanel2);
            
            this.frame.add(this, BorderLayout.CENTER);
            this.frame.add(southPanel, BorderLayout.SOUTH);
        }
        
        // initializes main menu bar
        private void setupMenuBar() {
            this.saveAsItem = new JMenuItem("Save As...", 'A');
            this.saveAsItem.setAccelerator(KeyStroke.getKeyStroke("ctrl S"));
            this.setImage1Item = new JMenuItem("Set Image 1...", '1');
            this.setImage1Item.setAccelerator(KeyStroke.getKeyStroke("ctrl 1"));
            this.setImage2Item = new JMenuItem("Set Image 2...", '2');
            this.setImage2Item.setAccelerator(KeyStroke.getKeyStroke("ctrl 2"));
            
            JMenu file = new JMenu("File");
            file.setMnemonic('F');
            file.add(setImage1Item);
            file.add(setImage2Item);
            file.addSeparator();
            file.add(saveAsItem);
            
            JMenuBar bar = new JMenuBar();
            bar.add(file);
            this.frame.setJMenuBar(bar);
        }
    
        // method of ChangeListener interface
        public void stateChanged(ChangeEvent e) {
            opacity = slider.getValue();
            repaint();
        }
        
        // adds event listeners to various components
        private void setupEvents() {
            slider.addChangeListener(this);
            box.addActionListener(this);
            colorButton.addActionListener(this);
            saveAsItem.addActionListener(this);
            this.setImage1Item.addActionListener(this);
            this.setImage2Item.addActionListener(this);
        }
    }
}
