class Solution {
    public long[] solution(long x, int n) {
        // answer  배열의 길이는 n과 같으니 n으로 지정해주고
        long[] answer = new long[n];
        // answer 배열의 index값을 위해 변수를 생성
        int index = 0;
        for(int i = 1; i <= n; i++){
            // 1 부터 n까지를 x와 곱한게 배열에 담겨야하므로
            answer[index] = i * x;
            index++;
        } 
        return answer;
    }
}