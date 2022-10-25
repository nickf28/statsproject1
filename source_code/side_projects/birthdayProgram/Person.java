package birthday;

import java.util.ArrayList;
import java.util.Random;

public class Person {

	private int bmonth, bday;

	public Person(int bmonth, int bday) {
		this.bmonth = bmonth;
		this.bday = bday;
	}

	public int getBmonth() {
		return bmonth;
	}

	public int getBday() {
		return bday;
	}

	// helper method, returns true if Person a and Person b share the same birthday
	private static boolean compareTo(Person a, Person b) {
		boolean result = false;

		if (a.getBday() == b.getBday() && a.getBmonth() == b.getBmonth()) {
			result = true;
		}

		return result;
	}

	public static String calculateProbability(int classSize) {
		ArrayList<Person> plist = new ArrayList<>();
		Random r = new Random();

		// keeps track of number of similarities
		int hits = 0;

		for (int i = 0; i < classSize; i++) {
			int randombmonth = r.nextInt(12) + 1;
			int randombday = r.nextInt(30) + 1;

			plist.add(new Person(randombmonth, randombday));
		}

		for (int i = 0; i < plist.size(); i++) {
			for (int j = i + 1; j < plist.size(); j++) {
				Person p1 = plist.get(i);
				Person p2 = plist.get(j);

				if (compareTo(p1, p2)) {
					hits++;
				}

			}

		}

		double percent = (hits * 100) / classSize;
		return percent + "%";

	}

	// additional method I added that will average the probabilities over running a
	// certain amount of iterations
	public static String calculateAverageProbability(int classSize, int iterations) {

		String s = "";
		double sum = 0.0;

		for (int i = 0; i < iterations; i++) {
			s = calculateProbability(classSize);
			s = s.replace("%", "");

			sum += Double.valueOf(s);

		}

		double average = sum / iterations;

		return average + "%";

	}

}
