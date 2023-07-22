import java.util.*;

// before과 after에 같은 알파벳이 들어있으면 1 아니면 0 이니까
// 오름차순으로 정렬했을 때 같은 알파벳이면 같은 문자열이 될거고 아님 다른 문자열이 될테니
// 두개 같은지 비교해서 푼다. 

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        char[] ch = before.toCharArray();
        char[] arr = after.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(arr);
        String ch2 = String.valueOf(ch);
        String arr2 = String.valueOf(arr);
        
        if(ch2.equals(arr2)){
            answer = 1;
        }
        else{
            answer = 0;
        }
        
        return answer;
    }
}