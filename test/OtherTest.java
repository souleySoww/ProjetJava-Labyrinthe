import static org.junit.Assert.assertEquals;

import org.junit.Test;

import General.Cellule;
import Other.Other;

public class OtherTest {
    
    @Test
    public void OtherCreationCreatonTest(){
        Cellule c = new Cellule(1,4) ;
        Other o = new Other("other", c, "blablabla") ;
        assertEquals("blablabla",o.getIndice());

        o.setIndice("blabla");
        assertEquals("blabla",o.getIndice());

    }

    @Test
    public void getIndiceTest(){
        Cellule c = new Cellule(1,4) ;
        Other o = new Other("other", c, "blablabla") ;
        assertEquals("blablabla",o.getIndice());
        
    }

    @Test
    public void setIndiceTest(){
        Cellule c = new Cellule(1,4) ;
        Other o = new Other("other", c, "blablabla") ;
        o.setIndice("blabla");
        assertEquals("blabla",o.getIndice());
        
    }

}
