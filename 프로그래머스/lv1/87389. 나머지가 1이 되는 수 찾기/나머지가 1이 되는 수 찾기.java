class Solution {
    public int solution(int n) {
        int answer = 0;
        // 반복문을 통해 나머지가 1인 수를 구한다
        // 가장작은 자연수를 뽑아내야하므로 하나가 나오면 break를 걸어준다
        for(int i = 1; i < n; i++){
            if(n % i == 1){
                answer = i;
                break;
            }
        }
        return answer;
    }
}