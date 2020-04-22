import java.util.PriorityQueue;
import java.util.Collections;
class Solution {
    public int[] solution(String[] operations) {
        int[] answer = {};
        answer = new int[2];
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> min = new PriorityQueue<>();
        for(int i=0; i<operations.length; i++){
            String s = operations[i];
            int num = Integer.parseInt(s.replaceAll("[^0-9-]",""));
            if(s.charAt(0) == 'I'){
                max.offer(num);
                min.offer(num);
            }else{
                if(max.isEmpty()){
                    continue;
                }
                if(num == 1){
                    int tmp = max.poll();
                    min.remove(tmp);
                }
                else{
                    int tmp = min.poll();
                    max.remove(tmp);
                }
            }
        }
        if(!max.isEmpty()){
            answer[0] = max.peek();
            answer[1] = min.peek();
        }
        return answer;
    }
}