import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] arr = new String[numbers.length];
        
        for(int i =0; i<numbers.length; i++)
            arr[i] = Integer.toString(numbers[i]);
        
        /*  int compare(int x, int y)
        현재 객체 < 파라미터로 넘어온 객체: 음수 리턴
        현재 객체 == 파라미터로 넘어온 객체: 0 리턴
        현재 객체 > 파라미터로 넘어온 객체: 양수 리턴, 두 객체의 자리가 바뀜
        */
        Arrays.sort(arr, new Comparator<String>() {
            public int compare(String o1, String o2){
                return (o2+o1).compareTo(o1+o2);
            }
        });
        
        if(arr[0].startsWith("0")) {
            answer = "0";
        }else{
            for(String str : arr)
                answer += str;
        }
        
        return answer;
    }
}