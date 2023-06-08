import java.util.*;
class Search
{	public static void main(String args[])
		{	Scanner sc = new Scanner(System.in);
			System.out.println("Enter the string");
			String str = sc.nextLine();
			int l = str.length();
			int flag = 1;
			System.out.println("Enter the char to be searched");
			char x = sc.next().charAt(0);
			for (int i =0 ;i<l;i++)
				if (x == str.charAt(i))
				{	System.out.println("the element "+x+" is in "+(i+1));
					flag = 0;
				}
			if (flag == 1)
				System.out.println("the element"+x+"  is not present ");
		}
}
