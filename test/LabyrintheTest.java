import static org.junit.Assert.*;

import java.beans.Transient;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import Character.*;
import Character.Character;
import General.Cellule;
import General.Labyrinthe;
import General.Orientation;
import Objet.Jowels;
import Objet.Objet;
import Other.Altruiste;

public class LabyrintheTest {

	@Test
	public void createLabyrinthe() {
		Labyrinthe labyr = new Labyrinthe(5, 5);
		assertSame(5, labyr.getWidth());
		assertSame(5, labyr.getHeigth());
	}

	@Test
	public void isBorderEastTest() {
		Labyrinthe l = new Labyrinthe(5, 5);
		assertFalse(l.isBorderEast(3, 2));
		assertTrue(l.isBorderEast(2, 4));

	}

	@Test
	public void isBorderSouthTest() {
		Labyrinthe l = new Labyrinthe(5, 5);
		assertFalse(l.isBorderSouth(2, 4));
		assertTrue(l.isBorderSouth(4, 0));

	}

	@Test
	public void islastBorderTest() {
		Labyrinthe l = new Labyrinthe(5, 5);
		assertFalse(l.isLastBorder(2, 4));
		assertTrue(l.isLastBorder(4, 4));
		assertFalse(l.isLastBorder(3, 0));
		assertFalse(l.isLastBorder(1, 4));

	}

	@Test
	public void removeWall() {
		// removing a wall
		Labyrinthe l = new Labyrinthe(4, 5);
		l.removeWall(Orientation.East, 3, 4);
		assertFalse(l.getCell(3, 4).getWall().containsKey(Orientation.East));
	}

	@Test
	public void addWallTest() {
		Labyrinthe l = new Labyrinthe(4, 5);
		// adding a wall
		l.addWall(Orientation.North, 3, 4);
		assertTrue(l.getCell(3, 4).getWall().containsKey(Orientation.North));
		assertFalse(l.getCell(3, 4).getValue(Orientation.North));
	}

	@Test
	public void getwidth() {
		Labyrinthe c = new Labyrinthe(4, 6);
		int test = c.getWidth();
		assertSame(test, 4);
	}

	@Test
	public void getheigth() {
		Labyrinthe c = new Labyrinthe(4, 6);
		int test = c.getHeigth();
		assertSame(test, 6);
	}

	@Test
	public void getcell() {
		Labyrinthe l = new Labyrinthe(4, 6);
		Cellule cell = l.getCell(2, 4);
		assertEquals(cell, l.getCell(2, 4));
	}

	@Test
	public void sameCellCTest() {
		Labyrinthe l = new Labyrinthe(4, 6);
		Cellule C = l.getCell(3, 3);
		Cellule C1 = l.getCell(2, 3);
		Character k = new Altruiste("Altruist", C, "continue tout droit");
		Character ka = new Altruiste("Altruist", C1, "continue tout au sud et puis a l'Est");
		Hero H = new Hero("Timo", C);
		l.setHero(H);
		l.addPerson(k);
		l.addPerson(ka);
		List<Character> list = l.sameCellC();
		assertEquals(k.getCell(),H.getCell());
		assertEquals(k, list.get(0));
		assertFalse(list.contains(ka));
	}

	@Test
	public void sameCellCOTest() {
		Labyrinthe l = new Labyrinthe(4, 6);
		Cellule C = l.getCell(3, 3);
		Cellule C1 = l.getCell(2, 3);
		Objet O = new Jowels(C, 5);
		Objet Ob = new Jowels(C1, 10);
		Hero H = new Hero("Timo", C);
		l.setHero(H);
		l.addTreasure(O);
		l.addTreasure(Ob);
		List<Objet> list = l.sameCellO();
		assertTrue(list.contains(O));
		assertFalse(list.contains(Ob));
	}

	public void NextNorthenCellTest() {

		Labyrinthe l = new Labyrinthe(5, 5);
		Cellule c = l.getCell(1, 1);
		Cellule northenCell = l.getCell(0, 1);
		assertSame(northenCell, l.nextCell(Orientation.North, c));

	}

	public void NextSouthCellTest() {

		Labyrinthe l = new Labyrinthe(5, 5);
		Cellule c = l.getCell(1, 1);
		Cellule SouthCell = l.getCell(2, 1);
		assertSame(SouthCell, l.nextCell(Orientation.South, c));

	}

	public void NextEasternCellTest() {

		Labyrinthe l = new Labyrinthe(5, 5);
		Cellule c = l.getCell(1, 1);
		Cellule EasternCell = l.getCell(1, 0);
		assertSame(EasternCell, l.nextCell(Orientation.East, c));

	}

	public void NextWesternCellTest() {

		Labyrinthe l = new Labyrinthe(5, 5);
		Cellule c = l.getCell(1, 1);
		Cellule westernCell = l.getCell(1, 2);
		assertSame(westernCell, l.nextCell(Orientation.West, c));

	}

}
