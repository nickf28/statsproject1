package GraphPlot;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class GraphSmoother {

	public static void generateSmoothGraph(File f, int range) throws IOException {
		Scanner sc = new Scanner(f);

		FileWriter w = new FileWriter("SmoothGraph.csv");

		ArrayList<String[]> allLines = new ArrayList<>();

		while (sc.hasNextLine()) {
			allLines.add(sc.nextLine().split(","));
		}

		sc.close();

		double[] yVals = new double[allLines.size()];

		for (int a = 0; a < yVals.length; a++) {
			yVals[a] = Double.valueOf(allLines.get(a)[1]);
		}

		for (int i = 0; i < allLines.size(); i++) {
			String c1 = allLines.get(i)[0];

			double sum = 0;

			for (int j = -range; j < range; j++) {
				if (j != 0 && i + j > 0 && i + j < 21) {
					sum += yVals[i + j];
				}
			}

			double newC2 = sum / (range * 2);

			w.write(c1 + "," + newC2);
			w.write("\n");

		}

		w.close();

	}

}
