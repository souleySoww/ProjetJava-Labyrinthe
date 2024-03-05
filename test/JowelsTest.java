import static org.junit.Assert.*;

import org.junit.*;

import Character.Hero;
import General.Cellule;
import Objet.Jowels;
import java.util.*;

public class JowelsTest {

@Test
public void JowelsTest(){

        Cellule c = new Cellule(1,3);
        Jowels j = new Jowels(c, 55);
        assertSame(55, j.getGold());
        assertSame(c, j.getCell());

}

@Test
public void setGoldTest(){

    Cellule c = new Cellule(1,3);
    Jowels j = new Jowels(c, 55);
    j.setGold(58);
    assertSame(58, j.getGold());

}


@Test

public void getGoldTest(){

    Cellule c = new Cellule(1,3);
    Jowels j = new Jowels(c, 55);
    assertSame(55, j.getGold());

}

@Test
public void useTest(){
    Cellule c = new Cellule(1,3);
    Hero h = new Hero("Annie",c);
    Jowels j = new Jowels(c,5);
    assertSame(0,h.getGold());
    j.use(h);
    assertEquals(5,h.getGold());


}

}

