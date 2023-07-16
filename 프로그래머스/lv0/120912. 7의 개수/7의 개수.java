import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String num = Arrays.toString(array);
        char[] ch = num.toCharArray();
        for(int i = 0; i < num.length(); i++){
            if(ch[i] == '7'){
                answer +=1;
            }
        }
        return answer;
    }
}