class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String A = String.valueOf(a);
        String B = String.valueOf(b);
        // 정수를 이어붙이기 valueOf를 사용해 문자열로 바꿔줌
        String C = A + B;
        int c = 2 * a * b;
        int C2 = Integer.valueOf(C);
        // 정수 비교를 위해 C를 다시 정수형타입으로 변환
        if (C2 >= c){
            answer = C2;
        }
        else {
            answer = c;
        }
        return answer;
    }
}