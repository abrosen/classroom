package turtles;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Map;
import java.util.TreeMap;

import javax.imageio.ImageIO;

/**
 * Turtles inspired by Logo (by Bobrow, Feurzeig, Papert, and Soloon, 1967),
 * which in turn was inspired by the turtle robots built by Walter in the late 1940s.
 * <p>
 * Usage example:
 * <pre>
 * World w = new World();
 * 
 * Turtle t = new Turtle(w);
 * t.forward(300);
 * t.setPenWidth(10);
 * t.backward(100);
 * t.right(135);
 * t.penUp();
 * t.forward(50);
 * t.drop("http://www.extremenxt.com/elsie.jpg");
 * </pre>
 * 
 * @author Luther Tychonievich. Released to the public domain.
 */
public class Turtle {
	/// version number based on date of creation
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 20140120L; 

	private static final Map<String,BufferedImage> cachedPictures = new TreeMap<String,BufferedImage>();

	private World world;
	private double theta;

	private Point2D.Double location;
	private boolean isdown;
	// private GeneralPath trail; // not used
	private Color color;
	private double shellSize;
	private int pause = 200;


	private static final Color[] base = {
		Color.BLACK,
		Color.RED,
		Color.BLUE,
		Color.MAGENTA,
		Color.CYAN,
	};
	private static int baseIndex = 0;

	/**
	 * Makes a new turtle in the center of the world.
	 * @param w the world
	 */
	public Turtle(World w) { this(w, 0, 0); }
	/**
	 * Makes a new turtle at the specified point within the world.
	 * @param x the x coordinate, in pixels; 0 is the center; bigger numbers to left
	 * @param y the y coordinate, in pixels; 0 is the center; bigger numbers down
	 * @param w the world
	 */
	public Turtle(double x, double y, World w) { this(w, x, y); }
	/**
	 * Makes a new turtle at the specified point within the world.
	 * @param w the world
	 * @param x the x coordinate, in pixels; 0 is the center; bigger numbers to left
	 * @param y the y coordinate, in pixels; 0 is the center; bigger numbers down
	 */
	public Turtle(World w, double x, double y) {
		this.location = new Point2D.Double(x + w.centerX, y + w.centerY);
		// this.trail = new GeneralPath(); // not used
		// this.trail.moveTo(this.location.x, this.location.y); // not used
		this.theta = 0;
		this.world = w;
		this.color = Turtle.base[Turtle.baseIndex];
		Turtle.baseIndex = (Turtle.baseIndex+1) % Turtle.base.length; 
		this.penWidth = 1;
		this.isdown = true;
		this.shellSize = 8;

		w.addTurtle(this);
	}

	/**
	 * Moves the turtle 100 pixels in the direction it is facing.
	 */
	public void forward() { this.forward(100); }
	/**
	 * Moves the turtle the specified distance in the direction it is facing.
	 * @param d the number of pixels to move
	 */
	public void forward(double d) {
		this.cornerGoTo(this.location.x + Math.cos(this.theta)*d, this.location.y + Math.sin(this.theta)*d);
	}

	/**
	 * Moves the turtle 100 pixels in the opposite of the direction it is facing.
	 */
	public void backward() { this.backward(100); }
	/**
	 * Moves the turtle the specified distance in the opposite direction from the one it is facing.
	 * @param d the number of pixels to move
	 */
	public void backward(double d) { this.forward(-d); }
	/**
	 * Turns the turtle clockwise in place.
	 * @param degrees the number of degrees to turn
	 */
	public void turnRight(double degrees) { 
		this.theta += Math.PI*degrees/180;
		while (this.theta > Math.PI) this.theta -= Math.PI*2; 
		while (this.theta <= -Math.PI) this.theta += Math.PI*2; 
		world.turtleMoved();
		this.pause();
	}
	/**
	 * Turns the turtle counterclockwise in place.
	 * @param degrees the number of degrees to turn
	 */
	public void turnLeft(double degrees) { this.turnRight(-degrees); }
	/**
	 * Stops the turtle from leaving a trail.
	 */
	public void penUp() { this.isdown = false; }
	/**
	 * Causes the turtle to leave a trail.
	 */
	public void penDown() { this.isdown = true; }

