import java.util.Stack;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(int num : moves){
            for(int i=0; i<board.length; i++){
                int tmp = board[i][num-1];
                if(tmp != 0){
                    if(!stack.isEmpty() && stack.peek() == tmp){
                        answer += 2;
                        stack.pop();
                    }else
                        stack.push(tmp);
                    
                    board[i][num-1] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}