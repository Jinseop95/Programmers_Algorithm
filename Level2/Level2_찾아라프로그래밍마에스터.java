import java.util.Stack;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(int num : nums){
            if(stack.contains(num))
               continue; 
            else
                stack.push(num);
            
            if(stack.size() == nums.length/2)
                break;
        }
        
        answer = stack.size();
        return answer;
    }
}