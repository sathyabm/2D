/**
 * Sandbox for 2D arrays
 * @author
 * @version 1.0
 * @since 2025-03
 */


public class Sandbox2DArrays {
    public static void main(String [] args) {

        // you will insert your code along code here

        int [][] nums = new int [][]{
            {1, 2, 3},
            {3, 2, 1}
        };
        double [][] value = new double [][]{
            {1.5, 0.25, 6.0,9.75},
            {-10.25, 0, 0, -0.24}
        };

        int rows = 5;
        int cols = 4;
        int [][] values = new int [rows][cols];

        int [][] partialDimensions = new int[rows][];

        int [][] help = new int[][]{
            {11, -1, 3},
            {-2, 23, 34}
        };

        printMatrix(nums);
        sumMatrix(help);
        sum(help);

        
        


        
    }

    public static void printMatrix(int [] [] matrix){
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[row].length; col++){
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
        
    }

    public static void sumMatrix(int [][] matrix){
        int total = 0;
        for(int [] row : matrix){
            for(int val : row){
                total += val;
            }
        }
        System.out.println(total);
    }

    public static void  sum(int [][] matrix){
        int [] sums = new int[matrix.length];
        
        for(int row = 0; row< matrix.length; row++){
            for(int col = 0; col<matrix[row].length; col++){
                sums[row] += matrix[row][col];
            }
        }
        System.out.println(sums);
    }

    public static void swapRows(int [][] matrix, int r, int c){
        int [] temp = matrix[r];
        matrix[r] = matrix[c];
        matrix[c] = temp;
    }

    public static int[] sumCols(int [][] matrix){
        int [] result = new int [matrix[0].length];
        
        
        for(int col = 0; col< matrix.length; col++){
            for(int row = 0; row<matrix[row].length; row++){
                result[col] += matrix[row][col];
            }
        }
        System.out.println(result);
    }
    
}