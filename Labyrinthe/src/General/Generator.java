package General;

import General.*;
import Character.*;
import Character.Character;
import Objet.*;
import Other.*;

import java.util.*;
import java.util.Scanner;

import Action.Action;

public abstract class Generator {

	protected Labyrinthe labyr;

	/**
	 * create a labyrinthe
	 * 
	 * @param x the width of the labyrinthe
	 * @param y the height of the labyrinthe
	 */

	public Generator(int x, int y) {
		this.labyr = new Labyrinthe(x, y);
	}

	public abstract void generateLabyr();

	/**
	 * returns the full grid
	 * 
	 * @return the full grid
	 */

	/**
	 * returns the labyrinthe built
	 * 
	 * @return the labyrinthe built
	 **/

	public String buildFullLabyr() {
		String res = "";
		for (int q = 0; q < this.labyr.getWidth(); q++) {
			res += "+---";
		}
		res += "+";
		for (int i = 0; i < this.labyr.getHeigth(); i++) {
			String ligne = "|";
			for (int j = 0; j < labyr.getWidth(); j++) {
				if (labyr.getCell(i, j).getValue(Orientation.East)) {
					
					ligne += "   |";
				} else {
					ligne += "    ";
				}
			}
			res += "\n" + ligne;
			String colonne = "";
			for (int k = 0; k < labyr.getWidth(); k++) {
				if (labyr.getCell(i, k).getValue(Orientation.South)) {
					colonne += "+---";
				} else {
					colonne += "+   ";
				}
			}
			res += "\n" + colonne + "+";
		}
		return res;
	}
	
	public String buildFullLabyrWithHero() {
		String res = "";
		for (int q = 0; q < this.labyr.getWidth(); q++) {
			res += "+---";
		}
		res += "+";
		for (int i = 0; i < this.labyr.getHeigth(); i++) {
			String ligne = "|";
			for (int j = 0; j < labyr.getWidth(); j++) {
				if(labyr.getCell(i,j).equals(this.getcell())) {
					ligne+=" H ";
				}
				else {
					ligne+="   ";
				}
				if (labyr.getCell(i, j).getValue(Orientation.East)) {
					
					ligne += "|";
				} else {
					ligne += " ";
				}
			}
			res += "\n" + ligne;
			String colonne = "";
			for (int k = 0; k < labyr.getWidth(); k++) {
				if (labyr.getCell(i, k).getValue(Orientation.South)) {
					colonne += "+---";
				} else {
					colonne += "+   ";
				}
			}
			res += "\n" + colonne + "+";
		}
		return res;
	}

	/**
	 * returns the labyrinthe
	 * 
	 * @return the labyrinthe
	 */

	public Labyrinthe getLabyr() {
		return this.labyr;
	}

	public Cellule getcell() {
		return this.labyr.getHero().getCell();
	}

	public Hero gethero() {
		return this.labyr.getHero();
	}

	public void playGame() {
		List<Action> list = labyr.getAction();
		for (int i = 0; i < list.size(); i++) {
			String res = i + "  " + list.get(i).toString();
			System.out.println(res);
		}
		System.out.println("Choisissez votre action : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		if (number >= 0 && number <= list.size()) {
			list.get(number).execute(labyr);
		} else {
			System.out.println("D�sol� cette action n'est pas valide veillez re�ssayer ");
		}

	}

}
