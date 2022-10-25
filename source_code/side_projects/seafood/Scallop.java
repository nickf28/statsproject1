package seafood;

public class Scallop extends Seafood {

	private String type;

	public Scallop(double weight, double pricePerPound) {
		super(weight, pricePerPound);
		type = "Scallop";
	}

	public String getType() {
		return type;
	}

}
