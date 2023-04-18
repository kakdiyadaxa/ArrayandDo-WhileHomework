public class TransposeMatrix {

        public static void main(String[] args) {
            // Define a 2-D array to represent the matrix
            int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

            // Print the original matrix
            System.out.println("Original Matrix:");
            printMatrix(matrix);

            // Compute the transpose of the matrix
            int[][] transpose = transposeMatrix(matrix);

            // Print the transposed matrix
            System.out.println("Transposed Matrix:");
            printMatrix(transpose);
        }

        // Method to compute the transpose of a matrix
        public static int[][] transposeMatrix(int[][] matrix) {
            // Create a new 2-D array for the transpose with swapped dimensions
            int[][] transpose = new int[matrix[0].length][matrix.length];

            // Loop through each element of the original matrix and assign it to the corresponding
            // element in the transpose matrix
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    transpose[j][i] = matrix[i][j];
                }
            }

            // Return the transpose matrix
            return transpose;
        }

        // Method to print a matrix to the console
        public static void printMatrix(int[][] matrix) {
            // Loop through each row of the matrix
            for (int i = 0; i < matrix.length; i++) {
                // Loop through each column of the matrix
                for (int j = 0; j < matrix[0].length; j++) {
                    // Print the element at the current row and column
                    System.out.print(matrix[i][j] + " ");
                }
                // Move to the next line after each row is printed
                System.out.println();
            }
            // Print an extra line break after the matrix is printed
            System.out.println();
        }
    }


