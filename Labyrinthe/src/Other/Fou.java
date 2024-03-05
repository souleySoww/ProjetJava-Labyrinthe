package Other;
import Character.Hero;
import General.Cellule;
public class Fou extends Other {

	/*
	*@param name the of the fool
	*@param cell the cell of the fool
	*@param indice the indice of the fool
	*/ 
	public Fou(String name, Cellule cell, String indice) {
		super(name, cell, indice);
		
	}

	/**
	* Give the indice to the hero
	*/

	public void giveIndice(){
		System.out.println(this.Indice);
	}
}
