package GraphPlot;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FormulaGraph {

	// cube root function y = a * cubeRoot(bx-h) + k

	public static File valuesToCSV(File f, int a, int b, int h, int k, int range) throws IOException {
		File temp = f;

		FileWriter w = new FileWriter(temp);

		double y;

		for (int i = -range; i <= range; i++) {
			y = a * Math.cbrt((b * i) - h) + k;
			w.write(i + "," + y);
			w.write("\n");
		}

		w.close();

		return temp;

	}

}
