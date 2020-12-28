
// Tutorial 12
// Multi-Dimensional Arrays

public class App {
	public static void main(String[] args) {
		
		// Single Dimension
		int[] values = {3,5,2343};
		
		System.out.println(values[2]);

		// Multi-Dimensional Array
		
		int[][] grid = {
				{3,5,2343},
				{2,4},
				{1,2,3,4}
		};
		
		System.out.println(grid[1][1]);
		System.out.println(grid[0][2]);
		
		// type[Rows][columns]		
		String[][] texts = new String[2][3];
		
		texts[0][1] = "Hello there";
		
		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[row].length; col++) {
				System.out.println(grid[row][col]);
			}
		}
	}
}
