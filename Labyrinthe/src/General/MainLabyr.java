package General;

import General.*;
import Character.Character;
import Character.Hero;
import Objet.*;
import Action.*;
import Other.*;

import java.util.*;

public class MainLabyr {

	public static void main(String[] args) {

		Generator g = new ArbreBinaire(10, 10);
		Cellule cell = g.labyr.getCell(8, 3);
		Action movechar = new MoveCharacter();
		Hero h = new Hero("toto", g.labyr.getCell(0, 0));
		g.labyr.setHero(h);
		String IndicePos = "   la case objective est :" + cell;
		Sphynx s1 = new Sphynx("sphynx1", g.labyr.random(), IndicePos, "Qu'elle est la capitale du cameroun",
				"Yaound�");
		Sphynx s2 = new Sphynx("sphynx2", g.labyr.random(), IndicePos,
				"Quel est le nom de l'homme le plus influent du monde ??", "Poutine");
		Sphynx s3 = new Sphynx("sphynx3",g.labyr.random(), IndicePos,
				"Quelle est la prochaine ann�e bissextile ??", "2024");
		Sphynx s4 = new Sphynx("sphynx4", g.labyr.random(), IndicePos,
				"Quel est le pays ayant pour capitale Bujumbura ??", "Burundi");
		Sphynx s5 = new Sphynx("sphynx5", g.labyr.random(), IndicePos,
				"Quel est le plu long fleuve du monde ??", "Le NIL");
		Fou f2 = new Fou("Inconnu", g.labyr.random(),
				"Pour arriver � la case objective tu dois faire 5 pas horizontalement et 9 verticalement");
		Marchand m1 = new Marchand("Marchand1", g.labyr.random(), IndicePos);
		for(int i=0 ;i<5;i++) {
			g.labyr.addTreasure(new Parchment(g.labyr.random(), IndicePos));
		}
		for(int i=0 ;i<22;i++) {
			g.labyr.addTreasure(new Jowels(g.labyr.random(), 5));
		}
		for(int i=0 ;i<6;i++) {
			g.labyr.addPerson(new Altruiste("Inconnu", g.labyr.random(), IndicePos));
		}
		for(int i=0 ;i<6;i++) {
			g.labyr.addPerson(new Fou("Inconnu", g.labyr.random(), "Tu es d�ja � la case objective"));
		}
		for(int i=0 ;i<10;i++) {
			g.labyr.addPerson(new Marchand("Marchand", g.labyr.random(), IndicePos));
		}
		g.labyr.addPerson(s1);
		g.labyr.addPerson(s2);
		g.labyr.addPerson(s3);
		g.labyr.addPerson(s4);	
		g.labyr.addPerson(s5);	
		g.labyr.addPerson(f2);	
		g.generateLabyr();
		System.out.println(g.buildFullLabyr());
		while (g.getcell() != cell) {
			System.out.println(g.buildFullLabyrWithHero());
			System.out.println("le hero se trouve Ã  la position " + g.getcell());
			System.out.println("le nombre d'or du hero est : " + g.labyr.getHero().getGold());
			movechar.execute(g.labyr);
			g.playGame();
		}
		System.out.println("vous etes arrivée");

	}

}
