/**
 * Created by Robert on 3/6/17.
 */
public class Sprinkler {
	boolean isSprinkling;
	static String location;
	public Sprinkler(String newLocation){
		location = newLocation;
		isSprinkling = false;
	}
	public static String getLoc(){
		return location;
	}
	public void setSprinkling(boolean sprinkling){
		isSprinkling = sprinkling;
	}
}
