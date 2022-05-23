package pong;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

public class Ball implements GraphicsUpdater {
	private Point start;
	private Point dest;
	private int width;
	private int height;
	private int speed = 1;
	
	public Ball(Point dest) {
		start = new Point(200, 125);
		this.dest = dest;
		width = 10;
		height = 10;
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
		g.fillOval(start.getX(), start.getY(), width, height);
	}
	
	/**
	 * method to move the ball on the screen
	 * @param p
	 */
	public void move() {
		
		if (start.getX() < dest.getX()) {
    		int min = dest.getX() - start.getX() < speed ? dest.getX() - start.getX() : speed; 
    		start.setX(start.getX()+min);
    	} else if (start.getX() > dest.getX()) {
    		int min = start.getX() - dest.getX() < speed ? start.getX() - dest.getX() : speed; 
    		start.setX(start.getX()-min);
    	}
    	        
    	if (start.getY() < dest.getY()) {
    		int min = dest.getY() - start.getY() < speed ? dest.getY() - start.getY() : speed; 
    		start.setY(start.getY()+min);
    	} else if (start.getY() > dest.getY()) {
    		int min = start.getY() - dest.getY() < speed ? start.getY() - dest.getY() : speed; 
    		start.setY(start.getY()-min);
    	}
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
	
	/**
	 * method to reflect ball when it hits an obstacle
	 */
	public void bounce() {
		if(start.getX()==20)
			dest.setX(dest.getX()*-1);
		else if(start.getX()==390)
			dest.setX(dest.getX()*-1);
		
		if(start.getY()<=10)
			dest.setY(dest.getY()*-1);
		else if(start.getY()==330)
			dest.setY(dest.getY()*-1);
	}
	
	
	
}
