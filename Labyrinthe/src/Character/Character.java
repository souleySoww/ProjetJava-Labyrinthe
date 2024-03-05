package Character;

import General.*;

public abstract class Character {

	protected String name;
	protected Cellule cellule;

	/**
	 * Character's Constructor
	 * 
	 * @param String  name
	 * @param Cellule cell
	 **/
	public Character(String name, Cellule cell) {
		this.name = name;
		this.cellule = cell;
	}

	/**
	 * returns the cell where the character is located
	 * 
	 * @return Cellule
	 **/
	public Cellule getCell() {
		return this.cellule;
	}

	/**
	 * returns the name of the character
	 * 
	 * @return String
	 **/
	public String getName() {
		return this.name;
	}

	public void setCellule(Cellule cell) {
		this.cellule = cell;
	}

}
