class Pattern1 {

	public static void main(String... s) {
		int n = 5;
		for (int i = 0; i <= n; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}