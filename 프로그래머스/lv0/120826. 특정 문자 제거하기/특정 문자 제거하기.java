class Solution {
    public String solution(String my_string, String letter) {
        String answer = my_string.replace(letter, "");
        // replace 함수를 사용해 letter를 빈문자로 바꾼다.
        return answer;
    }
}