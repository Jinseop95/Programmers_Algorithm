import java.util.PriorityQueue;
import java.util.Collections;
class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        PriorityQueue<Integer> pQueue = new PriorityQueue<>(Collections.reverseOrder());
        for(int a : works)
            pQueue.offer(a);
        
        for(int i=0; i<n; i++){
            int tmp = pQueue.poll();
            if(tmp == 0){
                return 0;
            }
            tmp--;
            pQueue.offer(tmp);
            
        }
        
        while(!pQueue.isEmpty()){
            answer += (int)Math.pow(pQueue.poll(),2);
        }
        
        return answer;
    }
}