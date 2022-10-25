package discreteRandomVars;

public class ExpectedValue {

	public static double findE(int[] yValues, double[] prob) {

		if (yValues.length != prob.length)
			System.err.println("Error: The two arrays are not equal length.");

		double out = 0;

		for (int i = 0; i < yValues.length; i++) {
			out += yValues[i] * prob[i];
		}

		return out;

	}

}
