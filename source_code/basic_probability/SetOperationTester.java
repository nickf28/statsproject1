package sets;

import java.util.ArrayList;

public class SetOperationTester {

	public static void main(String[] args) {
		SetOperations myNums = new SetOperations();

		myNums.displaySets();
		System.out.println("Union: " + myNums.calculateUnion());
		System.out.println("Intersection: " + myNums.calculateIntersection());
		System.out.println("Complement: " + myNums.calculateComplement(true));

		ArrayList<Integer> temp = new ArrayList<>();
		temp.add(2);
		temp.add(5);
		temp.add(7);

		System.out.println("Custom Complement: " + myNums.calculateComplementCustom(temp, false));
	}

}
