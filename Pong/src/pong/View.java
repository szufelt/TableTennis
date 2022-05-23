package pong;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 * View displays the GUI of the pong game.
 * @author Sam Zufelt
 *
 */

public class View {
	
	private static final int HEIGHT=500, WIDTH=500;
	private JFrame frame;
	private GraphicsUpdater graphicsUpdater;
	private MouseListener mouseListener;
	private KeyListener keyListener;

	// define an inner class
	@SuppressWarnings("serial")
	private class GamePanel extends JPanel {

		public void paintComponent(Graphics g) {
			graphicsUpdater.update(g);
			revalidate();
		}
	}
	
	// declare reference to inner class type
	private GamePanel panel;
		
	/**
	 * A View constructor. 
	 *
	 * @param controller
	 *            An {@link KeyListener} object.
	 * @param controller
	 *            An {@link GraphicsUpdater} object.
	 */
	public View(KeyListener keyListener, GraphicsUpdater graphicsUpdater) {

		frame = new JFrame("Table Tennis by S. Zufelt");

		// Create a panel for the game 
		panel = new GamePanel();
		frame.add(panel);

		frame.setSize(WIDTH, HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		frame.addKeyListener(keyListener);
		
		this.keyListener = keyListener;
		this.graphicsUpdater = graphicsUpdater;
		
	}
	
	/**
	 * A method for refreshing the frame
	 * of animation. 
	 */
	public void refresh(){
		frame.repaint();
	}
		
}
