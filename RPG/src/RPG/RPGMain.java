package RPG;

import Controller.*;
import Model.*;
import View.*;

public class RPGMain {

	public static void main(String[] args) {
		RPGModel rpg = new RPGModel();
		RPGView view = new RPGView();
		RPGController controller = new RPGController(rpg, view);
		
		controller.updateView();
	}

}
