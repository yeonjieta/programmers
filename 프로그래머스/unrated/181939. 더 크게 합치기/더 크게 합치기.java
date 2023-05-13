public class Solution {
    public static int solution(int a, int b) {
        String ab = String.valueOf(a) + String.valueOf(b); // a와 b를 붙인 값
        String ba = String.valueOf(b) + String.valueOf(a); // b와 a를 붙인 값

        if (ab.equals(ba)) { // 두 값이 같은 경우
            return Integer.parseInt(ab);
        } else if (ab.compareTo(ba) > 0) { // ab가 더 큰 경우
            return Integer.parseInt(ab);
        } else { // ba가 더 큰 경우
            return Integer.parseInt(ba);
        }
    }
}