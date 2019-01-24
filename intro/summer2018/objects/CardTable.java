/* 
 * Example code for Think Java (http://thinkapjava.com)
 *
 * Copyright(c) 2011 Allen B. Downey
 * GNU General Public License v3.0 (http://www.gnu.org/copyleft/gpl.html)
 *
 * @author Allen B. Downey
 */
package objects;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class CardTable extends Canvas {
    private Image[][] images;
    private int cardWidth, cardHeight; 

   /*
    * Creates a CardTable.
    * cardset is the String name of the folder that contains the card images.
    */
    public CardTable(String cardset) {
	setBackground(new Color(0x088A4B));
	
	// create an array of card images
	String suits = "cdhs";
	images = new Image[4][14];
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
		char c = suits.charAt(suit);
		String s = String.format("%s/%02d%c.gif", cardset, rank, c);
		images[suit][rank] = new ImageIcon(s).getImage();
            }
        }

	// get the width and height of the cards and set the size of
	// the frame accordingly
	cardWidth = images[1][1].getWidth(null);
	cardHeight = images[1][1].getHeight(null);

	// set the size temporarily to get the insets
	setTableSize(14, 4);
    }

   /*
    * Sets the table size.
    * x and y are in units of card width/height.
    */
    public void setTableSize(double x, double y) {
	setSize((int)(x * cardWidth),
		(int)(y *cardHeight));
    }

   /*
    * Draws a card at the given coordinates.
    * x and y are in units of card width/height.
    */
    public void drawCard(Graphics g, int suit, int rank, double x, double y) {
	Image image = images[suit][rank];
	g.drawImage(image, 
		    (int)(x * cardWidth), 
		    (int)(y * cardHeight),
		    null);
    }

    /*
     * Special method invoked when the Frame needs to be drawn.
     */
    public void paint(Graphics g) {
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
		double x = rank-1 + suit/5.0;
		double y = suit / 2.0;
		drawCard(g, suit, rank, x, y);
            }
        }
    }

    public static void main(String[] args) {
	// make the frame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	// add the CardTable
	String cardset = "cardset-oxymoron";
	Canvas canvas = new CardTable(cardset);
        frame.getContentPane().add(canvas);

	// show the frame
	frame.pack();
        frame.setVisible(true);
    }
}
