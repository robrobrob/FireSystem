/**
 * Created by Robert on 3/6/17.
 */
public class FirePull {
	boolean isPulled;
	static String location;
	public FirePull(String newLocation){
		location = newLocation;
		isPulled = false;
	}
	public static String getLoc(){
		return location;
	}
}
