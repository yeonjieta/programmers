class Solution {
    public String solution(String my_string) {
        String answer = my_string.replaceAll("[aeiou]", "");
        // replaceAll 함수에 정규표현식을 사용해 모음을 제거해준다.
        
        return answer;
    }
}