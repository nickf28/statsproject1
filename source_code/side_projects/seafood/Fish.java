package seafood;

public class Fish extends Seafood {

	private String type;

	public Fish(double weight, double pricePerPound) {
		super(weight, pricePerPound);
		type = "Fish";
	}

	public String getType() {
		return type;
	}

}
