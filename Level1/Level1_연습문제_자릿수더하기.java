import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = String.valueOf(n);
        char[] arr = str.toCharArray();
        for(char a : arr)
            answer += a -'0';
            
        return answer;
    }
}