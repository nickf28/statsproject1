package PandC;

public class PandC {

	// helper function to find factorial
	public static int findFactorial(int a) {
		int temp = 1;

		for (int i = 1; i <= a; i++) {
			temp *= i;
		}

		return temp;

	}

	public static double calculateCombination(int n, int r) {
		int num = findFactorial(n);
		int denom = findFactorial(r) * findFactorial(n - r);

		return num / denom;

	}

	public static double calculatePermutation(int n, int r) {
		int num = findFactorial(n);
		int denom = findFactorial(n - r);

		return num / denom;

	}

}
