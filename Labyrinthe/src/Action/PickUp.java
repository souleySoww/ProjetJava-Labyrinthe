package Action;

import General.*;
import Character.Character;
import Character.Hero;
import Objet.*;
import java.util.*;

public class PickUp extends Action {
	/**
	 * allows you to pick up items
	 * @param labyr the labyrinth
	 */
	@Override
	public void execute(Labyrinthe labyr) {
		Hero hero = labyr.getHero();
		List<Objet> list = labyr.sameCellO();
		for (int i = 0; i < list.size(); i++) {
			String res = i + "  " + list.get(i).getName();
			System.out.println(res);
		}
		if (list.isEmpty()) {
			System.out.println("il n'y a pas d'objet sur cette case");
		} else {
			Scanner scanner = new Scanner(System.in);
			int number = scanner.nextInt();
			if (number >= 0 && number <= list.size()) {
				hero.addObject(list.get(number));
				list.get(number).use(hero);
				labyr.removeTreasure(list.get(number));
			}
		}
	}

	public String toString() {
		return "Pickup and use";
	}

}
