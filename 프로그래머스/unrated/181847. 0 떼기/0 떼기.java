import java.util.*;

// 0이 아닌 수가 나올 때 까지 0을 제거
// 앞에서 0 을 제거하다, 
class Solution {
    public String solution(String n_str) {
        String answer = "";
        //
        char[] ch = n_str.toCharArray();
        for(int i = 0; i < ch.length; i++){
            // 처음에 0이 나오면 0을 빈문자로 대체한다.
            if(ch[i] != '0'){
                answer = n_str;
                break;
            }
            else{
                n_str = n_str.replaceFirst("0",""); 
                answer = n_str;
            }
             
                
        }
        return answer;
}
}