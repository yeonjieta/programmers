using System;

public class Solution {
    public int[] solution(int[] num_list) {
        // c#에서는 길이를 length 가 아닌 Length 라고 쓴다.
        int[] answer = new int[num_list.Length];
        for(int i = 0; i < num_list.Length; i++){
            int j = num_list.Length -i -1 ;
            answer[i] = num_list[j];
        }
        return answer;
    }
}