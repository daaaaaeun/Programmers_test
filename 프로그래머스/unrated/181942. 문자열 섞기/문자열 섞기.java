class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        //str1 이랑 str2가 같다. 반복문 돌려서 str1에서 한번, str2에서 한번 이어붙인다
        for(int i=0; i<str1.length(); i++){
            answer += str1.substring(i,i+1);
            answer += str2.substring(i,i+1);
        }
        
        return answer;
    }
}