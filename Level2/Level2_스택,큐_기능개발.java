import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        int[] arr = new int[speeds.length];
        
        for(int i=0; i<speeds.length; i++){
            arr[i] = 0;
            int num = 100 - progresses[i];
            while(num > 0){
                num -= speeds[i];
                arr[i]++;
            }
        }        
        ArrayList<Integer> list = new ArrayList<>();
        
        int a = arr[0];
        int cnt = 1;
        for(int i=1; i<arr.length; i++){
            if(a >= arr[i]){
                cnt++;
            }else{
                list.add(cnt);
                cnt=1;
                a = arr[i];
                continue;
            }
        }
        list.add(cnt);
        answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++)
            answer[i] = list.get(i);
        
        return answer;
    }
}