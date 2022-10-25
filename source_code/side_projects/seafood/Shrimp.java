package seafood;

public class Shrimp extends Seafood {

	private String type;

	public Shrimp(double weight, double pricePerPound) {
		super(weight, pricePerPound);
		type = "Shrimp";
	}

	public String getType() {
		return type;
	}

}
