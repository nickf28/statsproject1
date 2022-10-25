package Tchebysheff;

public class Tchebysheff {

	// This method will find percentage of values that fall between v1 and v2
	public static double Tche1(double mean, double SD, int v1, int v2) {

		double within = 0;

		if (Math.abs(mean - v1) == Math.abs(mean - v2)) {
			within = Math.abs(mean - v1);
		}

		double k = within / SD;

		return 1 - (1 / (k * k));

	}

	// This method will find the value of C such that P(|Y - 11| ≥ C) ≤ .09.(example
	// from textbook, will solve this type of problem)
	public static double Tche2(double SD, double value) {

		double k = Math.sqrt(1 / value);

		return k * SD;

	}

}
