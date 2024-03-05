package General;

import General.*;
import Character.Character;
import Character.Hero;
import Objet.*;
import Action.*;
import java.util.*;

public class Labyrinthe {

	protected Cellule[][] labyr;
	private int width;
	private int heigth;
	private List<Character> person;
	private Hero hero;
	private List<Objet> treasure;
	private List<Action> action;

	/**
	 * build the labyrinthe
	 * 
	 * @param x the width of the labyrinthe
	 * @param y the heigtht of the labyrinthe
	 */
	public Labyrinthe(int x, int y) {
		this.width = x;
		this.heigth = y;
		this.labyr = new Cellule[x][y];
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				this.labyr[i][j] = new Cellule(i, j);
			}
		}

		this.person = new ArrayList<Character>();
		this.treasure = new ArrayList<Objet>();
		this.action = new ArrayList<Action>();
		this.action.add(new InteractWith());
		this.action.add(new Move());
		this.action.add(new LookCase());
		this.action.add(new PickUp());
	}

	/**
	 * returns true if the border is an East border
	 * 
	 * @param x the width of the cell
	 * @param y the heigth of the
	 * @return true if the border is an East border
	 */
	public boolean isBorderEast(int x, int y) {
		return y == this.width - 1;
	}

	/**
	 * returns true if the border is a South border
	 * 
	 * @param x the width of the cell
	 * @param y the heigth of the
	 * @return true if the border is a South border
	 */
	public boolean isBorderSouth(int x, int y) {
		return x == this.heigth - 1;
	}

	/**
	 * returns true if the border is a last border
	 * 
	 * @param x the width of the cell
	 * @param y the heigth of the
	 * @return true if the border is a last border
	 */
	public boolean isLastBorder(int x, int y) {
		return this.isBorderEast(x, y) && this.isBorderSouth(x, y);
	}

	/**
	 * returns a cell in the labyrinthe
	 * 
	 * @param x the width of the cell
	 * @param y the heigth of the
	 * @return the the cell of the labyrinthe
	 */
	public Cellule getCell(int x, int y) {

		return this.labyr[x][y];
	}

	/**
	 * returns the width of the cell
	 * 
	 * @return the width of the cell
	 */
	public int getWidth() {
		return this.width;
	}

	/**
	 * returns the height of the cell
	 * 
	 * @return the height of the cell
	 */
	public int getHeigth() {
		return this.heigth;
	}

	/**
	 * remove a wall
	 * 
	 * @param o the orientation
	 * @param x the width of the cell
	 * @param y the heigth of the cell
	 * 
	 */
	public void removeWall(Orientation o, int x, int y) {

		this.getCell(x, y).removeWall(o);

	}

	/**
	 * add a wall
	 * 
	 * @param o the orientation
	 * @param x the width of the cell
	 * @param y the heigth of the cell
	 * 
	 */
	public void addWall(Orientation o, int x, int y) {
		this.getCell(x, y).addWall(o, false);

	}

	/**
	 * returns true if we get the value of an orientation
	 * 
	 * @param o the orientation
	 * @param x the width of the cell
	 * @param y the heigth of the cell
	 * @return true if we get the value of an orientation
	 */
	public Boolean getValue(Orientation o, int x, int y) {
		return this.getCell(x, y).getValue(o);
	}

	/**
	 * @return Hero the hero's labyrinthe
	 **/
	public Hero getHero() {
		return hero;
	}

	/**
	 * changes the hero of the game
	 * 
	 * @param Hero h the hero we want
	 **/
	public void setHero(Hero h) {
		this.hero = h;
	}

	public List<Objet> getTreasure() {
		return treasure;
	}

	public List<Character> getPerson() {
		return person;
	}

	/**
	 * attribute a random position in the labyrinth
	 * 
	 * @return Cellule the selected position
	 **/
	public Cellule random() {
		int x = 0 + (int) (Math.random() * (this.width));
		int y = 0 + (int) (Math.random() * (this.heigth));

		return this.getCell(x, y);
	}

	public void addPerson(Character c) {
		this.person.add(c);
	}

	public void addTreasure(Objet o) {
		this.treasure.add(o);
	}

	public void removePerson(Character c) {
		this.person.remove(c);
	}

	public void removeTreasure(Objet o) {
		this.treasure.remove(o);
	}

	/**
	 * attribute a random position of the quest
	 * 
	 * @return Cellule the selected position
	 **/
	public Cellule quest() {
		int x = 0 + (int) (Math.random() * (this.width));
		int y = 0 + (int) (Math.random() * (this.heigth));

		return this.getCell(x, y);
	}

	public List<Action> getAction() {
		return this.action;
	}

	/**
	 * returns the cell at given orientation
	 * 
	 * @param o    the orientation
	 * @param cell the cell
	 * @return the cell at given orientation
	 */
	public Cellule nextCell(Orientation o, Cellule cell) {

		Cellule test = null;
		if (o.equals(Orientation.East)) {
			test = this.getCell(cell.getX(), cell.getY() + 1);
		} else if (o.equals(Orientation.North)) {
			test = this.getCell(cell.getX() - 1, cell.getY());
		} else if (o.equals(Orientation.South)) {
			test = this.getCell(cell.getX() + 1, cell.getY());
		} else if (o.equals(Orientation.West)) {
			test = this.getCell(cell.getX(), cell.getY() - 1);
		}
		return test;

	}

	/**
	 * 
	 * @return the list of characters who are on the same cell
	 */
	public List<Character> sameCellC() {
		List<Character> list = new ArrayList<Character>();
		for (Character c : this.getPerson()) {
			if (this.hero.getCell().equals(c.getCell())) {
				list.add(c);
			}
		}
		return list;
	}

	/**
	 * 
	 * @return the list of objects who are on the same cell
	 */
	public List<Objet> sameCellO() {
		List<Objet> list = new ArrayList<Objet>();
		for (Objet o : this.getTreasure()) {
			if (this.hero.getCell().equals(o.getCell())) {
				list.add(o);
			}
		}
		return list;
	}
}
