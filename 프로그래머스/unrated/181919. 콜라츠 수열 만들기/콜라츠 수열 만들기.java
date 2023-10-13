import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        // 배열의 크기를 알 수 없으니 list에 먼저 담은 후 배열로 변환
        List <Integer> list = new ArrayList<>();
        // 반복문을 돌린다.
        while(true) {
            // n이 포함돼야하기 때문에 처음에 더해주고
            list.add(n);
            // 1 이면 끝
             if(n == 1){
                break;   
             }
            // 짝수 일 때 조건,
             else if(n % 2 == 0){
                n /= 2;
             }
            // 홀수 일 때 조건
             else if(n / 2 !=0) {
                n = 3 * n + 1;
             }
        }
        // 리스트를 다시 배열로 변환한다.
        answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}