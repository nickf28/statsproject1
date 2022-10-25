package GraphPlot;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class GraphSalter {

	public static File generateSalterGraph(File f, int range) throws IOException {
		File temp = f;

		Scanner sc = new Scanner(temp);

		FileWriter w = new FileWriter("SaltedGraph.csv");

		String[] currentLine = new String[2];

		Random r = new Random();

		// generates random double between 1 and range
		double bound = 1 + (range - 1) * r.nextDouble();
		boolean b;

		while (sc.hasNextLine()) {

			currentLine = sc.nextLine().split(",");

			String c1 = currentLine[0];
			double c2 = Double.valueOf(currentLine[1]);

			b = r.nextBoolean();

			if (b)
				c2 += bound;
			else
				c2 -= bound;

			w.write(c1 + "," + c2);
			w.write("\n");

		}

		sc.close();
		w.close();

		return temp;

	}

}
