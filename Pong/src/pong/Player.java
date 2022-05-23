package pong;


public class Player extends Paddle{
	
	public Player(int x, int y) {
		super(x,y);
	}
	
	public void move(int up) {
		if(this.start.getY()<0 || this.start.getY()>450) {
			
			this.start.setY(start.getY());
		}
		else {
			if(up>0) {
				this.start.setY(start.getY()-speed);
			}
			else if(up<0) {
				this.start.setY(start.getY()+1);
			}
		}
	}
}
