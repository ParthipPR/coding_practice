// Transpose of matrix

class Trans_mat
{
        public static void main(String args[])
        {
        int N = Integer.parseInt(args[0]);
        int A[][] = new int[N][N];
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
                {
        	System.out.print(" "+A[j][i]);
                }
        	System.out.println();
        }
        }
}

