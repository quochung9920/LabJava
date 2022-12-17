package Lab7;

import java.util.Scanner;
import java.util.Stack;

public class ex7x10 {
    public static void main(String []arg)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            //Complete the code
            Stack<Character> ch = new Stack<>();
            for(int i = 0 ; i < input.length();i++)
            {
                if(!ch.isEmpty()){
                    if(ch.peek().equals('{') && input.charAt(i)=='}')
                    {
                        ch.pop();
                    }
                    else if (ch.peek().equals('[') && input.charAt(i)==']')
                    {
                        ch.pop();
                    }
                    else if (ch.peek().equals('(') && input.charAt(i)==')')
                    {
                        ch.pop();
                    }
                    else{
                        ch.push(input.charAt(i));
                    }
                } 
                else{
                        ch.push(input.charAt(i));
                }
            }
            
            if(ch.isEmpty()){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
		}
		
        sc.close();
    }
}
