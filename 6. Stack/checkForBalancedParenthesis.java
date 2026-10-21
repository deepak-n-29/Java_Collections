import java.util.ArrayDeque;
import java.util.Deque;

public class checkForBalancedParenthesis {

    public boolean isMatching(char a, char b){
        return (a=='(' && b==')') || (a=='[' && b==']') || (a=='{' && b=='}');
    }
    public boolean isBalanced(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            char x = s.charAt(i);
            if(x=='(' || x=='[' || x=='{'){
                stack.push(x);
            }
            else{
                if(stack.isEmpty()) return false;
                else if(isMatching(stack.peek(), x)==false) return false;
                else stack.pop();
            }
        }
        return stack.isEmpty()==true;
    }
    public static void main(String[] args) {
        
        checkForBalancedParenthesis obj = new checkForBalancedParenthesis();
        System.out.println(obj.isBalanced("()"));
        System.out.println(obj.isBalanced("()[]{}"));
        System.out.println(obj.isBalanced("(]"));

    }
}
