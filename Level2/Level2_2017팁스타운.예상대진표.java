class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 1;
        double min = Math.ceil(a/2.0);
        double max = Math.ceil(b/2.0);
        
        while(min != max){
            min = Math.ceil(min/2.0);
            max = Math.ceil(max/2.0);
            answer++;
        }
        
        return answer;
    }
}