import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        String number="";
        String filter="0123456789";
        for(int i = 0; i < my_string.length(); i++){
            if(filter.contains(String.valueOf(my_string.charAt(i)))){
                number += my_string.charAt(i);
            }
        }
        String[] arr = number.split("");
        int[] answer = new int[arr.length];
        for(int i = 0; i < answer.length; i++){
            answer[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(answer);
        return answer;
    }
}