package Action;

import General.*;
import Character.Character;
import Character.Hero;
import Objet.*;

public class LookCase extends Action {
	/**
	 * allows to check if the cell contains a character or an object
	 * @param labyr the labyrinth
	 */
	@Override
	public void execute(Labyrinthe labyr) {
		Hero hero = labyr.getHero();
		for (Character c : labyr.sameCellC()) {
			System.out.println(c.getName());
		}
		for (Objet o : labyr.sameCellO()) {
			o.description();
		}
	}

	public String toString() {
		return "Lookcase";
	}
}
