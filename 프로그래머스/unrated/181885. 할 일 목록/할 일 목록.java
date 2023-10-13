import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = {};
        // 새로운 값을 저장할 list를 생성 후
        List<String> list = new ArrayList<>();
        for(int i = 0; i < todo_list.length; i++){
            // finished의 원소가 false인 원소만 list에 저장해준다.
            if(finished[i] == false){
                list.add(todo_list[i]);
            }
        }
        
        answer = new String[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}