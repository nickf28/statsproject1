package sets;

import java.util.ArrayList;
import java.util.Collections;

public class SetOperations {

	private ArrayList<Integer> nums;
	private ArrayList<Integer> sub1;
	private ArrayList<Integer> sub2;

	// generates default ArrayList values if none are specified
	public SetOperations() {
		nums = new ArrayList<>();
		sub1 = new ArrayList<>();
		sub2 = new ArrayList<>();

		nums.add(0);
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		nums.add(6);
		nums.add(7);
		nums.add(8);
		nums.add(9);

		sub1.add(4);
		sub1.add(7);
		sub1.add(9);
		sub1.add(8);

		sub2.add(3);
		sub2.add(8);
		sub2.add(4);
		sub2.add(2);

	}

	public SetOperations(ArrayList<Integer> nums, ArrayList<Integer> sub1, ArrayList<Integer> sub2) {
		this.nums = nums;
		this.sub1 = sub1;
		this.sub2 = sub2;
	}

	// method to print original sets to console
	public void displaySets() {
		System.out.println("Universal set: " + nums.toString());
		System.out.println("Subset 1: " + sub1.toString());
		System.out.println("Subset 2: " + sub2.toString() + "\n");
	}

	// calculates the union between sets sub1 and sub2
	public ArrayList<Integer> calculateUnion() {
		ArrayList<Integer> result = new ArrayList<>();

		for (int i = 0; i < sub1.size(); i++) {
			int currentVal = sub1.get(i);
			if (!result.contains(currentVal)) {
				result.add(currentVal);
			}
		}

		for (int i = 0; i < sub2.size(); i++) {
			int currentVal = sub2.get(i);
			if (!result.contains(currentVal)) {
				result.add(currentVal);
			}
		}

		return result;

	}

	// calculates the intersection between sets sub1 and sub2
	public ArrayList<Integer> calculateIntersection() {
		ArrayList<Integer> result = new ArrayList<>();

		for (int i = 0; i < nums.size(); i++) {

			if (sub1.contains(i) && sub2.contains(i)) {
				result.add(i);
			}

		}

		return result;

	}

	// calculates the complement between a given universal set (the "uSet"
	// parameter) and either set sub1 or sub 2.
	// (If set = true, then sub1 is used against the universal set, if set = false,
	// then sub2 is used.)
	public ArrayList<Integer> calculateComplementCustom(ArrayList<Integer> uSet, boolean set) {
		ArrayList<Integer> result = new ArrayList<>(uSet);
		Collections.copy(result, uSet);

		if (set) {
			for (int i = 0; i < sub1.size(); i++) {
				int currentVal = sub1.get(i);
				if (sub1.contains(currentVal))
					result.remove((Object) currentVal);
			}
		} else {
			for (int i = 0; i < sub2.size(); i++) {
				int currentVal = sub2.get(i);
				if (sub2.contains(currentVal))
					result.remove((Object) currentVal);
			}
		}

		return result;

	}

	// same method as above except the "nums" ArrayList initialized in constructor
	// is used
	public ArrayList<Integer> calculateComplement(boolean set) {
		ArrayList<Integer> result = new ArrayList<>(nums);
		Collections.copy(result, nums);

		if (set) {
			for (int i = 0; i < sub1.size(); i++) {
				int currentVal = sub1.get(i);
				if (sub1.contains(currentVal))
					result.remove((Object) currentVal);
			}
		} else {
			for (int i = 0; i < sub2.size(); i++) {
				int currentVal = sub2.get(i);
				if (sub2.contains(currentVal))
					result.remove((Object) currentVal);
			}
		}

		return result;

	}

}
