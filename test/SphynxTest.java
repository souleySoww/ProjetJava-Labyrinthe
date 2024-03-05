import static org.junit.Assert.*;

import org.junit.Test;

import General.Cellule;
import Other.Sphynx;

public class SphynxTest {

	 @Test
		public void SphynxCreationTest(){
	        Cellule c = new Cellule(1,4) ;
	        Sphynx sphynx = new Sphynx("sphynx",c,"bla-bla","combien de goute d'eau pour remplir un verre vide", "une seule suffit");
	        assertEquals("combien de goute d'eau pour remplir un verre vide",sphynx.getEnigm());
	        assertEquals("sphynx", sphynx.getName());
	        assertEquals("une seule suffit",sphynx.getAnswer());

	        sphynx.setEnigm("2+3 ?");
	        assertEquals("2+3 ?", sphynx.getEnigm());

	        sphynx.setAnswer("5");
	        assertEquals("5", sphynx.getAnswer());
	    
	    }
	    

	    @Test
		public void getEnigmTest() {
	        Cellule c = new Cellule(1,4) ;
	        Sphynx sphynx = new Sphynx("sphynx",c,"bla-bla","combien de goute d'eau pour remplir un verre vide", "une seule suffit");

	        assertEquals("combien de goute d'eau pour remplir un verre vide",sphynx.getEnigm());



	    }


	    @Test
		public void getAnswerTest() {
	        Cellule c = new Cellule(1,4) ;
	        Sphynx sphynx = new Sphynx("sphynx",c,"bla-bla","combien de goute d'eau pour remplir un verre vide", "une seule suffit");
	        assertEquals("une seule suffit",sphynx.getAnswer());
	    }

	    @Test
		public void setEnigmTest() {
	        Cellule c = new Cellule(1,4) ;
	        Sphynx sphynx = new Sphynx("sphynx",c,"bla-bla","combien de goute d'eau pour remplir un verre vide", "une seule suffit");
	        sphynx.setEnigm("2+3 ?");
	        assertEquals("2+3 ?", sphynx.getEnigm());

	        
	    }

	    @Test
	    public void setAnswerTest() {
	        Cellule c = new Cellule(1,4) ;
	        Sphynx sphynx = new Sphynx("sphynx",c,"bla-bla","combien de goute d'eau pour remplir un verre vide", "une seule suffit");
	        sphynx.setAnswer("5");
	        assertEquals("5", sphynx.getAnswer());
	    

	    }



	}




