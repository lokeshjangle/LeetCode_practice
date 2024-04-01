package ValidParenthesis;

import java.util.Stack;

/*Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
 

Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
 */
public class ValidParenthesis {
    public static boolean isOpening(char c){
        return c == '(' || c == '{' || c == '[';
    }

    public static boolean isMatching(char a, char b){
        if(a == '(' && b == ')') return true;
        else if(a == '{' && b == '}') return true;
        else if(a == '[' && b == ']') return true;
        else return false;
        // return (a == '(' && b==')') || (a == '[' && b==']') || (a == '{' && b=='}');

    }
    public static boolean isValid(String s) {
        Stack<Character> c = new Stack<Character>();
        for(int i=0;i<s.length();++i){
            char ch = s.charAt(i);
            if(isOpening(ch)){
                c.push(ch);
                
            }
            else{
                if(c.isEmpty())
                {
                    return false;
                }
                else if(!isMatching(c.peek(),ch)){
                    return false;
                }
                else {
                    c.pop();
                }
            }
        }
        return c.isEmpty();
    }
    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
    }
}

