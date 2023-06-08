// Multiply two matrix

class Mul_mat
{
        public static void main(String args[])
        {
        int N = Integer.parseInt(args[0]);
        int A[][] = new int[N][N];
        int B[][] = new int[N][N];
        int C[][] = new int[N][N];
        int count =1;
        for(int i=0 ;i < N;i++)
        {
                for(int j=0 ;j < N;j++)
                { A[i][j] = Integer.parseInt( args[count]);
                count++;
                }
        }
        for(int i=0 ;i < N;i++)
        {
                for(int j=0 ;j < N;j++)
                { B[i][j] = Integer.parseInt( args[count]);
                count++;
                }
        }
        for(int i=0 ;i < N;i++)
        {
                for(int j=0 ;j < N;j++)
                {	C[i][j] =0;  
                	for(int k=0 ;k < N;k++)
			{
			C[i][j]+=A[i][k]*B[k][j];
			}
      	 	System.out.print(" "+C[i][j]);
                }
      	 	System.out.println();
        }
        }
} 
