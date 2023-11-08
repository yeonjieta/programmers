import java.util.*;

class Solution {
    public int solution(String binomial) {
        int answer = 0;
        //
        String[] plus = binomial.split(" \\+ ");
        String[] minus = binomial.split(" \\- ");
        String[] multiply = binomial.split(" \\* ");
        System.out.print(Arrays.toString(plus));
        System.out.print(Arrays.toString(minus));
        System.out.print(Arrays.toString(multiply));

        if(binomial.contains("+")){
            answer = Integer.parseInt(plus[0]) + Integer.parseInt(plus[1]);
        }
        if(binomial.contains("-")){
            answer = Integer.parseInt(minus[0]) - Integer.parseInt(minus[1]);
        }
        if(binomial.contains("*")){
            answer = Integer.parseInt(multiply[0]) * Integer.parseInt(multiply[1]);
        }
        return answer;
    }
}