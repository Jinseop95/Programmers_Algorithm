import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int temp : reserve){
            arrayList.add(temp);
        }
        int cnt = 0;
         for(int i=0; i<lost.length; i++){
             if(arrayList.contains(lost[i])){
                arrayList.remove((Integer)lost[i]);
                lost[i] = -1;
                cnt++;
            }
         }
        for(int i=0; i<lost.length; i++){
            int a = lost[i] - 1;
            int b = lost[i] + 1;
            if(arrayList.contains(a)){
                arrayList.remove((Integer)a);
                cnt++;
            }else if(arrayList.contains(b)){
                arrayList.remove((Integer)b);
                cnt++;
            }
        }
        answer = n - lost.length + cnt;
        return answer;
    }
}