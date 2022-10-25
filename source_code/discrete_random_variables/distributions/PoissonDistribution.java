package PoissonDist;

public class PoissonDistribution {

	public static double generatePoissonDist(int lambda, int y) {

		double num = Math.pow(lambda, y) * Math.pow(Math.E, -lambda);
		double denom = PandC.PandC.findFactorial(y);

		return num / denom;

	}

}
