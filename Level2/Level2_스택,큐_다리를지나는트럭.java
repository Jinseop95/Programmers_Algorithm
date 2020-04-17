import java.util.Queue;
import java.util.LinkedList;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int[] totalTime = new int[truck_weights.length]; //다리를 건너는 총 시간
        Queue<Integer> queue = new LinkedList<>();  //다리를 건너는 트럭
        int idx = 0;    //트럭 순서
        
        while(true){
            if(!queue.isEmpty() && totalTime[queue.peek()] == answer){
                weight += truck_weights[queue.poll()];
            }
            
            if(idx < truck_weights.length && truck_weights[idx] <= weight){
                queue.add(idx);
                totalTime[idx] = answer + bridge_length;
                weight -= truck_weights[idx];
                idx++;
            }
            
            answer++;
            
            if(queue.isEmpty())
                break;                       
        }
        return answer;
    }
}