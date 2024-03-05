package Character;

import General.*;
import Objet.*;

import java.util.*;

public class Hero extends Character {

	private int gold;
	private List<Objet> collect;

	/**
	 * Build an hero
	 * 
	 * @param name the name of the hero
	 * @param cell a Cellule of Labyrinthe
	 */
	public Hero(String name, Cellule cell) {
		super(name, cell);
		this.gold = 00;
		this.collect = new ArrayList<Objet>();
	}

	/**
	 * returns the number of gold return number of gold
	 */
	public int getGold() {
		return this.gold;
	}

	/**
	 * add object in a list of objects
	 * 
	 * @param o the object
	 */
	public void addObject(Objet o) {
		/* ajouter un object dans la liste d'objets */
		this.collect.add(o);
	}

	/**
	 * remove an object in a list of objects
	 * 
	 * @param o the object
	 */
	public void removeObject(Objet o) {
		this.collect.remove(o);
	}

	/**
	 * returns the list of objects
	 * 
	 * @return the list of objects
	 */
	public List<Objet> getObject() {
		return this.collect;
	}

	/**
	 * Moves the hero to a given cell
	 * 
	 * @param cell the new cell where the hero will be moved to
	 */
	public void move(Cellule cell) {

		this.setCellule(cell);

	}

	/**
	 * Set a given quantity of gold to the hero
	 * 
	 * @param i the quantity of gold
	 */
	public void setGold(int i) {

		this.gold = i;
	}

}
