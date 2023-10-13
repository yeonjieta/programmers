import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        
        //검색 효율성을 높이기 위해서 delete_list 를 set에 저장
        Set<Integer> delete = new HashSet<>();
        for(int num : delete_list){
            delete.add(num);
        }
        
        // arr의 원소가 delete에 포함되지 않으면 list에 추가
        for(int num : arr){
            if(!delete.contains(num)){
                list.add(num);
            }
        }
        // list를 array로 변환
        answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}