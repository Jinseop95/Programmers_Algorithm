import java.util.*;
class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(!stack.isEmpty() && c ==stack.peek()){   //비어있을경우 푸쉬해주기 위해
                stack.pop();
            }else{
                stack.push(c);
            }
        }
        
        if(stack.isEmpty())
            answer = 1;
        else
            answer = 0;
        
        return answer;
    }
}