	/**
	 * Check the pen state
	 * @return true if the pen is down, false otherwise
	 */
	public boolean isPenDown() { return this.isdown; }

	/**
	 * Draws the shell of the turtle.
	 * Should only be called by World class 
	 * @param g the graphics object to draw with
	 */
	void _how_world_draw_turtles(Graphics2D g) {

		// // Other way to draw trails; can't change color part-way through though
		// g.setColor(color);
		// g.setStroke(new BasicStroke((float)this.width, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
		// g.draw(this.trail);
		// // end other way to draw tails

		// The following draws a picture of a turtle

		// three shapes
		GeneralPath back = new GeneralPath(); // the bigger shell
		GeneralPath back2 = new GeneralPath(); // the paler inner shell
		GeneralPath body = new GeneralPath(); // the head, legs, and tail
		double c = Math.cos(this.theta);
		double s = Math.sin(this.theta);
		double x = this.location.x;
		double y = this.location.y;
		double w = this.shellSize;
		Ellipse2D leftEye  = new Ellipse2D.Double(x + 1.55*w*c + 0.15*w*s -0.1*w, y + 1.55*w*s - 0.15*w*c -0.1*w, 0.2*w, 0.2*w);
		Ellipse2D rightEye = new Ellipse2D.Double(x + 1.55*w*c - 0.15*w*s -0.1*w, y + 1.55*w*s + 0.15*w*c -0.1*w, 0.2*w, 0.2*w);

		body.moveTo(x + w*0.9*c + w*0.4*s, y + w*0.9*s - w*0.4*c);
		body.curveTo(
				x + w*1.6*c + w*0.4*s, y + w*1.6*s - w*0.4*c,
				x + w*1.8*c + w*0.3*s, y + w*1.8*s - w*0.3*c,
				x + w*1.8*c + w*0.0*s, y + w*1.8*s - w*0.0*c
				);
		body.curveTo(
				x + w*1.8*c - w*0.3*s, y + w*1.8*s + w*0.3*c,
				x + w*1.6*c - w*0.4*s, y + w*1.6*s + w*0.4*c,
				x + w*0.9*c - w*0.4*s, y + w*0.9*s + w*0.4*c
				);
		body.lineTo(x + w*0.8*c - w*1.2*s, y + w*0.8*s + w*1.2*c);
		body.lineTo(x + w*0.5*c - w*1.2*s, y + w*0.5*s + w*1.2*c);
		body.lineTo(x + w*0.5*c - w*0.6*s, y + w*0.5*s + w*0.6*c);
		body.lineTo(x - w*0.5*c - w*0.6*s, y - w*0.5*s + w*0.6*c);
		body.lineTo(x - w*0.6*c - w*1.2*s, y - w*0.6*s + w*1.2*c);
		body.lineTo(x - w*0.9*c - w*1.15*s, y - w*0.9*s + w*1.15*c);
		body.lineTo(x - w*0.85*c - w*0.2*s, y - w*0.85*s + w*0.2*c);
		body.lineTo(x - w*1.6*c - w*0.0*s, y - w*1.6*s + w*0.0*c);
		body.lineTo(x - w*0.85*c + w*0.2*s, y - w*0.85*s - w*0.2*c);
		body.lineTo(x - w*0.9*c + w*1.15*s, y - w*0.9*s - w*1.15*c);
		body.lineTo(x - w*0.6*c + w*1.2*s, y - w*0.6*s - w*1.2*c);
		body.lineTo(x - w*0.5*c + w*0.6*s, y - w*0.5*s - w*0.6*c);
		body.lineTo(x + w*0.5*c + w*0.6*s, y + w*0.5*s - w*0.6*c);
		body.lineTo(x + w*0.5*c + w*1.2*s, y + w*0.5*s - w*1.2*c);
		body.lineTo(x + w*0.8*c + w*1.2*s, y + w*0.8*s - w*1.2*c);
		body.closePath();

		back.moveTo(x + w*1.2*c, y + w*1.2*s);
		back.curveTo(
				x + w*1.2*c + w*0.6*s, y + w*1.2*s - w*0.6*c,
				x + w*0.7*c + w*s,     y + w*0.7*s - w*c,
				x           + w*s,     y           - w*c
				);
		back.curveTo(
				x - w*0.7*c + w*s,     y - w*0.7*s - w*c,
				x - w*1.2*c + w*0.6*s, y - w*1.2*s - w*0.6*c,
				x - w*1.2*c,           y - w*1.2*s
				);
		back.curveTo(
				x - w*1.2*c - w*0.6*s, y - w*1.2*s + w*0.6*c,
				x - w*0.7*c - w*s,     y - w*0.7*s + w*c,
				x           - w*s,     y           + w*c
				);
		back.curveTo(
				x + w*0.7*c - w*s,     y + w*0.7*s + w*c,
				x + w*1.2*c - w*0.6*s, y + w*1.2*s + w*0.6*c,
				x + w*1.2*c,           y + w*1.2*s
				);

		w *= 0.7;
		back2.moveTo(x + w*1.2*c, y + w*1.2*s);
		back2.curveTo(
				x + w*1.2*c + w*0.6*s, y + w*1.2*s - w*0.6*c,
				x + w*0.7*c + w*s,     y + w*0.7*s - w*c,
				x           + w*s,     y           - w*c
				);
		back2.curveTo(
				x - w*0.7*c + w*s,     y - w*0.7*s - w*c,
				x - w*1.2*c + w*0.6*s, y - w*1.2*s - w*0.6*c,
				x - w*1.2*c,           y - w*1.2*s
				);
		back2.curveTo(
				x - w*1.2*c - w*0.6*s, y - w*1.2*s + w*0.6*c,
				x - w*0.7*c - w*s,     y - w*0.7*s + w*c,
				x           - w*s,     y           + w*c
				);
		back2.curveTo(
				x + w*0.7*c - w*s,     y + w*0.7*s + w*c,
				x + w*1.2*c - w*0.6*s, y + w*1.2*s + w*0.6*c,
				x + w*1.2*c,           y + w*1.2*s
				);

		int gap = 48;
		Color midColor = new Color(
				Math.max(Math.min(color.getRed(),255-gap),gap),
				Math.max(Math.min(color.getGreen(),255-gap),gap),
				Math.max(Math.min(color.getBlue(),255-gap),gap)
				);
		Color lightColor = new Color(
				midColor.getRed()+gap,
				midColor.getGreen()+gap,
				midColor.getBlue()+gap
				);
		Color darkColor = new Color(
				midColor.getRed()-gap,
				midColor.getGreen()-gap,
				midColor.getBlue()-gap
				);



		g.setColor(darkColor);
		g.fill(body);
		g.setColor(midColor);
		g.fill(back);
		g.setColor(lightColor);
		g.fill(back2);
		g.setColor(Color.WHITE);
		g.fill(leftEye);
		g.fill(rightEye);

	}

