package Action;

import General.*;
import Character.*;
import Objet.*;
import java.util.*;

public class Move extends Action {
	/**
	 * allows the hero to move
	 * @param labyr the labyrinth
	 */
	@Override
	public void execute(Labyrinthe labyr) {
		Cellule cellHero = labyr.getHero().getCell();
		List<Orientation> voisins = cellHero.open();
		for (int i = 0; i < voisins.size(); i++) {
			String res = i + "  " + voisins.get(i);
			System.out.println(res);
		}
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		if (number >= 0 && number <= voisins.size()) {

			labyr.getHero().move(labyr.nextCell(voisins.get(number), cellHero));
		} else {
			System.out.println("Vous ne pouvez pas aller l�-bas");
		}

	}

	public String toString() {
		return "Move";
	}

}
