import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        // 일단 배열로 만든후
        String[] str = s.split(" ");
        // 최소값과 최대값을 구하기 위해 첫번째 인덱스의 요소를 최소, 최대값으로 정한다
        int max = Integer.valueOf(str[0]);
        int min = Integer.valueOf(str[0]);
        // 반복문을 통해 최소, 최대값을 구해주고
        for(int i = 0; i < str.length; i++){
            if(max < Integer.valueOf(str[i])){
                max = Integer.valueOf(str[i]);
            }
            if(min > Integer.valueOf(str[i])){
                min = Integer.valueOf(str[i]);
            }
        }
        // 정수 배열에 저장한 뒤 
        int[] arr = {min, max};
        // 문자열로 변환한다
        answer =  Arrays.toString(arr).replace(",","").replace("[","").replace("]","");
        return answer;
    }
}