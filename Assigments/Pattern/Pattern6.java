class Pattern6 {
	public static void main(String args[]) {
		int n = 5;
		// Upper half of diamond
		for (int i = 1; i <= n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		// Lower half of diamond
		for (int i = n - 1; i >= 1; i--) {
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
} 