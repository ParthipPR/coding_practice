// given string palindrome 

import java.util.*;

class Palindrome
{
	public static void main(String args[])
	{	Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		int l = str.length();
		String rev = "";
		for(int i =l-1;i>=0;i--)
		{rev += str.charAt(i);
		}
		if(str.equalsIgnoreCase(rev))
			System.out.println("Palimdrome");
		else

			System.out.println(" Not Palimdrome");
	}
}
