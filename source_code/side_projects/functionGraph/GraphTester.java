package GraphPlot;

import java.io.File;
import java.io.IOException;

public class GraphTester {

	public static void main(String[] args) throws IOException {
		File cubicEquation = FormulaGraph.valuesToCSV(new File("myGraph.csv"), 2, 3, 4, 2, 500);
		File saltedEquation = GraphSalter.generateSalterGraph(cubicEquation, 5);

		// Reference the readme in the excel_graphs folder regarding graph smoother
		GraphSmoother.generateSmoothGraph(saltedEquation, 3);

	}

}
