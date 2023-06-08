// Smallest element in array


class Small_array
{
	public static void main(String args[])
	{int small=999999999;
	int A[] = new int[10];
	for(int i=0 ;i < args.length;i++)
	{ A[i] = Integer.parseInt( args[i]);
	}
	for(int i=0 ;i < args.length;i++)
	{
	if (A[i]<small)
	{
	small = A[i];
	}
	}
	System.out.println(small);
	
        }
}
