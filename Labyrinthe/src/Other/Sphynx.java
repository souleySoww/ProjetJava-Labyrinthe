package Other;

import General.Cellule;
import java.util.Scanner;

public class Sphynx extends Other {

	private String enigm;
	private String answer;

	/**
	 * Sphynx's Constructor
	 * 
	 * @param String  name
	 * @param Cellule cell
	 * @param String  indice
	 * @param String  enigme
	 * @param String  answer
	 **/
	public Sphynx(String name, Cellule cell, String indice, String enigme, String answer) {
		super(name, cell, indice);
		this.enigm = enigme;
		this.answer = answer;
	}

	/**
	 * returns the enigma of the sphynx
	 * 
	 * @return String
	 **/
	public String getEnigm() {
		return enigm;
	}

	/**
	 * allows to modify the enigma
	 * 
	 * @param String enigm
	 **/
	public void setEnigm(String enigm) {
		this.enigm = enigm;
	}

	/**
	 * returns the answer of the enigma
	 * 
	 * @return String
	 **/
	public String getAnswer() {
		return answer;
	}

	/**
	 * allows to modify the answer of enigma
	 * 
	 * @param String answer
	 **/
	public void setAnswer(String answer) {
		this.answer = answer;
	}

	/* Give the indice to the hero

	*/

	public void giveIndice() {
		Scanner scanner = new Scanner(System.in);
		System.out.print(this.enigm);
		@SuppressWarnings("resource")
		String answere = scanner.nextLine();
		if (this.answer.equals(answere)) {
			System.out.println(this.Indice);
		} else {
			System.out.println("La r�ponse donn�e est incorrect !!!");
		}

	}
}
