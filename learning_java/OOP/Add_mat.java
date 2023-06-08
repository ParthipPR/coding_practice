// Add 2 matrix

class Add_mat
{
        public static void main(String args[])
        {
        int N = Integer.parseInt(args[0]);
        int A[][] = new int[N][N];
        int B[][] = new int[N][N];
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
                {  
        		System.out.print(" "+(A[i][j]+B[i][j]));
                }
      	 	System.out.println();
        }
        }
} 
