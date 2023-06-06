import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2];
        // 문제의 출력값의 크기가 num2이니 num2를 크기로 설정해 배열을 생성하고 
        answer = Arrays.copyOfRange(numbers, num1, num2+1);
        // compyOfRange 메서드를 사용해 복사할 배열, 시작 위치, 끝 위치를 지정해준다.
        return answer;
    }
}