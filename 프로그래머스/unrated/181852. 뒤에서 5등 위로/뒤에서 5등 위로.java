import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        Arrays.sort(num_list);
        // 오름차순으로 정렬하고
        answer = Arrays.copyOfRange(num_list, 5, num_list.length);
        return answer;
    }
}