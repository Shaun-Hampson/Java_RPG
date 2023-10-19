package Controller;

import Model.RPGModel;
import View.RPGView;

public class RPGController {
	
	private RPGModel model;
	private RPGView view;

	public RPGController(RPGModel model, RPGView view) {
		this.model = model;
		this.view = view;
	}
	
	public void updateView() {
		/*
		 * TODO:
		 * 
		 * Need to work out what needs to be updated in the view based on the model.
		 */
	}
}
