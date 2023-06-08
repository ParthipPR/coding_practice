import java.util.Scanner;

class Matrix{

	//Function to get input of the matrix
	int[][] input(){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of row:");
		int r = sc.nextInt();
		System.out.println("Enter the no of column:");
                int c = sc.nextInt();
		int mat[][] = new int [r][c];
		for (int i=0; i<r ; i++){
			
			for (int j=0; j<c ; j++){

				System.out.println("Enter the element in the "+i+"th row and "+j+"th column:");
				mat[i][j] = sc.nextInt();
			}
		}
                
		return mat;
	}
	
	//function to print matrix
	void printarray(int matrix[][]){
		int row = matrix.length;
		int column = matrix[0].length;

		for (int i=0; i<row ; i++){
			for (int j=0; j<column; j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.print("\n");
		}


	}

	//function to multiply two matrix
	int[][] multiply(int matrix1[][], int matrix2[][]){
		int rows1 = matrix1.length;
		int columns1 = matrix1[0].length;
		int columns2 = matrix2[0].length;
		int[][] result = new int[rows1][columns2];

    		for (int i = 0; i < rows1; i++) {
				for (int j = 0; j < columns2; j++) {
					for (int k = 0; k < columns1; k++) {
						result[i][j] += matrix1[i][k] * matrix2[k][j];
					}
				}
			}
		return result;
	}

	//function to find trace of a matrix
	int[][] trace(int matrix[][]){
		int row = matrix.length;
		int column = matrix[0].length;
		int[][] trace = new int[row][column];

		for (int i=0; i<row ; i++){
			for (int j=0; j<column; j++){
				trace[i][j] = matrix[j][i];
			}
		}

		return trace;
	
	}

}

