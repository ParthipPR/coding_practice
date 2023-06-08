// frequency of the given char in string

import java.util.*;
class Frequency_count
{
	public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the string");
			String str = sc.nextLine();
			int l = str.length();
			int count= 0;
			System.out.println("Enter the char to be counted");
			char x = sc.next().charAt(0);
			for (int i =0 ;i<l;i++)
				if (x == str.charAt(i))
				{
					count++;
				}
			System.out.println("The frequency of the element "+x+" is "+count);
		}
}
