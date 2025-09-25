public class findElement {

    public static void findInSortedMatrix(int matrix[][], int target) {
        int row = 0, col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                System.out.println("Element found at (" + row + ", " + col + ")");
                return;
            } else if (matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }
        };
        findInSortedMatrix(matrix, 33);
    }
}
