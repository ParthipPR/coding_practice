// Replace a particular element from an array
import java.util.*;
class Replace_array
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the element to be replaced");
	int element = sc.nextInt();
	System.out.println("Enter the new element");
	int replace = sc.nextInt();
	int A[] = new int[10];
	for(int i=0 ;i < args.length;i++)
	{
		 A[i] = Integer.parseInt( args[i]);
	}
	for(int i=0 ;i < args.length;i++)
	{
		if(A[i] == element)
		{
			A[i] = replace;
		}
	}
	for(int i=0 ;i < args.length;i++)
	{
	System.out.println(A[i]);
	}
        }
}
