class Pattern8 {
	public static void main(String args[]) {
		int n = 5;

		for (int i = 1; i <= n; i++) {
			// Print space
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}
			// print stars
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}
}