
import static org.junit.Assert.*;

import org.junit.*;

import General.ArbreBinaire;
import General.Orientation;

import java.util.*;

public class ArbreBinaireTest {

    @Test
    public void deleteWallTestEast(){
        ArbreBinaire test=new ArbreBinaire(15,15);
        assertTrue(test.getLabyr().getValue(Orientation.East,12,12));
        assertTrue(test.getLabyr().getValue(Orientation.West,12,13));
        test.deleteWall(12,12,Orientation.East);
        assertFalse(test.getLabyr().getValue(Orientation.East,12,12));
        assertFalse(test.getLabyr().getValue(Orientation.West,12,13));
    }

    @Test
    public void deleteWallTestSouth(){
        ArbreBinaire test=new ArbreBinaire(15,15);
        assertTrue(test.getLabyr().getValue(Orientation.South,12,12));
        assertTrue(test.getLabyr().getValue(Orientation.North,13,12));
        test.deleteWall(12,12,Orientation.South);
        assertFalse(test.getLabyr().getValue(Orientation.South,12,12));
        assertFalse(test.getLabyr().getValue(Orientation.North,13,12));
    }

    @Test
    public void deleteWallTestBorderEast(){
        ArbreBinaire test=new ArbreBinaire(15,15);
        assertTrue(test.getLabyr().getValue(Orientation.East,12,14));
        assertTrue(test.getLabyr().getValue(Orientation.West,12,14));
        test.deleteWall(12,14,Orientation.East);
        assertFalse(test.getLabyr().getValue(Orientation.South,12,14));
        assertTrue(test.getLabyr().getValue(Orientation.East,12,14));
    }

    public void deleteWallTestBorderSouth(){
        ArbreBinaire test=new ArbreBinaire(15,15);
        test.deleteWall(14,12,Orientation.South);
        assertTrue(test.getLabyr().getValue(Orientation.South,14,12));
        assertFalse(test.getLabyr().getValue(Orientation.East,14,12));
    }

    public void deleteWallTestLastBorder(){
        ArbreBinaire test=new ArbreBinaire(15,15);
        test.deleteWall(14,14,Orientation.South);
        test.deleteWall(14,14,Orientation.East);
        assertTrue(test.getLabyr().getValue(Orientation.South,14,14));
        assertTrue(test.getLabyr().getValue(Orientation.East,14,14));
    }

    
}
