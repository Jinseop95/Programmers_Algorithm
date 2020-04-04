import java.util.Arrays;
class Solution {
    public boolean isPrime(int a){
        if(a<2)
            return false;
        
        for(int i=2; i<=Math.sqrt(a);i++){
            if(a%i == 0)
                return false;
        }
        
        return true;
    }
    public int solution(int[] nums) {
        int answer = 0;
        int len = nums.length;
        Integer[] arr = new Integer[len];
        
        for(int i=0; i<len; i++)
            arr[i] = nums[i];
        
        Arrays.sort(arr);
        
        for(int i=0; i< len-2; i++){
            for(int j=i+1; j<len; j++){
               for(int k=j+1; k<len; k++){
                   int num = arr[i] + arr[j] + arr[k];
                   if(isPrime(num))
                       answer++;
               } 
            }
        }
        
        return answer;
    }
}