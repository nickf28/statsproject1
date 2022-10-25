package seafood;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class FishMarket {

	static String className;

	public static Seafood generateRandomSeafood(double lower, double upper) {

		Random r = new Random();
		Seafood out = null;

		int type = r.nextInt(4);
		double weight = lower + (upper - lower) * r.nextDouble();
		double pricePerPound = 100;

		if (type == 0) {
			out = new Fish(weight, pricePerPound);
			className = "Fish";
		}

		if (type == 1) {
			out = new Shrimp(weight, pricePerPound);
			className = "Shrimp";
		}

		if (type == 2) {
			out = new Scallop(weight, pricePerPound);
			className = "Scallop";
		}

		if (type == 3) {
			out = new Crab(weight, pricePerPound);
			className = "Crab";
		}

		return out;

	}

	// parameter String filename would be something like "myCSV"
	// The .csv extention is set by the parameter in FileWriter fw
	// lower, upper will generate different weights of seafood between the interval.
	// ex: 2, 88 would assign weights between 2 and 88 (inclusive).
	// This method creates and populates a new CSV file
	// and returns an array of the objects in the CSV file.
	public static String[] exportToCSV(String filename, double lower, double upper) {

		String[] arr = new String[301];

		File f = new File(filename);

		try (FileWriter w = new FileWriter(f + ".csv"); BufferedWriter bw = new BufferedWriter(w)) {

			bw.write("Index,Type,Weight,Price/Pound");
			bw.newLine();

			arr[0] = "Index, Type, Weight, Price/Pound";

			for (int i = 1; i <= 300; i++) {
				Seafood temp = generateRandomSeafood(lower, upper);

				// Here, if weight > 65, fish is caught. In the else statement, other types
				// would be added, including smaller fish under 65 pounds.
				if (temp.getWeight() > 65) {
					bw.write(i + "," + "Fish" + "," + temp.getWeight() + "," + temp.getPricePerPound());
					bw.newLine();

					arr[i] = i + ", Fish, " + (double) temp.getWeight() + ", " + temp.getPricePerPound();

				} else {
					bw.write(i + "," + className + "," + temp.getWeight() + "," + temp.getPricePerPound());
					bw.newLine();

					arr[i] = i + ", " + className + ", " + (double) temp.getWeight() + ", " + temp.getPricePerPound();
				}

			}

		} catch (IOException e) {
			System.err.println("IOException has occured.");
		}

		return arr;

	}

	public static String toString(String[] arr) {
		String out = "";

		for (int i = 0; i < arr.length; i++) {
			out += arr[i] + "\n";
		}

		return out;

	}

}
