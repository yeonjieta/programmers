import java.math.*;

class Solution {
    public String solution(String a, String b) {
        String answer = "";
        // BigInteger을 초기화하기 위해서는 문자열을 인자 값으로 넘겨주어야 한다.
        BigInteger aNum = new BigInteger(a);
        BigInteger bNum = new BigInteger(b);
        // 문자열이기 때문에 add를 써줘야 더해진다.
        BigInteger num = aNum.add(bNum);
        answer = num.toString();
        return answer;
    }
}