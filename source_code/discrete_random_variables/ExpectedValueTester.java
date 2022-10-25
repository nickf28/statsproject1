package discreteRandomVars;

public class ExpectedValueTester {

	public static void main(String[] args) {
		int[] yVals = { 1, 2 };
		double[] prob = { 0.2, 0.7 };

		System.out.println(ExpectedValue.findE(yVals, prob));
	}

}
