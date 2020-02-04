import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        int prev = arr[0];
        ArrayList<Integer> arrList = new ArrayList<>();

        for(int i=1; i<arr.length; i++){
            if(prev != arr[i]){
                arrList.add(prev);
                prev = arr[i];
            }
            if(i==arr.length-1){
                arrList.add(prev);
            }

        }
        answer = new int[arrList.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = arrList.get(i);
        }
        return answer;
    }
}
/*
public class Solution {
	public int[] solution(int []arr) {
        int[] answer = {};
        int prev = 10;
        ArrayList<Integer> arrList = new ArrayList<>();
        
        for(int num : arr){
            if(prev != num){
                arrList.add(num);
            }
            prev = num;
        }
        
        answer = new int[arrList.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = arrList.get(i);
        }
        return answer;
	}
}*/