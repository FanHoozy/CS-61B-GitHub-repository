public class Triangle1b {
	public static void main(String[] args) {
		Triangle1b.drawTriangle(10);
		// drawTriangle(10);
	}
	public static void drawTriangle(int SIZE) {
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