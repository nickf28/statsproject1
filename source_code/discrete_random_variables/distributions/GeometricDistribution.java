package geometricDist;

import PandC.PandC;

public class GeometricDistribution {

	public static double calculateGeoDist(double p, int y) {

		double q = 1 - p;

		return (Math.pow(q, y - 1) * p);

	}

	public static double calculateHyperGeoDist(int bigN, int n, int r, int y) {

		double num = PandC.calculateCombination(r, y) * PandC.calculateCombination(bigN - r, n - y);

		double denom = PandC.calculateCombination(bigN, n);

		return num / denom;

	}

}
