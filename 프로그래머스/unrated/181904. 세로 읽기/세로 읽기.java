import java.util.*;

class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        // list를 생성해서
        List<String> list = new ArrayList<>();
        // list 안에 m 길이 만큼씩 자른 문자열을 원소로 넣는다.
        for(int i = 0; i < my_string.length(); i += m){
            list.add(my_string.substring(i,m + i));
        }
        // 그렇게 생성된 list에서 i번째 원소를 가져와 c-1번째 index에 있는 문자를 answer에 더한다.
        for(int i = 0; i < list.size(); i++){
            answer += list.get(i).charAt(c - 1);
        }
        System.out.print(list);
        return answer;
    }
}