import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        String spell = my_string.toLowerCase();
        char[] ch = spell.toCharArray();
        Arrays.sort(ch);
        answer = String.valueOf(ch);
        return answer;
    }
}