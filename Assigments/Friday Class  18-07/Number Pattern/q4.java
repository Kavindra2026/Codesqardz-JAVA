class q4 {
	public static void main(String args[]) {
		int i, j, n = 4;

		int count = 1;
		for (i = 0; i <= n; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(count + " ");
				count++;
			}
			System.out.println();
		}
	}
}