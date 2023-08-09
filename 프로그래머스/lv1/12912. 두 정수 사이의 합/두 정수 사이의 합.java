class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        // a와 b가 같다면 아무수나 반환
        if(a == b){
            answer = a;
        }
        // a가 더 크면 b ~ a
        else if(a > b){
            for(long i = b; i <= a; i++){
                answer +=i;
            }
        }
        // b가 더 크면 a ~ b
        else if(a < b){
            for(long i = a; i <= b; i++){
                answer +=i;
            }
        }
        return answer;
    }
}