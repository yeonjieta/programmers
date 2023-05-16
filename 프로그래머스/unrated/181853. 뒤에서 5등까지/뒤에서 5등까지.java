import java.util.*;
// Arrays를 위해 

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[5];
        // 크기가 5인 배열로 초기화해주고
        Arrays.sort(num_list);
        // num_list를 오름차순으로 정렬시켜준다. 
        answer = Arrays.copyOfRange(num_list, 0, 5);
        // Arrays.copyOfRange(복사할 배열, 시작 위치, 배열크기) 메서드를 사용해 5개의 수를 오름차순으로 담아준다.
        return answer;
    }
}