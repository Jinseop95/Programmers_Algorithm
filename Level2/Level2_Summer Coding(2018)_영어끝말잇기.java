import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        ArrayList<String> list = new ArrayList<>();
        String start = words[0].substring(0,1);
        
        for(int i=0; i<words.length; i++){
            String str = words[i];
            String tmp = str.substring(0,1);
            String end = str.substring(str.length()-1);
            
            if(start.equals(tmp)){
                if(list.contains(str)){
                    answer[0] = i%n + 1;
                    answer[1] = i/n + 1;
                    break;
                }else{
                    list.add(str);
                    start = end;
                }
            }else{
                answer[0] = i%n + 1;
                answer[1] = i/n + 1;
                break;
            }
        }
        return answer;
    }
}