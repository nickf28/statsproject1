package seafood;

public class Seafood {

	private double weight; // (in pounds)
	private double pricePerPound;
	private String type;

	public Seafood(double weight, double pricePerPound) {
		this.weight = weight;
		this.pricePerPound = pricePerPound;
		type = null;
	}

	public double getWeight() {
		return this.weight;
	}

	public double getPricePerPound() {
		return this.pricePerPound;
	}

	public String getType() {
		return type;
	}

}
