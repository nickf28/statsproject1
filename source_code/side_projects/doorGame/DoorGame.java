package doorgame;

import java.util.Random;

public class DoorGame {

	public static String playnoChange(int choice) {
		int count = 0;

		Random r = new Random();

		for (int i = 1; i <= 10000; i++) {
			// generates which door has the prize, 1, 2, or 3
			int prizeDoor = r.nextInt(3) + 1;

			// in this case, door 2 has the prize
			if (choice == prizeDoor) {
				count++;
			}

		}

		// returns amount of times door was picked correctly as a percentage
		double percent = (count * 100) / 10000;
		return percent + "%";

	}

	public static String playwithChange() {
		int count = 0;

		// NOTE: I kind of struggled with this one a little bit. For this for loop, I
		// used this source for help:
		// https://introcs.cs.princeton.edu/java/13flow/MonteHall.java.html

		for (int i = 0; i < 10000; i++) {
			int choice = (int) (3 * Math.random());
			int prizeDoor = (int) (3 * Math.random());

			int tempDoor;

			do {
				tempDoor = (int) (3 * Math.random());
			} while ((tempDoor == choice) || (tempDoor == prizeDoor));

			int otherDoor = 3 - tempDoor - choice;

			if (otherDoor == prizeDoor) {
				count++;
			}

		}

		// returns amount of times door was picked correctly as a percentage
		double percent = (count * 100) / 10000;
		return percent + "%";

	}

}
