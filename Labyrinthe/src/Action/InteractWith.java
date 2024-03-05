package Action;

import Character.Character;
import Character.Hero;
import General.Labyrinthe;
import Other.Altruiste;
import Other.Fou;
import Other.Marchand;
import Other.Sphynx;
import java.util.*;

public class InteractWith extends Action {
	/**
	 * allows you to interact with a character
	 */
	@Override
	public void execute(Labyrinthe labyr) {
		List<Character> list = labyr.sameCellC();
		Hero hero = labyr.getHero();
		for (int i = 0; i < list.size(); i++) {
			String res = i + "  " + list.get(i).getName();
			System.out.println(res);
		}
		if (list.isEmpty()) {
			System.out.println("il n'y a personne sur cette case");
		} else {
			Scanner scanner = new Scanner(System.in);
			int number = scanner.nextInt();
			if (number >= 0 && number <= list.size()) {
				if (list.get(number) instanceof Altruiste) {
					((Altruiste) list.get(number)).giveIndice();
				}
				if (list.get(number) instanceof Sphynx) {
					((Sphynx) list.get(number)).giveIndice();
				}
				if (list.get(number) instanceof Fou) {
					((Fou) list.get(number)).giveIndice();
				}
				if (list.get(number) instanceof Marchand) {
					((Marchand) list.get(number)).giveIndice(hero);
				}
				labyr.removePerson(list.get(number));
			} else {
				System.out.println("D�sol�");
			}
		}

	}

	@Override
	public String toString() {
		return "InteractWith";

	}

}
