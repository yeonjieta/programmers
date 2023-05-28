import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        // answer 배열엔 계산해서 넣어야할 마지막 요소 하나가 추가돼야 하기 때문에 num_list의 길이보다 +1을 해야함
        int index = 0; // answer의 요소를 넣어주기위한 index 변수를 추가해주고 
        for(int i = 0; i < num_list.length; i++){
            answer[i] += num_list[i]; // 일단 반복을 통해 num_list전체를 넣어주고
         if(num_list[num_list.length - 1] > num_list[num_list.length - 2]){
            answer[num_list.length] = num_list[num_list.length - 1] - num_list[num_list.length - 2]; // 문제의 조건에 맞게 계산을 해준다.  answer의 마지막 요소 = num_list의 마지막요소 -  num_list의 마지막요소 전의 요소
        }
        else {
             answer[num_list.length] = num_list[num_list.length - 1] * 2;
        }
        }
        return answer;
    }
}