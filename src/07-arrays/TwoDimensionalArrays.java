public class TwoDimensionalArrays {

    public static void main(String[] args) {

        //declaring an int variable called matrix as a two-dimensional array
        int [][] matrix = new int [10][10];

        //initializing array with random values
        for (int row = 0; row < matrix.length;row++){
            for (int column = 0; column < matrix[row].length;column++){
                matrix[row][column] = (int)(Math.random() * 100);
            }
        }

        //printing out arrays
        for (int row = 0; row < matrix.length; row++){
            for (int column = 0; column < matrix[row].length;column++){
                System.out.print(matrix[row][column] + " ");
            }
        }
    }
}
