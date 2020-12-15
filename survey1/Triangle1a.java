public class Triangle1a {
	public static void main(String[] args) {
		int SIZE = 5;
		int col = 0;
		int row = 0;
		while (row < SIZE) {
			while (col <= row) {
				System.out.print('*');
				col++;
			}
			System.out.println();
			row++;
			col = 0;
		}

	}
}