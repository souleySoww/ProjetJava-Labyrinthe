import static org.junit.Assert.*;

import org.junit.Test;

import General.Cellule;
import Other.Other;
import Character.Character;

import java.util.*;
public class CharacterTest{

@Test
public void Character(){

    Cellule c = new Cellule(1,3);
    Character ch = new Other("John", c,"test");
    assertEquals("John", ch.getName());
    assertSame(c, ch.getCell());
}
@Test

 public void getCellTest(){

 Cellule c = new Cellule(1,3);
 Character ch = new Other("John", c, "test");
 assertSame(c, ch.getCell());
 }

 @Test
 public void getNameTest(){

Cellule c = new Cellule(1,3);
Character ch = new Other("John", c,"test"); 
assertEquals("John", ch.getName());

     }





}
