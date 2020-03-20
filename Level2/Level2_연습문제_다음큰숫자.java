class BinaryCnt{
    public int binaryCnt(int n){
        int cnt = 0;
        while(n>=1){
            if(n==1){
                cnt++;
                break;
            }
            if(n%2 == 1)
                cnt++;
            n = n/2;
        }
        return cnt;
    }    
}

class Solution {
  public int solution(int n) {
      int answer = 0;
      
      BinaryCnt s = new BinaryCnt();
      int cnt = s.binaryCnt(n);
      
      for(int i=n+1; i>0; i++){
          int cnt2 = s.binaryCnt(i);
          if(cnt == cnt2){
              answer = i;
              break;
          }
      }
      
      return answer;
  }
}