//Largest element in an N*N matrix

class Lar_mat
{
        public static void main(String args[])
        {
	int lar = -9999999;
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
        	{       if (A[i][j]>lar)
	 		{
			  lar =A[i][j];
			}
        	}
	}
	System.out.println(lar);
	}
}
