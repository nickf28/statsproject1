package seafood;

public class Crab extends Seafood {

	private String type;

	public Crab(double weight, double pricePerPound) {
		super(weight, pricePerPound);
		type = "Crab";
	}

	public String getType() {
		return type;
	}

}
