package General;
import General.*;
import java.util.*;

public class Cellule {
	private int coordx;
	private int coordy;
	private Map<Orientation, Boolean> wall;

	public Cellule(int coordx, int coordy) {
		this.coordx = coordx;
		this.coordy = coordy;
		this.wall = new HashMap<>();
		this.wall.put(Orientation.North, true);
		this.wall.put(Orientation.South, true);
		this.wall.put(Orientation.East, true);
		this.wall.put(Orientation.West, true);

	}

	/**
	 * @return the width of a cellule
	 */

	public int getX() {
		return this.coordx;
	}

	public int setX(int x) {
		return this.coordx = x;
	}

	/**
	 * @return the height of a cellule
	 */

	public int getY() {
		return this.coordy;
	}

	public int setY(int y) {
		return this.coordy = y;
	}

	/**
	 * @return a wall
	 */
	public Map<Orientation, Boolean> getWall() {
		return this.wall;
	}

	public String toString() {
		return "(" + this.coordx + "," + this.coordy + ")";
	}

	/**
	 * @param o the orientation
	 * @return true if this wall exists
	 */

	public Boolean getValue(Orientation o) {
		return this.wall.get(o);
	}

	public List<Orientation> open() {

		List<Orientation> li = new ArrayList<>();
		for (Orientation o : this.getWall().keySet()) {

			if (!this.getValue(o)) {
				li.add(o);
			}
		}

		return li;
	}

	/**
	 * @param cell the cellule
	 * @return 1 if cell is neighbour East ,2 if cell is neighbour West ,3 if cell
	 *         is neighbour North ,4 if cell is neighbour South
	 */

	public int isNeighbour(Cellule cell) {
		int i = 0;
		if ((this.coordx - cell.getX()) == -1 && (this.coordy - cell.getY()) == 0) {
			i = 1;
		} else if ((this.coordx - cell.getX()) == 1 && (this.coordy - cell.getY()) == 0) {
			i = 2;
		} else if ((this.coordx - cell.getX()) == 0 && (this.coordy - cell.getY()) == 1) {
			i = 3;
		} else if ((this.coordx - cell.getX()) == 0 && (this.coordy - cell.getY()) == -1) {
			i = 4;
		}
		return i;
	}

	/**
	 * @param orientation o
	 */

	public void removeWall(Orientation o) {
		this.getWall().remove(o);
	}

	/**
	 * @param o the orientation
	 * @param b a boolean
	 */

	public void addWall(Orientation o, Boolean b) {
		this.getWall().put(o, b);
	}

}
