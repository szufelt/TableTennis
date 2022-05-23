package pong;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Controller is used as an event listener and communicates with the view and model classes
 * @author Sam Zufelt
 *
 */

public class Controller implements KeyListener, ActionListener{
	
	Model model;
	View view;
	
	/**
	 * Controller constructor
	 */
	Controller(){
		
	}
	
	/**
	 * A method that can be used to set the {@link Model} being used
	 * by the Controller. This is an example of "Method injection"
	 * 
 	 * @param m
	 *            A {@link Model} object reference. The model
	 *            used to keep track of character data.
	 */
	public void addModel(Model m){
		this.model = m;
		model.started =true;
	}
	
	/**
	 * A method that can be used to set the {@link View} being used
	 * by the Controller. This is an example of "Method injection"
	 * 
 	 * @param m
	 *            A {@link View} object reference. The view
	 *            used to show the characters.
	 */
	public void addView(View v){
		this.view = v;
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			model.mover=1;
		}
		else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			model.mover=-1;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			model.mover=0;
		}
		else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			model.mover=0;
		}
	}
	
	/**
	 * Implementation of the {@link ActionListener#actionPerformed(ActionEvent)} 
	 * method in the {@link ActionListener} interface. 
	 * 
	 * As an example, this method can be called by a {@link javax.swing.Timer} every 50 milliseconds. 
	 * This method is used to refresh frames for an animation. 
	 *
	 * @param e
	 *            An {@link ActionEvent} object.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		
		// force paintComponent of the JPanel to be called
		view.refresh();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}
}
