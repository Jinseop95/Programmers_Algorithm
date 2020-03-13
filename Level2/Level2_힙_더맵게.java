import java.util.*;
//while문 안에서 매번 sort을 하면 효율성이 떨어진다.
//ArrayList말고 PriorityQueue 이용하기!!
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();
        
        for(int num : scoville)
            pQueue.offer(num);
        
        while(pQueue.peek() < K && pQueue.size() >1){
            int n1 = pQueue.poll();
            int n2 = pQueue.poll();
            int newK = n1 + 2*n2;
            pQueue.offer(newK);
            answer++;
        }
        
        if(pQueue.peek()<K)
            answer = -1;
        return answer;
    }
}