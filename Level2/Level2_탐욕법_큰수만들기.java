import java.util.Stack;
class Solution {
    public String solution(String number, int k) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        int len = number.length() - k;
        
        for(int i=0; i<number.length(); i++){
            char c = number.charAt(i);
            while(!stack.isEmpty() && c > stack.peek() && k>0){
                stack.pop();
                k--;
            }
            stack.push(c);
        }
        
        for(int i=0; i<len; i++)        // "10000" , 2 , "100"  과 같이 같은 수가 연속될때
            answer += stack.get(i);
        
        return answer;
    }
}