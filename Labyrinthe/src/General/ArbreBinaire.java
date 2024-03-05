package General;

public class ArbreBinaire extends Generator {

	public ArbreBinaire(int x, int y) {
		super(x, y);

	}

	/** generate the Labyrinthe */

	public void generateLabyr() {
		for (int i = 0; i < labyr.getWidth(); i++) {
			for (int j = 0; j < labyr.getHeigth(); j++) {
				if (Math.random() < 0.5)
					this.deleteWall(i, j, Orientation.East);
				else
					this.deleteWall(i, j, Orientation.South);
			}
		}
	}

	/**
	 * delete a wall
	 * 
	 * @param x the width of the cellule
	 * @param y the height of the celulle
	 * @param o the orientation
	 */

	public void deleteWall(int x, int y, Orientation o) {

		if (this.getLabyr().getValue(o, x, y) && o.equals(Orientation.East) && !this.labyr.isBorderEast(x, y)) {
			this.getLabyr().removeWall(o, x, y);
			this.getLabyr().removeWall(Orientation.West, x, y + 1);
			this.getLabyr().addWall(o, x, y);
			this.getLabyr().addWall(Orientation.West, x, y + 1);
		}
		if (this.labyr.isBorderEast(x, y) && !this.labyr.isLastBorder(x, y)) {
			this.getLabyr().removeWall(Orientation.South, x, y);
			this.getLabyr().addWall(Orientation.South, x, y);
			this.getLabyr().removeWall(Orientation.North, x + 1, y);
			this.getLabyr().addWall(Orientation.North, x + 1, y);
		}

		if (this.getLabyr().getValue(o, x, y) && o.equals(Orientation.South) && !this.labyr.isBorderSouth(x, y)) {
			this.getLabyr().removeWall(o, x, y);
			this.getLabyr().removeWall(Orientation.North, x + 1, y);
			this.getLabyr().addWall(o, x, y);
			this.getLabyr().addWall(Orientation.North, x + 1, y);
		}
		if (this.labyr.isBorderSouth(x, y) && !this.labyr.isLastBorder(x, y)) {
			this.getLabyr().removeWall(Orientation.East, x, y);
			this.getLabyr().addWall(Orientation.East, x, y);
			this.getLabyr().removeWall(Orientation.West, x, y + 1);
			this.getLabyr().addWall(Orientation.West, x, y + 1);
		}

	}

}
