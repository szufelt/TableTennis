package pong;

/**
 * Used as a reference to various points for objects to use.
 * @author Sam Zufelt
 *
 */
public class Point {
	private int x;
	private int y;
	
	/**
	 * Default Constructor which uses a point of (0,0)
	 */
	public Point() {
		x = 0;
		y = 0;
	}
	
	/**
	 * Constructor which is passed the coordinates of a point.
	 * @param x
	 * @param y
	 */
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}
	
	
}
