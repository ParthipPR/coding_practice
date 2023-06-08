// sum of elements in an array

import java.util.*;

class Sum_array
{
	public static void main(String args[])
	{int Sum=0;
	int A[] = new int[10];
	for(int i=0 ;i < args.length;i++)
	{ A[i] = Integer.parseInt( args[i]);
	}
	for(int i=0 ;i < args.length;i++)
	{ Sum+=A[i];   
	}
	System.out.println(Sum);
	
        }
}
