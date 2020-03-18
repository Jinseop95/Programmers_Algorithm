import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> pQueue = new PriorityQueue<>(Collections.reverseOrder());
        for(int num : priorities)
            pQueue.offer(num);
        
        while(!pQueue.isEmpty()){
            for(int i=0; i<priorities.length; i++){
                if(priorities[i] == pQueue.peek()){
                    answer++;
                    pQueue.poll();
                    if(i == location){
                        pQueue.clear();
                        break;
                    }
                }
            }
        }
        
        return answer;
    }
}