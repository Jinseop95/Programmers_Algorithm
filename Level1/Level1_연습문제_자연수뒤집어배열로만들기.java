class Solution {
  public int[] solution(long n) {
      int[] answer = {};
      String str = Long.toString(n);
      answer = new int[str.length()];
      int i =0;
      
      while(n > 0){
          int num = (int)(n % 10);
          answer[i] = num;
          i++;
          n = n/10;
      }
      return answer;
  }
}