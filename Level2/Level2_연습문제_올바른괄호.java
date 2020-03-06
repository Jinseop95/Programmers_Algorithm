import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            try{
                if(s.charAt(i) == '(')
                    stack.push('(');
                else
                    stack.pop();
            }catch(Exception e){
                answer = false;
            }
        }

        if(!stack.isEmpty())
            answer = false;
        
        return answer;
    }
}