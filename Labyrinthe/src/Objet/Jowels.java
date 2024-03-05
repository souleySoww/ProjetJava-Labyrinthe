package Objet;

import Character.Hero;
import General.Cellule;

public class Jowels extends Objet {
	private int gold;

	public Jowels(Cellule cell, int gold) {
		super(cell);
		this.setGold(gold);
	}

	/* returns the gold */
	public int getGold() {
		return gold;
	}
	/*
	 * set the value of the gold given
	 * 
	 * @param gold the gold
	 */

	public void setGold(int gold) {
		this.gold = gold;
	}
	/**
	 * Description of the object
	 */
	public void description() {
		System.out.println("Jewels");
	}
	/**
	 * Use the object
	 */
	public void use(Hero hero) {
		hero.setGold(this.getGold() + hero.getGold());
	}
	/**
	 * get the name of the object
	 */
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Jowel";
	}

}
