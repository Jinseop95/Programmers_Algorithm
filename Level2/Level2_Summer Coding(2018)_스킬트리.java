class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        answer = skill_trees.length;
        String reg = "[^" + skill + "]"; //skill을 제외한 문자 공백처리
        for(int i=0; i<skill_trees.length; i++){
            skill_trees[i] = skill_trees[i].replaceAll(reg, "");
            for(int j=0; j<skill_trees[i].length(); j++){
                if(skill.charAt(j) != skill_trees[i].charAt(j)){
                    answer--;
                    break;
                }
            }
        }
        
        return answer;
    }
}