import java.util.Scanner;

class Matrixmain{
    public static void main(String args[]) {
        Matrix mat = new Matrix();
        int[][] matrix1 = mat.input();
        int[][] matrix2 = mat.input();

        int[][] product = mat.multiply(matrix1, matrix2);
        int[][] trace = mat.trace(product);
        
        System.out.print("The Product of the two matrix is :\n");
        mat.printarray(product);

        System.out.print("The trace of the product is :\n");
        mat.printarray(trace);
        
    }
}