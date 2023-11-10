import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
       // 배열의 길이를 알 수 없기 때문에 list를 생성 후 진행
        List<Integer> list = new ArrayList<>();      
        // intervals의 배열의 원소로 범위를 정해 list에 더해준 후
            for(int i = intervals[0][0]; i <= intervals[0][1]; i++){
                list.add(arr[i]);
            }
            for(int i = intervals[1][0]; i <= intervals[1][1]; i++){
                list.add(arr[i]);
            }
        // 다시 배열로 변환
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
            return answer;
    }
}