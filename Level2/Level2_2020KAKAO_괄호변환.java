class Solution {
    public String solution(String p) {
        String answer = "";
        answer = proper(p);
        return answer;
    }
    
    public String proper(String p){
        if(p.length() == 0)
            return "";
        
        int idx = divide(p);
        String u = p.substring(0,idx);
        String v = p.substring(idx,p.length());
        
        if(isProper(u)){
            return u + proper(v);
        }else{
            String str = "(" + proper(v) + ")";
            u = u.substring(1,u.length()-1);
            for(int i=0; i<u.length(); i++){
                if(u.charAt(i) == '(')
                    str += ")";
                else
                    str += "(";
            }
            return str;
        }
    }
    
    public int divide(String p){
        int cnt = 0;
        for(int i=0; i<p.length(); i++){
            if(p.charAt(i) == '(')
                cnt++;
            else
                cnt--;
            if(cnt==0)
                return i+1;
        }
        return 0;
    }
    
    public boolean isProper(String p){
        int cnt = 0;
        for(int i=0; i<p.length(); i++){
            if(p.charAt(i) == '(')
                cnt++;
            else
                cnt--;
            if(cnt<0)
                return false;
        }
        return true;
    }
}