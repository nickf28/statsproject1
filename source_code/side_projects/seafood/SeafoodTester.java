package seafood;

public class SeafoodTester {

	public static void main(String[] args) {
		String[] arr = FishMarket.exportToCSV("test", 2, 88);
		System.out.println(FishMarket.toString(arr));
	}

}
