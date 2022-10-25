package binomialDist;

public class BinomialDistTester {

	public static void main(String[] args) {
		double b = BinomialDistribution.calculateBinomialDist(10, 5, .5);
		System.out.println(b);
	}

}