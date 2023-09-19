public class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int i = 2; i <= n; i++) {
            // 소수 판별을 위한 변수
            boolean isPrime = true; 

            for (int j = 2; j * j <= i; j++) {                 // i가 j로 나누어 떨어지면 소수가 아님
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                answer++;
            }
        }

        return answer;
    }
}