	/**
	 * Place a picture on the screen where the turtle currently is; 
	 * make it 100 pixels wide.
	 * @param filename the file name or URL of the image to be drawn 
	 * @return true if the image was found, false otherwise
	 */
	public boolean drop(String filename) {
		return this.drop(filename, 100);
	}

	/**
	 * Place a picture on the screen where the turtle currently is.
	 * @param filename the file name or URL of the image to be drawn 
	 * @param size how big the image should be in pixels 
	 * @return true if the image was found, false otherwise
	 */
	public boolean drop(String filename, double size) {
		try {
			BufferedImage pic;
			if (cachedPictures.containsKey(filename)) {
				pic = cachedPictures.get(filename);
			} else {
				try {
					pic = ImageIO.read(new URL(filename).openStream());
				} catch (Throwable ex) {
					pic = ImageIO.read(new File(filename));
				}
				cachedPictures.put(filename, pic);
			}
			double scale = size/Math.max(pic.getWidth(), pic.getHeight());

			AffineTransform af = new AffineTransform();
			af.translate(this.location.x, this.location.y);
			af.rotate(this.theta+Math.PI/2);
			af.translate(-size/2, -size/2);
			af.scale(scale, scale);
			this.world.drawImage(pic, af);
			this.pause();
			return true;
		} catch (IOException e) {
			return false;
		}
	}


