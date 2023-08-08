import java.util.*;

class Solution {
    public int[] solution(long n) {
        // split함수로 문자열 배열ㅇ르 만들어 준 후 
        String[] str = String.valueOf(n).split("");
        // return 할 정수형 배열을 생성한다.
        int[] answer = new int[str.length];  
        // answer 배열의 index를 위한 변수를 생성하고 
        int index = 0;
        // 순서를 뒤집어 넣어준다.
        for(int i = answer.length-1; i >= 0; i--){
            answer[index] = Integer.parseInt(str[i]);
            index++;
        }
        return answer;
    }
}