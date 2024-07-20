import datastructure.stack;
import java.util.*;

class postfix_infix{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    stack<String> s = new stack<>();

    for (char curr : str.toCharArray() ) {
      if (Character.isLetter(curr)) {
        s.push(String.valueOf(curr));
      }
      else{
        String a = s.pop();
        String b = s.pop();

        String temp = b+curr+a;
        s.push(temp);
      }

    }

    System.out.println(s.pop());

    sc.close();

  }
}
