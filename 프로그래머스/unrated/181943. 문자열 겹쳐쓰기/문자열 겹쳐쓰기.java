class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = my_string.substring(0,s) + overwrite_string + my_string.substring(s + overwrite_string.length(),my_string.length()) ;
        // 일단 0부터 s전까지 추출하고, 그 중간에 overwrite_string 문자를 넣고 만약 뒤에 남은 문자가 있다면, 그건 s + overwirte_string 부터 my_string의 마지막 글자까지니까 이렇게 써준다.
        return answer;
    }
}