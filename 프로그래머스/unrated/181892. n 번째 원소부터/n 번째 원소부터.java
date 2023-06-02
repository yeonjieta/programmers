import java.util.Arrays;
class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length-n + 1];
            // answer에 새로운 배열을 생성해주는데, 길이는 num_list 전체길이에서  n 만큼 빼고 1을 더해준다.
        int index = 0;    
            // answer배열 안에 들어갈 index를 생성해주고
            for(int i = n-1; i<num_list.length; i++){
                // n-1부터 시작해서 마지막 원소까지
                answer[index] = num_list[i];
                index++;
            }
        return answer;
    }
}