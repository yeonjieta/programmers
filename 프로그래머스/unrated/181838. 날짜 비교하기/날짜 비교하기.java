import java.util.*;

class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        // 배열을 정수로 변환해 비교
        // list를 생성해 문자열로 변환한 뒤 넣어준다.(숫자끼리 더해지면 안되고 문자열처럼 그대로 이어져야해서)
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        for(int i = 0; i < date1.length; i++){
            list1.add(String.valueOf(date1[i]));
            list2.add(String.valueOf(date2[i]));
        }
        // 문자열을 생성하고 배열을 문자열로 변환한다
        String str1 = "";
        String str2 = "";
        for(int i = 0; i < list1.size(); i++){
            str1 += list1.get(i);
            str2 += list2.get(i);
        }
        // 문자열을 정수로 변환해 비교한다
        if(Integer.parseInt(str1) < Integer.parseInt(str2)){
            answer = 1;
        }
        return answer;
    }
}