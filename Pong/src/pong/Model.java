package pong;

import java.awt.Graphics;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Random;

public class Model implements GraphicsUpdater{
	

	private MouseMotionListener ml;
	private Ball ball;
	private Player player;
	private Computer computer;
	private int pscore = 0, cscore = 0;
	private Point ballDest;
	protected boolean started = false;
	public int mover =0;

	public Model() {
		
		
		player = new Player(10, 10);
		
		computer = new Computer(400, 10);
		Random rand = new Random();
		ballDest = new Point(rand.nextInt(), rand.nextInt());

		ball = new Ball(ballDest);
	}
	
	/**
	 * A method that updates the {@link Graphics} object
	 * used by the view. 
	 * 
 	 * @param g
	 *            A {@link Graphics} object reference. The model
	 *            can update a {@link Graphics} object with {@link Ball} data.
	 */
	@Override
	public void update(Graphics g) {
		
		if(started) {
			gameOver();
			
			//player movement
			player.move(mover);
		
			//move computer paddle
			if(computer.getStart().getY()!=ball.getStart().getY())
				computer.move(ball.getStart().getY());
			
			ball.move();
		
			//check for ball collision
			ball.bounce();
		}
		
		player.update(g);
		computer.update(g);		
		ball.update(g);
				
	}
	
	//Call to move player by mover amount
	public void playerMove(int mover) {
		player.move(mover);
	}
	
	//Create a new game
	public void newGame() {
		started = true;
	}
	
	//end the game
	public void gameOver() {
		if(ball.getStart().getX()>400) {
			started=false;
			pscore++;
			System.out.println("gameover");
			return;
		}
		if(ball.getStart().getX()<0) {
			started=false;
			cscore++;
			System.out.println("gameover");
			return;
		}
	}
}
