class Solution {
    public int solution(int[] a, int[] b) {
        // total을 위한 변수 answer를 생성하고
        int answer = 0;
        // 반복문을 통해 각 인덱스 값들끼리 곱한걸 더해준다.
        for(int i = 0; i < a.length; i++){
            answer += a[i] * b[i];
        }
        return answer;
    }
}