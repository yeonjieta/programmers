import java.util.Arrays;
class Solution {
    public int[] solution(int n, int k) {
        // 배열에 배수가 들어가기 때문에 길이는 몫이 된다.
        int length = n / k;
        int[] answer = new int[length];
        int index = 0;
        // 반복문을 통해 배열을 만들어준다.
      for(int i = 1; i <= n; i++){
          if( i % k == 0){
            answer[index] = i; 
              index++;
      }
      }
        // 오름차순으로 정렬해준다.
        Arrays.sort(answer);
        return answer;
    }
}