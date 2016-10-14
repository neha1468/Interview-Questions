package com.sample.proj1;

public class Prime {

	public static void main(String[] args) {
		Prime h = new Prime();
		int[] prime = new int[10001];
		prime[0] = 2;
		prime[1] = 3;

		int i = 2;
		int j = 4;
		while (true) {
			boolean isNum = h.isPrime(j);
			if (isNum) {
				prime[i] = j;
				i++;
				System.out.println("Prime " + i + " =" + j);
			}
			if (i < 10001) {
				j++;
			} else {
				System.out.println("Prime : 10001 = " + prime[10000]);
				break;
			}

		}

	}

	public static boolean isPrime(int num) {
		if (num > 2 && num % 2 == 0) {
			System.out.println(num + " is not prime");
			return false;
		}
		int approxSqrt = 0;
		for (approxSqrt = 1; approxSqrt * approxSqrt <= num; approxSqrt++)
		for (int i = 3; i < approxSqrt; i += 2) {
			if (num % i == 0) {
				System.out.println(num + " is not prime");
				return false;
			}
		}
		System.out.println(num + " is prime");
		return true;
	}

}
