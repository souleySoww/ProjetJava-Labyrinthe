import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;
import Character.Hero;
import General.*;
import Objet.Jowels;
import Objet.Objet;

public class HeroTest {

	@Test
	public void CreationHeroTest() {
		Cellule c = new Cellule(2, 4);
		Hero h = new Hero("Peter", c);
		List<Objet> l1 = new ArrayList<Objet>();
		assertSame(0, h.getGold());
		assertSame(c, h.getCell());
		assertEquals("Peter", h.getName());
		assertEquals(l1, h.getObject());
	}

	@Test
	public void getCellTest() {

		Cellule c = new Cellule(2, 4);
		Hero h = new Hero("Peter", c);
		assertSame(c, h.getCell());
	}

	@Test
	public void getNameTest() {

		Cellule c = new Cellule(2, 4);
		Hero h = new Hero("Peter", c);
		assertEquals("Peter", h.getName());
	}

	@Test
	public void getGoldTest() {

		Cellule c = new Cellule(2, 4);
		Hero h = new Hero("Peter", c);
		assertSame(00, h.getGold());
	}

	@Test
	public void getObjectTest() {
		Cellule c = new Cellule(4, 5);
		Hero h = new Hero("Peter", c);
		List<Objet> l = h.getObject();
		List<Objet> l1 = new ArrayList<Objet>();
		assertEquals(l, l1);

	}

	@Test
	public void removeObjectTest() {
		Cellule c = new Cellule(4, 5);
		Hero h = new Hero("Peter", c);
		Jowels j = new Jowels(c, 20);
		assertTrue(h.getObject().isEmpty());
		h.getObject().add(j);
		assertTrue(h.getObject().contains(j));
		h.removeObject(j);
		assertFalse(h.getObject().contains(j));

	}

	@Test
	public void addObjectTest() {
		Cellule c = new Cellule(4, 5);
		Hero h = new Hero("Peter", c);
		Jowels j = new Jowels(c, 20);
		assertFalse(h.getObject().contains(j));
		h.addObject(j);
		assertTrue(h.getObject().contains(j));

	}

	@Test
	public void moveTest() {
		Cellule c = new Cellule(4, 5);
		Hero h = new Hero("Peter", c);

		h.setCellule(c);

		assertEquals(c, h.getCell());
		Cellule c1 = new Cellule(4, 6);
		h.move(c1);
		assertEquals(c1, h.getCell());

	}

	@Test
	public void setGoldTest(){
		Cellule c = new Cellule(4, 5);
		Hero h = new Hero("Peter", c);
		int gold = 5 ;
		assertEquals(gold,h.getGold());
		h.setGold(gold) ;
		assertEquals(gold,h.getGold()) ;
		
	}

}
