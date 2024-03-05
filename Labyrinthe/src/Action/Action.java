package Action;
import General.Labyrinthe;


public abstract class Action {
	/**
	 * executes an action according to its type
	 * @param labyr
	 */
	public abstract void execute(Labyrinthe labyr) ;
	
	public abstract String toString();
}
