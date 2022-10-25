package lawsOfProb;

public class TwoLawsofProb {

	public static double multLaw(double a, double BGivenA) {
		return a * BGivenA;
	}

	public static double multLawIndependant(double a, double b) {
		return a * b;
	}

	public static double addLaw(double a, double b, double AintersectB) {
		return a + b - AintersectB;
	}

	public static double addLawIndependant(double a, double b) {
		return a + b;
	}
}
