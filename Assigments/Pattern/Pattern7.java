class Pattern7 {
	public static void main(String args[]) {
		int n = 5;
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