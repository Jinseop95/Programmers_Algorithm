class Solution {
	public long solution(int w,int h) {
		long answer = 0;
        
        for(int i=0; i<w; i++)
            answer +=  (long)h*i / (long)w;
        
        answer *= 2;
		return answer;
	}
}