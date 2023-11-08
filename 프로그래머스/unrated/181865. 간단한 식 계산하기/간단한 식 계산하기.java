import java.util.*;

class Solution {
    public int solution(String binomial) {
        int answer = 0;
        // 그냥 +, -, *을 쓴다면 정규표현식에선 다른 의미가 있으므로
        // 이스케이프 문자를 써줘야 인식한다.
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