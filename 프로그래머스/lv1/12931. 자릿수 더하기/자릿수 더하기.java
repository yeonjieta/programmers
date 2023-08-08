import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        // 문자열로 이루어진 배열로 변환 후 
        String[] arr = String.valueOf(n).split("");
        // 반복문을 통해 합을 구해준다. 문자열이기 때문에 정수로 변환 후 더해준다.
        for(int i = 0; i < arr.length; i++){
            answer += Integer.parseInt(arr[i]);
        }
        return answer;
    }
}