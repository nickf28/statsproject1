package ConditionalProbability;

public class ConditionalProbTester {

	public static void main(String[] args) {
		double a = ConditionalProb.generateConditionalProb(.25, .6);
		double b = ConditionalProb.generateConditionalProbIndependant(.25, .6);
		System.out.println(a);
		System.out.println(b);
	}

}
