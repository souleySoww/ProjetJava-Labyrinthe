package Objet;

import Character.Hero;
import General.Cellule;

public class Parchment extends Objet {

	private String content;

	/**
	 * Parchment's constructor
	 * 
	 * @param Cellule cell
	 * @param String  content
	 */

	public Parchment(Cellule cell, String content) {
		super(cell);
		this.setContent(content);

	}

	/**
	 * @return the content of the Parchment
	 */

	public String getContent() {
		return this.content;
	}

	public void use(Hero hero) {
		System.out.println(this.getContent());
	}

	/**
	 * set the content of the Parchment
	 * 
	 * @param content the content of the Parchment
	 * 
	 */

	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * the description of parchment
	 */
	public void description() {
		System.out.println("Parchment");
	}
	/**
	 * name of parchment
	 */
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Parchment";
	}

}
