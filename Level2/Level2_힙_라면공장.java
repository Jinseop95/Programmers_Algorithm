import java.util.PriorityQueue;
import java.util.Collections;
class Solution {
    public int solution(int stock, int[] dates, int[] supplies, int k) {
        int answer = 0;
        PriorityQueue<Integer> pQueue = new PriorityQueue<>(Collections.reverseOrder());
        int idx = 0;
        for(int i=0; i<k; i++){
            if(idx < dates.length && i == dates[idx]){        //공급 받을 수 있는 날
                pQueue.offer(supplies[idx++]);  
            }
            if(stock == 0){
                stock += pQueue.poll();
                answer++;
            }
            stock--;
        }
        
        return answer;
    }
}