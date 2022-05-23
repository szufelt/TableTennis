package pong;

import java.awt.Color;
import java.awt.Graphics;

public class Paddle implements GraphicsUpdater{
	protected Point start;
	private Point dest;
	private int width;
	private int height;
	protected int speed = 1;
	
	public Paddle(int x, int y) {
		start = new Point(x,y);
		width = 10;
		height = 50;
	}
	
	/**
	 * Implementation of {@link GraphicsUpdater#update}. 
	 *
	 * @param g
	 *         The {@link Graphics} object to be modified.
	 */
	@Override
    public void update(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(start.getX(), start.getY(), width, height);
	}
	
	/**
	 * @return the start
	 */
	public Point getStart() {
		return start;
	}

	/**
	 * @param start the start to set
	 */
	public void setStart(Point start) {
		this.start = start;
	}
	
	
	
}
