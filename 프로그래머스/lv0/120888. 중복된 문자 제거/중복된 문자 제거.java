import java.util.*;

// 중복된 문자가 있으면 
class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] ch = my_string.toCharArray();
        // 반복문을 통해서  
        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < i; j++) { 
                // 하나하나 문자를 비교해 주면서
                if (ch[i] == ch[j]) {
                    ch[i] = '0'; // 만약 같으면 그 문자를 0으로 대체
                                 // 빈문자열로 하니 원래 있는 띄어쓰기도 없어져서 저렇게함 
                }
            }
        }
        answer = String.valueOf(ch).replaceAll("0", ""); // 0을 "" 로 변경하여 answer에 대입
        return answer; 
    }
}