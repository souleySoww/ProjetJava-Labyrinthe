package Other;

import General.Cellule;

public class Altruiste extends Other {

	/*
	 * Build an altruist
	 * 
	 * @param name of altruist
	 * 
	 * @param cell cell of altruist
	 * 
	 * @param indice indice of altruist
	 */
	public Altruiste(String name, Cellule cell, String indice) {
		super(name, cell, indice);

	}

	/*
	* Give the indice to the hero

	*/

	public void giveIndice() {

		System.out.println(this.Indice);

	}

}
