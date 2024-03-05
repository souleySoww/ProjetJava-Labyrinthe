import static org.junit.Assert.*;
import org.junit.Test;
import General.Cellule;
import Objet.Objet;
import Objet.Parchment;



public class ObjetTest{
    @Test
    public void ObjetTest(){

        Cellule c = new Cellule(1,3);
        Objet o = new Parchment(c, "content");
        assertSame(c,o.getCell());
    }
    
    @Test
    public void getCell(){
        Cellule c = new Cellule(1,3);
        Objet o = new Parchment(c, "content");
        Cellule c1 = o.getCell();
        assertEquals(c,c1);



    }
    
}


