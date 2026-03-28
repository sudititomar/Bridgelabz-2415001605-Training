package java_method;
	import java.util.Scanner;

	public class MatrixOperations {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of rows: ");
	        int rows = sc.nextInt();

	        System.out.print("Enter number of columns: ");
	        int cols = sc.nextInt();

	        int[][] matrixA = generateRandomMatrix(rows, cols);
	        int[][] matrixB = generateRandomMatrix(rows, cols);

	        System.out.println("\nMatrix A:");
	        printMatrix(matrixA);

	        System.out.println("\nMatrix B:");
	        printMatrix(matrixB);

	        System.out.println("\nMatrix A + B:");
	        printMatrix(addMatrices(matrixA, matrixB));

	        System.out.println("\nMatrix A - B:");
	        printMatrix(subtractMatrices(matrixA, matrixB));

	        if (cols == rows) {
	            System.out.println("\nMatrix A * B:");
	            printMatrix(multiplyMatrices(matrixA, matrixB));
	        } else {
	            System.out.println("\nMatrix multiplication not possible (columns of A must equal rows of B)");
	        }
	    }

	    public static int[][] generateRandomMatrix(int rows, int cols) {
	        int[][] matrix = new int[rows][cols];
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                matrix[i][j] = (int)(Math.random() * 10);  // 0 to 9
	            }
	        }
	        return matrix;
	    }

	    public static int[][] addMatrices(int[][] a, int[][] b) {
	        int rows = a.length;
	        int cols = a[0].length;
	        int[][] sum = new int[rows][cols];

	        for (int i = 0; i < rows; i++)
	            for (int j = 0; j < cols; j++)
	                sum[i][j] = a[i][j] + b[i][j];

	        return sum;
	    }

	    public static int[][] subtractMatrices(int[][] a, int[][] b) {
	        int rows = a.length;
	        int cols = a[0].length;
	        int[][] diff = new int[rows][cols];

	        for (int i = 0; i < rows; i++)
	            for (int j = 0; j < cols; j++)
	                diff[i][j] = a[i][j] - b[i][j];

	        return diff;
	    }

	    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
	        int rows = a.length;
	        int cols = b[0].length;
	        int common = a[0].length;

	        int[][] product = new int[rows][cols];

	        for (int i = 0; i < rows; i++)
	            for (int j = 0; j < cols; j++)
	                for (int k = 0; k < common; k++)
	                    product[i][j] += a[i][k] * b[k][j];

	        return product;
	    }

	    public static void printMatrix(int[][] matrix) {
	        for (int[] row : matrix) {
	            for (int val : row) {
	                System.out.printf("%4d", val);
	            }
	            System.out.println();
	        }
	    }
	}

