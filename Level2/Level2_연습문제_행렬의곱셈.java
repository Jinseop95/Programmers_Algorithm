class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};
        answer = new int[arr1.length][arr2[0].length];
        
        for(int i=0; i<answer.length; i++){
            for(int j=0; j<answer[0].length; j++){
                for(int a=0; a< arr1[0].length; a++){
                    answer[i][j] += arr1[i][a] * arr2[a][j];
                }
            }
        }
        return answer;
    }
}