import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;
import org.junit.validator.PublicClassValidator;

import General.Cellule;
import Objet.Jowels;
import Other.Marchand;

public class MarchantTest {

	@Test
	public void CreationMarchandTest() {
		Cellule c = new Cellule(1,2);
		Marchand m = new Marchand("Test",c,"Dernier");
		assertEquals(0,m.getOr());
		assertEquals("Test",m.getName());
		assertEquals("Dernier",m.getIndice());
		assertEquals(c,m.getCell());
		
	}
	@Test
	public void setOrTest(int or){
		Cellule c = new Cellule(1,3);
		Marchand m =new Marchand("John", c,"Dernier");
		assertEquals(0,m.getOr());
		m.setOr(10);
		assertEquals(10,m.getOr());
	}

	@Test
	public void getOrTest(){
		Cellule c = new Cellule(1, 3);
		Marchand m = new Marchand("Peter",c,"Dernier");
		assertEquals(0,m.getOr());
	}
}
