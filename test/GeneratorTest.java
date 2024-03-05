import static org.junit.Assert.*;

import org.junit.Test;
import Character.Hero;
import General.ArbreBinaire;
import General.Generator;
import Character.Hero;
import General.Cellule;
import General.Labyrinthe;





public class GeneratorTest {
	/*
	 * @Test
	 * public void getLabyrTest() {
	 * Generator g = new Generator(3,4) ;
	 * assertEquals(g.labyr,g.getLabyr());
	 * }
	 */

	@Test
	public void getLabyrTest() {

		Generator g = new ArbreBinaire(10, 10);
		Labyrinthe l = g.getLabyr();
		assertEquals(l, g.getLabyr());

	}


	@Test
	public void getHeroTest() {
		Labyrinthe labyr = new Labyrinthe(4, 4);
		Cellule c =labyr.getCell(3, 2);
		Hero h = new Hero("John", c);
		labyr.setHero(h);
		Hero h1 = labyr.getHero();
		assertEquals(h, h1);

	}
	
	@Test 
	public void getCellTest(){
	Labyrinthe lab = new Labyrinthe(9, 9);
	Cellule c =lab.getCell(3, 3) ;
	Hero h = new Hero("Hero", c);
	lab.setHero(h);
	assertSame(c, lab.getHero().getCell());


	}

	
}
