import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        // 배열의 길이를 알 수 없으니 일단 list 선언
         List<Integer> list = new ArrayList<>();
        
        // 첫 번째 원소는 무조건 추가
        list.add(arr[0]);  
        
        // 연속index 1번부터 그 전수와 비교하여 겹치는 수는 빼고 list에 담아준다.
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                list.add(arr[i]);
            }
        }
        // answer 배열을 생성한 후
        int[] answer = new int[list.size()];
        // list에 있던 값들을 answer에 넣어준다.
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}