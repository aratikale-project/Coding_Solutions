package com.in;

public class Perfect_Number {
	private static boolean isPerfect(int x) {
		int sum = 0;
		for (int i = 1; i < x/2; i++) {
			if (x % i == 0) {
				sum = sum + i;
			} else {
				continue;
			}
		}
		if (sum == x) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {

		for (int n = 1; n <= 500; n++) {
			if (isPerfect(n)) {
				System.out.println(n);
			}
		}

	}

}
