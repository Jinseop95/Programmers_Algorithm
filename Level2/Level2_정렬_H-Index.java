import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int h = 0;
        int big = 0;
        int small = 0;
        
        Arrays.sort(citations);
        
        while(true){
            big = 0;
            small = 0;
            for(int num : citations){
                if( h <= num)
                    big++;
                if( h >= num)
                    small++;                    
            }            
            if(h > big){
                answer = h-1;
                break;
            }            
            h++;
        }        
        return answer;
    }
}