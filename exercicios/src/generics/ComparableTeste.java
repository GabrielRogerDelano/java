package generics;

import java.util.TreeSet;

public class ComparableTeste {
	public static void main(String[] args) {
		TreeSet<Integer> nums = new TreeSet<>();
		nums.add(1);
		nums.add(0);
		nums.add(-31);
		nums.add(87);
		nums.add(1);
		nums.add(4);
		nums.add(-123);
		
		for(Integer n: nums) {
			System.out.println(n);
		}
	}
}
