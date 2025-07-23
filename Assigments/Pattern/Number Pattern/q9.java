class q9 {
	public static void main(String args[]) {
		int i, j, n = 4;
		for (i = 1; i <= n; i++) {
			for (j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (j = i; j <= n; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		for (i = n - 1; i >= 1; i--) {
			for (j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (j = i; j <= n; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}