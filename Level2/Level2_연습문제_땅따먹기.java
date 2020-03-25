import java.lang.Math;
class Solution {
    int solution(int[][] land) {
        int answer = 0;

        int[][] matrix = new int[land.length][4];
        
        for(int i=0; i<4; i++)
            matrix[0][i] = land[0][i];
        
        for(int i=1; i<matrix.length; i++){
            for(int j=0; j<4; j++){
                for(int k=0; k<4; k++){
                    if(j != k){
                        matrix[i][j] = Math.max(matrix[i][j], land[i][j] + matrix[i-1][k]);
                    }
                }
            }
        }

        for(int i=0; i<4; i++)
            answer = Math.max(answer, matrix[matrix.length-1][i]);
        
        return answer;
    }
}