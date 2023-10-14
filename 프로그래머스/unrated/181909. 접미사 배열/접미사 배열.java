import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        // answer의 길이는 my_string의 길이와 같다
        String[] answer = new String[my_string.length()];
        for(int i = 0; i < my_string.length(); i++){
            // substring으로 i 번째 부터 마지막까지 끊어준다.
            answer[i] = my_string.substring(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}