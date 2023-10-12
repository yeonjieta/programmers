// x가 2개 이상일 경우를 생각

import java.util.*;

class Solution {
    public String[] solution(String myString) {
        // x를 기준으로 배열을 생성하고
        String[] answer = myString.split("x");
        // 오름차순 정렬한다
        Arrays.sort(answer);
        // x가 두개 이상일 때는 배열에 빈 문자열이 들어가기 때문에
        // 빈문자열 요소를 삭제해 주기위해 list를 생성해주고
        List<String> list = new ArrayList<>();
        for(int i = 0; i < answer.length; i++){
            // 빈 문자열이 아닌 경우만 list에 추가한다.
            if(!answer[i].equals("")){
                list.add(answer[i]);
            }
        }
        // 그러고 다시 배열로 변환한다.
        answer = list.toArray(new String[list.size()]);
        
        
        return answer;
    }
}