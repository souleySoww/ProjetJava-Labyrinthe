import static org.junit.Assert.assertEquals;

import org.junit.Test;

import General.Cellule;
import Objet.Parchment;

public class ParchmentTest {
    
    @Test
    public void ParchmentCreationTest(){
        Cellule c = new Cellule(1,4) ;
        Parchment p = new Parchment(c,"un parchemin") ;
        assertEquals("un parchemin", p.getContent());
        p.setContent("un autre parchemin");
        assertEquals("un autre parchemin",p.getContent());

    }

    @Test
    public void getContentTest(){
        Cellule c = new Cellule(1,4) ;
        Parchment p = new Parchment(c,"un parchemin") ; 
        assertEquals("un parchemin", p.getContent());
    }

    @Test
    public void setContentTest(){
        Cellule c = new Cellule(1,4) ;
        Parchment p = new Parchment(c,"un parchemin") ; 
        p.setContent("un autre parchemin");
        assertEquals("un autre parchemin",p.getContent());
    
    }
}
