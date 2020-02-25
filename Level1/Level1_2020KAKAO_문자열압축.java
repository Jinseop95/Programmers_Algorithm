class Solution {
    public int solution(String s) {
        int answer = 0;
        answer = s.length();
        String result = "";
        int cnt = 1;
        for(int i=1; i<= s.length()/2; i++){
            result = "";
            for(int j=1; j<s.length()/i; j++){
                int idx1 = i*(j-1);
                int idx2 = i*j;
                int idx3 = i*(j+1);
                if(s.substring(idx1,idx2).equals(s.substring(idx2,idx3))){
                    cnt++;
                    if(j== s.length()/i-1){
                        result += Integer.toString(cnt) + s.substring(idx1,idx2);
                        cnt = 1;
                    }
                }else{
                    if(cnt == 1)
                        result += s.substring(idx1,idx2);
                    else
                        result += Integer.toString(cnt) + s.substring(idx1,idx2);
                    cnt = 1;
                    
                    if(j== s.length()/i-1)
                        result += s.substring(idx2,idx3);
                }
            }
            if( s.length() % i != 0){
                result += s.substring(s.length()- (s.length() % i));
            }
            if(answer > result.length())
                answer = result.length();
        }
        return answer;
    }
}