package binomialDist;

public class BinomialDistribution {

	public static double calculateBinomialDist(int n, int y, double p) {
		double q = 1 - p;

		return PandC.PandC.calculateCombination(n, y) * Math.pow(p, y) * Math.pow(q, n - y);
	}

}
