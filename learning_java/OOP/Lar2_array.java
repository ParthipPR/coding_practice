// Second largest element in array

import java.util.*;
class Lar2_array
{
        public static void main(String args[])
        {
        int lar1 = -999999999;
	int lar2 = -999999999;
	int A[] = new int[10];
        for(int i=0 ;i < args.length;i++)
        {
                 A[i] = Integer.parseInt( args[i]);
        }
        for(int i=0 ;i < args.length;i++)
        {
                if(A[i] > lar1)   
                {
			lar2 = lar1;
                        lar1 = A[i];
		}
        }
        for(int i=0 ;i < args.length;i++)
        {
        System.out.println(A[i]);
        }
        System.out.println("The second largest element in the above array is :");
        System.out.println(lar2);
        }
}

