import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        int[] answer = {};
        answer = new int[prices.length];
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i=0; i<prices.length; i++){
            answer[i] = 0;
            queue.offer(prices[i]);
        }
        
        while(!queue.isEmpty()){
            int tmp = queue.poll();
            for(int i = prices.length - queue.size(); i < prices.length; i++){
                answer[prices.length - queue.size()-1]++;
                if(tmp <= prices[i]){
                }else
                    break;
            }
        }
        
        return answer;
    }
}