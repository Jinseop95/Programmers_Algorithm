class Solution {
    public int solution(String name) {
        int answer = 0;
        int cnt = name.length();
        int rotation = cnt - 1;
        
        for(int i=0; i<name.length(); i++){
            int ch = (int)'A';
            int origin = (int)name.charAt(i);
            
            int next = (ch - (origin - 26) < origin - ch) ? ch - (origin - 26) : origin - ch;
            System.out.println(next);
            answer += next; 
            
            int idx = i+1;  //다음문자
            while(idx < cnt && name.charAt(idx) == 'A')
                idx++;
            
            rotation = Math.min(rotation, i + cnt - idx + Math.min(i, cnt - idx));
        }
        
        answer += rotation;
        return answer;
    }
}