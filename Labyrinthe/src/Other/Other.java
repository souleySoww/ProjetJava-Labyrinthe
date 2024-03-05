package Other;

import Character.Character;
import General.Cellule;

public class Other extends Character {
	protected String Indice;

	
	public Other(String name, Cellule cell, String indice) {
		super(name, cell);
		this.Indice = indice;
	}
	/**
	 * Get the indice
	 */
	public String getIndice() {
		return this.Indice;
	}
	/**
	 * Set the indice 
	 * @param indice
	 */
	public void setIndice(String indice) {
		this.Indice = indice;
	}

}
