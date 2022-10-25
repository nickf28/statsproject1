package ConditionalProbability;

public class ConditionalProb {

	public static double generateConditionalProb(double aIntersectB, double b) {

		return aIntersectB / b;

	}

	// P(A intersect B) = P(A)*P(B) is what I am trying to accomplish here, not sure
	// if this is correct though
	public static double generateConditionalProbIndependant(double a, double b) {

		return a * b;

	}

}
