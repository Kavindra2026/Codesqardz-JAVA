class q3 {
	public static void main(String args[]) {
		int i, j, n = 4;
		for (i = 0; i <= n; i++) {
			for (j = 1; j <= n - i; j++) {
				System.out.print((j) + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}