	/**
	 * Returns the current Color of the Turtle.
	 * @return The current Color of the pen.
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * Changes the current Color of the Turtle.
	 * @param color The new Color to use in drawing
	 */
	public void setColor(Color color) {
		this.color = color;
		world.turtleMoved();
		this.pause();
	}

	private double penWidth;

	/**
	 * Returns the current width of the turtle's pen.
	 * @return The new pen width, in pixels.
	 */
	public double getPenWidth() {
		return penWidth;
	}

	/**
	 * Sets the width of the pen.
	 * @param width The new pen width, in pixels.
	 */
	public void setPenWidth(double width) {
		if (width <= 0) throw new IllegalArgumentException("Width must be positive");
		this.penWidth = width;
	}

	public double getShellSize() {
		return shellSize;
	}

	public void setShellSize(double shellSize) {
		this.shellSize = shellSize;
		world.turtleMoved();
		this.pause();
	}

	/**
	 * Find out what direction the Turtle is facing
	 * @return angle in degrees; 0 is right, 90 is up, etc
	 */
	public double getHeading() {
		return theta*180/Math.PI;
	}

	/**
	 * Set the direction the Turtle is facing
	 * @param angle in degrees; 0 is right, 90 is up, etc
	 */
	public void setHeading(double angle) {
		this.theta = angle*Math.PI/180;
		world.turtleMoved();
		this.pause();
	}
	
	/**
	 * Find out where the turtle is located
	 * @return The location of the turtle. (0,0) is the center of the screen, +x is rightward, +y is downward.
	 */
	public Point2D getLocation() {
		return new Point2D.Double(this.location.x - world.centerX, (-this.location.y - world.centerY));
	}


	/**
	 * Move the turtle to a particular location. It might leave a trail depending on if the pen is down or not.
	 * @param where The new location for the turtle. (0,0) is the top left of the screen, +x is rightward, +y is downward.
	 */
	protected void cornerGoTo(Point2D where) {
		this.cornerGoTo(where.getX(), where.getY());
	}
	/**
	 * Move the turtle to a particular location. It might leave a trail depending on if the pen is down or not.
	 * @param where The new location for the turtle. (0,0) is the center of the screen, +x is rightward, +y is downward.
	 */
	public void goTo(Point2D where) {
		this.cornerGoTo(where.getX() + world.centerX, (-where.getY() + world.centerY));
	}

	/**
	 * Move the turtle to a particular location. It might leave a trail depending on if the pen is down or not.
	 * @param x The new x location for the turtle. 0 is the center of the screen, bigger numbers to the right
	 * @param y The new y location for the turtle. 0 is the center of the screen, bigger numbers lower down
	 */
	protected void cornerGoTo(double x, double y) {
		double ox = this.location.x;
		double oy = this.location.y;
		this.location.x = x;
		this.location.y = y;
		if (this.isdown) {
			world.drawLine(this.location, ox, oy, this.penWidth, this.color);
			world.turtleMoved();
			this.pause();
		} else {
			world.turtleMoved();
			this.pause();
		}

	}
	public void goTo(double x, double y) {
		this.cornerGoTo(x + world.centerX, (-y + world.centerY));
	}


	/**
	 * Seconds to pause between each turtle movement
	 * @return the seconds currently paused
	 */
	public double getDelay() {
		return pause * 0.001;
	}
	/**
	 * Seconds to pause between each turtle movement
	 * @param seconds The seconds to pause
	 */
	public void setDelay(double seconds) {
		this.pause = (int)(seconds*1000);
	}

	
	private void pause() {
		try { Thread.sleep(this.pause); } catch (InterruptedException e) { }
	}


}
