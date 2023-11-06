import java.util.*;

class Solution {
    public int[] solution(String myString) {
        // String 배열을 x를 기준으로 만들어준다.
        String[] stringX = myString.split("x");
        // answer의 길이는 stringX의 길이와 같다(문자를 길이로 변환하는거니)
        int[] answer = new int[stringX.length];
        // 반복문을 돌려 answer의 각 index 자리에 stringX의 각 요소들의 길이를 넣어준다.
        for(int i = 0; i < stringX.length; i++){
            answer[i] = stringX[i].length();
        }
        // 이렇게만 했을 때 마지막이 x로 끝나는 경우는 마지막 요소가 누락된다.
        if(myString.endsWith("x")){
            // 배열을 복사해 길이를 1을 늘리고 늘린부분은 0이 되니 완성
            answer = Arrays.copyOf(answer, answer.length + 1);
        }
        return answer;
    }
}