class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i =1; i <= n / i; i++){
            // n을 0으로 나누는건 불가능 하니 1 부터 시작한다.
            if( i * i == n){
                answer = 1;
            }          
            else{
                answer = 2;
            }
        }
        return answer;
    }
}