import java.util.ArrayList;
class Solution {
    private ArrayList<Integer> list = new ArrayList<>();
    public boolean isPrime(int num){
        if(num < 2)
            return false;
        for(int i=2; i<= Math.sqrt(num); i++){
            if( num % i == 0)
                return false;
        }
        return true;
    }
    
    public void add(char[] arr, int n){
        String num = "";
        for(int i=0; i<n; i++)
            num += arr[i];
        if(!list.contains(Integer.parseInt(num)))
            list.add(Integer.parseInt(num));
    }
    
    public void swap(char[] arr, int depth, int i){
        char tmp = arr[depth];
        arr[depth] = arr[i];
        arr[i] = tmp;
    }
    
    public void permutation(char[] arr, int depth, int n, int r){
        if(depth == r){
            add(arr, r);
            return;
        }
        for(int i= depth; i<n; i++){
            swap(arr,depth, i);
            permutation(arr, depth+1, n ,r);
            swap(arr,depth, i);
        }
    }
    
    public int solution(String numbers) {
        int answer = 0;
        char[] arr = numbers.toCharArray();
        for(int i=1; i<=numbers.length(); i++)
            permutation(arr,0,numbers.length(),i);
        
        for(int num : list){
            if(isPrime(num))
                answer++;
        }
        
        return answer;
    }
}