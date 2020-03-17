class Solution {
    public int[] solution(int brown, int red) {
        int[] answer = {};
        answer = new int[2];
        int row =0;
        int column = 0;
        int matrix = brown + red;   //행렬의 크기
        
        for(row=1; row<= matrix; row++){
            if(matrix%row ==  0){
                column = matrix / row;
                int tmp = 2*column + 2*(row-2); //brown 개수
                if(brown == tmp && row >= column){
                    answer[0] = row;
                    answer[1] = column;
                    break;
                }
            }else{
                continue;
            }
        }
                
        return answer;
    }
}