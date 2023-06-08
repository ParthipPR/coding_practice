import java.util.*;
class NaturalNo
{
    public static void main (String args[])
    {	int sum=0,i=0;
     	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the no");
	int n = sc.nextInt();
	for(i=0;i<n;i++)
		sum = sum+i;
	System.out.println("Sum is "+sum);
	}
}
