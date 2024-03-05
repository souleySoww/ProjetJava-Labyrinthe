import static org.junit.Assert.*;
import org.junit.Test;
import Action.*;
import General.*;
import Other.*;;



public class MoveCharacterTest{
	
	@Test
	public void executeTestEast() {
		Action move = new MoveCharacter();
		Labyrinthe labyr= new Labyrinthe(4,4);
		Cellule c =labyr.getCell(1, 0);
		c.removeWall(Orientation.East);
		c.addWall(Orientation.East, false);
		Fou f= new Fou("fou",c,"bonjour");
		labyr.addPerson(f);
		move.execute(labyr);
		assertEquals(labyr.getCell(1, 1),f.getCell());
	}
	
	@Test
	public void executeTestWest() {
		Action move = new MoveCharacter();
		Labyrinthe labyr= new Labyrinthe(4,4);
		Cellule c =labyr.getCell(1, 1);
		c.removeWall(Orientation.West);
		c.addWall(Orientation.West, false);
		Fou f= new Fou("fou",c,"bonjour");
		labyr.addPerson(f);
		move.execute(labyr);
		assertEquals(labyr.getCell(1, 0),f.getCell());
	}
	
	@Test
	public void executeTestSouth() {
		Action move = new MoveCharacter();
		Labyrinthe labyr= new Labyrinthe(4,4);
		Cellule c =labyr.getCell(1, 0);
		c.removeWall(Orientation.South);
		c.addWall(Orientation.South, false);
		Fou f= new Fou("fou",c,"bonjour");
		labyr.addPerson(f);
		move.execute(labyr);
		assertEquals(labyr.getCell(2, 0),f.getCell());
	}
	
	@Test
	public void executeTestNorth() {
		Action move = new MoveCharacter();
		Labyrinthe labyr= new Labyrinthe(4,4);
		Cellule c =labyr.getCell(1, 0);
		c.removeWall(Orientation.North);
		c.addWall(Orientation.North, false);
		Fou f= new Fou("fou",c,"bonjour");
		labyr.addPerson(f);
		move.execute(labyr);
		assertEquals(labyr.getCell(0, 0),f.getCell());
	}
}