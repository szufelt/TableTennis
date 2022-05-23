package pong;

import javax.swing.Timer;

/**
 * This is the main driver for the game of Pong.
 * Run this class to run the main game.
 * @author Sam Zufelt
 *
 */

public class MainGame {

	public static void main(String[] args) {


		Model model = new Model();
		Controller controller = new Controller();
		View view = new View(controller, model);

		// give the controller a reference to the view and model
		controller.addModel(model);
		controller.addView(view);


		// start animation using a swing timer
		new Timer(10, controller).start();
		
	}

}
