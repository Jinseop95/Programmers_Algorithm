import java.util.*;
class Solution {
    public int[] solution(int[] heights) {
        int[] answer = {};
        answer = new int[heights.length];
        
        Stack<Integer> stack = new Stack<>();
        for(int num : heights)
            stack.push(num);
        
        while(!stack.isEmpty()){
            int tmp = stack.pop();
            for(int i=stack.size(); i >= 0; i--){
                if(tmp < heights[i]){
                    answer[stack.size()] = i+1;
                    break;
                }
            }
        }
        return answer;
    }
}