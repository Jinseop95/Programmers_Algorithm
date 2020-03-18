import java.util.Stack;
class Solution {
    public int solution(String arrangement) {
        int answer = 0;
        arrangement = arrangement.replace("()","Z");    //레이저 Z로 치환
        
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<arrangement.length(); i++){
            char c = arrangement.charAt(i);
            if(c == '('){
                stack.push('(');
            }else if(c == 'Z'){
                answer += stack.size();
            }else{
                stack.pop();
                answer++;
            }
        }
        
        return answer;
    }
}