import static org.junit.Assert.*;

import org.junit.*;

import General.Cellule;
import General.Orientation;

import java.util.*;

public class CelluleTest {

	@Test
	public void CelluleCreationTest() {
		Cellule c = new Cellule(1, 2);
		Map<Orientation, Boolean> test = new HashMap<Orientation, Boolean>();
		test.put(Orientation.North, true);
		test.put(Orientation.South, true);
		test.put(Orientation.East, true);
		test.put(Orientation.West, true);
		assertSame(1, c.getX());
		assertSame(2, c.getY());
		assertEquals(test, c.getWall());
	}

	@Test
	public void getValueTest() {
		Cellule c = new Cellule(1, 2);
		Boolean test = c.getValue(Orientation.North);
		assertTrue(test);
	}

	@Test
	public void getWallTest() {
		Cellule c = new Cellule(1, 2);
		Map<Orientation, Boolean> test = c.getWall();
		assertSame(test, c.getWall());
	}

	@Test
	public void removeWallTest() {
		Cellule c = new Cellule(1, 2);
		// supression d'un mur
		c.removeWall(Orientation.East);
		assertFalse(c.getWall().containsKey(Orientation.East));
	}

	@Test
	public void addWall() {
		Cellule c = new Cellule(1, 2);
		// l'ajout d'un mur
		c.addWall(Orientation.North, true);
		assertTrue(c.getWall().containsKey(Orientation.North));
	}

	@Test
	public void getXTest() {
		Cellule c = new Cellule(4, 6);
		int test = c.getX();
		assertSame(test, 4);
	}

	@Test
	public void getYTest() {
		Cellule c = new Cellule(4, 6);
		int test = c.getY();
		assertSame(test, 6);
	}

	@Test
	public void openTest() {
		Cellule c = new Cellule(4, 6);
		c.removeWall(Orientation.South);
		c.removeWall(Orientation.West);
		c.addWall(Orientation.South, false);
		c.addWall(Orientation.West, false);
		List<Orientation> test = new ArrayList<Orientation>();
		test.add(Orientation.South);
		test.add(Orientation.West);

		assertEquals(test, c.open());

	}
}
