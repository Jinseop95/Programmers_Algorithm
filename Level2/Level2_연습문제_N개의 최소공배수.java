class Solution {
  public int gcd(int a, int b){ //최대공약수 구하기
      int max = Math.max(a,b);
      int min = Math.min(a,b);
      int tmp = 1;
      while(tmp !=0 ){
          tmp = max % min;
          max = min;
          min = tmp;
      }
      return max;
      
  }  
  public int solution(int[] arr) {
      int answer = 0;
      int num = arr[0] * arr[1] / gcd(arr[0], arr[1]);
      
      for(int i=2; i<arr.length;i++){
          answer = num * arr[i] / gcd(num, arr[i]);
          num = answer;
      }
      
      return answer;
  }
    
}