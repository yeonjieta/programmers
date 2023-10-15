import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        // 중복 방지를 위해 set 생성
        Set<Integer> prime = new HashSet<>();
        
        // 1은 포함되면 안되니 2 부터 시작
        for(int i = 2; i <= n; i++){
            // 계속 나눠주고 더해준다.
            while(n % i == 0){
                prime.add(i);
                n /= i;
            }
        }
       
        answer = new int[prime.size()];
        int index = 0;
        for(int num : prime){
            answer[index++] = num;
        }
        // set은 순서가 없으므로 오름차순 정렬해준다.
        Arrays.sort(answer);
        return answer;
    }
}