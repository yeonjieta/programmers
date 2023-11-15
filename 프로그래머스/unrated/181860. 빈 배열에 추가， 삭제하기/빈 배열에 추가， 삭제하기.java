import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        // 크기를 모르기 때문에 list를 생성
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < flag.length; i++){
            // true 일 때는 list에 arr[i]를 arr[i]*2 만큼 추가해준다.
            if(flag[i]){
                for(int j = 0; j < arr[i]*2; j++){
                    list.add(arr[i]);
                }
            }
            // false 일 때는
            else{
                for(int k = 0; k < arr[i]; k++){
                    // 뒤에서부터 제거를 해줘야하기 때문에 list의 길이에서 1을 빼면 마지막 index가 나오므로
                    // list.size() - 1 을 해준다.
                    list.remove(list.size() - 1);
                }
            }
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}