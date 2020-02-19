class Solution {
  public int[] solution(int n, int m) {
      int[] answer = {};
      answer = new int[2];
      int max = Math.max(n,m);
      int min = Math.min(n,m);
      int gcd = n * m;
      int temp =1;
      
      while(temp != 0){
          temp = max % min;
          max = min;
          min = temp;
      }
      answer[0] = max;
      answer[1] = gcd / max;    //최소공배수 = 두수의곱 / 최대공약수
      
      return answer;
  }
}