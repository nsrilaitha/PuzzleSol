import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cValue = in.nextInt();
        trails:
        for(int i = 0; i < cValue; i++){
            String cword = in.next();
            Stack<Character> stack = new Stack<>();
            
            for(char check: word.toCharArray())
            {
                if(check == '(')
                    stack.push(')');
                else if(check == '{')
                    stack.push('}');
                else if(check == '[')
                    stack.push(']');
                
                else{
                    if( stack.isEmpty() || check != stack.peek()){
                        System.out.println("0");
                        continue trails;    
                    }
                    else{
                        stack.pop();
                    }
                }
            }
          //Check whether Stack is empty or not 
            if(stack.isEmpty())
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}