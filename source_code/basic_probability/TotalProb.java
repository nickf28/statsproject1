package TotalProbAndBayes;

public class TotalProb {

	public static double generateTotalProb(double[][] a) {
		double sum = 0;

		for (int i = 0; i < a.length; i++) {
			double leftElement = a[i][0];
			double rightElement = a[i][1];

			sum += leftElement * rightElement;

		}

		return sum;

	}

	public static double generateBayesRule(double aGivenB, double b, double[][] a) {
		double num = aGivenB * b;
		double denom = generateTotalProb(a);

		return num / denom;

	}

}
