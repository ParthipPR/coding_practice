// Find the trace of given matrix

import java.util.*;

class Trace_mat  
{
        public static void main(String args[])
        {int Trace=0,count=1;
         int n = Integer.parseInt( args[0]);
        int A[][] = new int[n][n];
        for(int i=0 ;i < n;i++)
        {
		for(int j=0 ;j < n;j++)
		{
	         A[i][j]= Integer.parseInt( args[count]);
		count++;
		}
		Trace+=A[i][i];
        }
        System.out.println(Trace);

        }
}
