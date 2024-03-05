package Other;

import Objet.*;
import Character.Hero;
import General.Cellule;
import java.util.*;

public class Marchand extends Other {
	private int or;

	/**
	 * Marchand's Constructor
	 * 
	 * @param String  name
	 * @param Cellule cell
	 * @param String  indice
	 **/
	public Marchand(String name, Cellule cell, String indice) {
		super(name, cell, indice);
		this.or = 0;
	}

	/**
	 * 
	 * @param int or
	 * @change the value of Or 
	 **/
	public void setOr(int or) {
		this.or = or;
	}

	/**
	* @param int or
	* @ return the number of Or
	*/
	public int getOr() {
		return this.or;
	}

	/**
	* @param Hero h
	* @give the indice to the hero
	*/
	public void giveIndice(Hero h) {
		if (h.getGold() > 0) {
			h.setGold(h.getGold() - 10);
			System.out.println(this.Indice);
		} else {
			System.out.println("Dsol vous n'avez pas assez d'or");
		}

	}

}
