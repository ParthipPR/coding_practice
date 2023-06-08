// replace the given char in the string

import java.util.*;
class Replace_str
{
	public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the string");
			String str = sc.nextLine();
			int l = str.length();
			int flag = 1;
			System.out.println("Enter the char to be replaced");
			char x = sc.next().charAt(0);
			System.out.println("Enter the new char");
			char r = sc.next().charAt(0);
			for (int i =0 ;i<l;i++)
				if (x == str.charAt(i))
				{
					System.out.println("the element "+x+" to be replaced is in "+(i+1));
					flag = 0;
					str = str.substring(0, i) + r + str.substring(i + 1);
				}
			if (flag == 1)
				System.out.println("the element"+x+" to be replaced is not present in string");
			System.out.println("the new string is "+str);
		}
}
