package TotalProbAndBayes;

public class TotalProbTester {

	public static void main(String[] args) {
		// { a, b } as seen in double[][] a
		// where each a = p(a|bi) and b = p(bi)
		double[][] a = { { .4, .3 }, { .1, .3 }, { .7, .4 } };

		double b = TotalProb.generateTotalProb(a);
		double c = TotalProb.generateBayesRule(.4, .8, a);
		System.out.println(b);
		System.out.println(c);
	}

}
