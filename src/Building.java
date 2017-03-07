import java.util.Random;
import java.util.Scanner;

/**
 * Created by Robert on 3/6/17.
 */
public class Building {
	public static void main(String[] args) {
		boolean building = false;
		System.out.println("Do you wish to set up the building? Y or N.");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int i = 0;
		int hallsAlarms = 0;
		int hallsFirePull = 0;
		int classroomAlarms = 0;
		int classroomFirePull = 0;
		int cafeteriaAlarms = 0;
		int cafeteriaFirePull = 0;
		int hallsSprinkler = 0;
		int classroomSprinkler = 0;
		int cafeteriaSprinkler = 0;
		String input1 = null;
//Start Sim
		if (input.equals("Y")) {
//Building mode
			building = true;
			while (building == true) {
//Building Area Selection
				System.out.println("Enter an action: MAKE ALARM, MAKE FIRE PULL, or MAKE SPRINKLER. You can also enter STOP BUILDING.");
				input1 = scanner.nextLine();
//Make Alarm
				if (input1.equals("MAKE ALARM")) {
					boolean makeAlarm = true;
					while (makeAlarm == true) {
						System.out.println("Where to construct Alarm? HALL, CLASSROOM, or CAFETERIA");
						String input2 = scanner.nextLine();
//Alarm Hall
						if (input2.equals("HALL")) {
							hallsFirePull++;
							if (hallsAlarms > 1) {
								System.out.println("Cannot make any more alarms in the HALL");
								hallsAlarms--;
								makeAlarm = false;
							}
							Alarm hall = new Alarm(input2);
							makeAlarm = false;
						}
//Alarm Classroom
						if (input2.equals("CLASSROOM")) {
							classroomAlarms++;
							if (hallsAlarms > 1) {
								System.out.println("Cannot make any more alarms in the CLASSROOM");
								classroomAlarms--;
								makeAlarm = false;
							}
							Alarm Classroom = new Alarm(input2);
							makeAlarm = false;
						}
//Alarm Cafeteria
						if (input2.equals("CAFETERIA")) {
							cafeteriaAlarms++;
							if (cafeteriaAlarms > 1) {
								System.out.println("Cannot make any more alarms in the CAFETERIA");
								cafeteriaAlarms--;
								makeAlarm = false;
							}
							Alarm Cafeteria = new Alarm(input2);
							makeAlarm = false;
						}
					}
					scanner.reset();
				}
//Make Fire Pull
				if (input1.equals("MAKE FIRE PULL")) {
					boolean makeFirePull = true;
					while (makeFirePull == true) {
						System.out.println("Where to construct Fire Pull? HALL, CLASSROOM, or CAFETERIA");
						String input2 = scanner.nextLine();
//Hall Fire Pull
						if (input2.equals("HALL")) {
							hallsFirePull++;
							if (hallsAlarms > 1) {
								System.out.println("Cannot make any more fire pulls in the HALL");
								hallsFirePull--;
								makeFirePull = false;
							}
							FirePull Hall = new FirePull(input2);
							makeFirePull = false;
						}
//Classroom Fire Pull
						if (input2.equals("CLASSROOM")) {
							classroomFirePull++;
							if (classroomFirePull > 1) {
								System.out.println("Cannot make any more fire pulls in the CLASSROOM");
								classroomFirePull--;
								makeFirePull = false;
							}
							FirePull Classroom = new FirePull(input2);
							makeFirePull = false;
						}
//Cafeteria Fire Pull
						if (input2.equals("CAFETERIA")) {
							cafeteriaFirePull++;
							if (classroomFirePull > 1) {
								System.out.println("Cannot make any more fire pulls in the CAFETERIA");
								classroomFirePull--;
								makeFirePull = false;
							}
							FirePull Cafeteria = new FirePull(input2);
							makeFirePull = false;
						}
					}
					scanner.reset();
				}
				if (input1.equals("MAKE SPRINKLER")) {
					boolean makeSprinkler = true;
					while (makeSprinkler == true) {
						System.out.println("Where to construct Sprinkler? HALL, CLASSROOM, or CAFETERIA");
						String input2 = scanner.nextLine();
//Sprinkler Hall
						if (input2.equals("HALL")) {
							hallsSprinkler++;
							if (hallsSprinkler > 1) {
								System.out.println("Cannot make any more sprinklers in the HALL");
								hallsSprinkler--;
								makeSprinkler = false;
							}
							Sprinkler Hall = new Sprinkler(input2);
							makeSprinkler = false;
						}
//Sprinkler Classroom
						if (input2.equals("CLASSROOM")) {
							classroomSprinkler++;
							if (classroomSprinkler > 1) {
								System.out.println("Cannot make any more sprinklers in the CLASSROOM");
								classroomSprinkler--;
								makeSprinkler = false;
							}
							Sprinkler Classroom = new Sprinkler(input2);
							makeSprinkler = false;
						}
//Sprinkler Cafeteria
						if (input2.equals("CAFETERIA")) {
							cafeteriaSprinkler++;
							if (classroomSprinkler > 1) {
								System.out.println("Cannot make any more sprinklers in the CAFETERIA");
								classroomSprinkler--;
								makeSprinkler = false;
							}
							Sprinkler Cafeteria = new Sprinkler(input2);
							makeSprinkler = false;
						}
					}
					scanner.reset();
				}
				if (input1.equals("STOP BUILDING")){
					building = false;
				}
			}
//Simulation Start
			scanner.reset();
			boolean sim = true;
			while (sim == true) {
				System.out.println("Entering Simulation");
				System.out.println("Do you wish to test the Fire System? Y or N.");
				String input3 = scanner.nextLine();
				String choice = null;
				int time = 0;
				if (input3.equals("Y")) {
					Random random = new Random();
					int rand = random.nextInt(2);
					if (rand == 0) {
						choice = "HALL";
					}
					if (rand == 1) {
						choice = "CAFETERIA";
					}
					if (rand == 2) {
						choice = "CLASSROOM";
					}
					System.out.println("Fire set in " + choice);
					System.out.println("Time is " + time);
					if (choice.equals(Sprinkler.getLoc())) {
						System.out.println("Fire will set off Sprinkler in " + choice);
						Sprinkler.getLoc
					}
				}
				if (input3.equals("N")) {
					sim = false;
					System.out.println("Ending");
				}
			}
		}
		if (input.equals("N")) {
			System.out.println("Ending");
		} else {
			System.out.println("Issue?: ERROR! Ending");
		}
	}
}

