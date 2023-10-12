import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = {};
        List<String> list = new ArrayList<>();
        for(int i = 0; i < strArr.length; i++){
            // list에 add가 들어있지 않는 요소만 추가해준다.
            if(!strArr[i].contains("ad")){
                list.add(strArr[i]);
            }
        }
        // 그리고 배열로 변환
        answer = list.toArray(new String[list.size()]);
        return answer;
    }
}