import com.sun.tools.classfile.Dependency;

import java.util.Locale;

/**
 * Created by Robert on 3/6/17.
 */
public class Alarm {
	boolean isRinging;
	static String location;

	public Alarm(String newLocation){
		location = newLocation;
		isRinging = false;
	}
	public static String getLoc(){
		return location;
	}
	public static
}
