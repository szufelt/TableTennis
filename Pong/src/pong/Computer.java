package pong;

public class Computer extends Paddle{

	public Computer(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * method on how to move the computer's paddle up and down the screen.
	 * @param y
	 */
	public void move(int y) {
		if(this.start.getY()>=0 || this.start.getY()<=450) {
			if (start.getY() < y) {
				int min = y - start.getY() < speed ? y - start.getY() : speed; 
				start.setY(start.getY()+min);
			}
			else if (y > start.getY()) {
				int min = start.getY() - y < speed ? start.getY() - y : speed; 
				start.setY(start.getY()-min);
			}
		}
	}

}
