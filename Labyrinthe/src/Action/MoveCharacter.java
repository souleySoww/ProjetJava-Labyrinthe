package Action;

import General.*;
import Character.Character;
import Character.Hero;
import Objet.*;
import java.util.*;

public class MoveCharacter extends Action {
	/**
	 * allows the characters to move
	 */
	@Override
	public void execute(Labyrinthe labyr) {
		for (Character c : labyr.getPerson()) {
			Cellule cell = c.getCell();
			List<Orientation> voisins = cell.open();
			int n = (int) (Math.random() * voisins.size());
			c.setCellule(labyr.nextCell(voisins.get(n), cell));
		}

	}

	public String toString() {
		return "MoveCharacter";
	}

}