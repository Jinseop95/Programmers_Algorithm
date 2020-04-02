import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        String str = s.replaceAll("},\\{","-");     //},{ 제거
        str = str.replaceAll("[\\{\\}]","");        //중괄호 제거
        
        String[] arr = str.split("-");
        answer = new int[arr.length];
        Arrays.sort(arr, new Comparator<String>() {
           public int compare(String o1, String o2){
               if(o1.length() > o2.length())
                   return 1;
               else{
                   return -1;
               }
           } 
        });
        
        Queue<String> queue = new LinkedList<>();
        for(String a : arr){
            ArrayList<String> list = new ArrayList<>(Arrays.asList(a.split(",")));
            for(String l : list){
                if(!queue.contains(l)){
                    queue.offer(l);
                    break;
                }
            }
        }
        
        int i = 0;
        while(!queue.isEmpty()){
            answer[i] = Integer.parseInt(queue.poll());
            i++;
        }
        
        return answer;
    }
}