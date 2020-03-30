import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        String[] answer = {};
        int size = record.length;
        HashMap<String, String> map = new HashMap<>();
        for(String str : record){
            String[] arr = str.split(" ");
            String uid = arr[1];
            if(arr.length == 3){
                String name = arr[2];
                map.put(uid, name);
            }
            if(arr[0].equals("Change"))
                size--;
        }
        
        answer = new String[size];
        int idx =0;
        for(int i=0; i<record.length; i++){
            String[] arr = record[i].split(" ");
            String uid = arr[1];
            String name = map.get(uid);
            if(arr[0].equals("Enter")){
                answer[idx++] = name + "님이 들어왔습니다.";
            }else if(arr[0].equals("Leave")){
                answer[idx++] = name + "님이 나갔습니다.";
            }else
                continue;
        }
        return answer;
    }
}