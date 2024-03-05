package Objet;

import Character.Hero;
import General.Cellule;

public abstract class Objet {

	protected Cellule cell;

	/**
	 * Object's constructor
	 * 
	 * @param cellule cell
	 */
	public Objet(Cellule cell) {
		this.cell = cell;
	}

	/**
	 * returns the cellule
	 * 
	 * @return cell
	 */

	public Cellule getCell() {
		return this.cell;
	}

	public abstract void description();

	public abstract void use(Hero h);

	public abstract String getName();
}
