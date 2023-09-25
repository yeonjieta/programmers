class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        // 순서대로 값을 빼서 더해준다.
        for(int i = 0; i < str1.length(); i++){
            answer += String.valueOf(str1.charAt(i)) + String.valueOf(str2.charAt(i));
        }
        return answer;
    }
}