class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        for(int i = 0; i < code.length(); i++){
            // 각인덱스 나누기 q의 나머지가 r이면
            // 문자열 더하기를 해준다
            if(i % q == r){
                answer += String.valueOf(code.charAt(i));
            }
        }
        return answer;
    }
}