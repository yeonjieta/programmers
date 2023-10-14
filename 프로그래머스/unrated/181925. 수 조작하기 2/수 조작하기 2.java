class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        // i+1 과 i 를 비교해야하기 때문에 i+1이 범위를 넘게된다.
        // 그래서 numLog.length - 1을 범위로 잡는다.
        for(int i = 0; i < numLog.length - 1; i++){
            if(numLog[i+1] - numLog[i] == 1){
                answer += 'w';
            }
            else if(numLog[i+1] - numLog[i] == -1){
                answer+= 's';
            }
            else if(numLog[i+1] - numLog[i] == 10){
                answer += 'd';
            }
            else if(numLog[i+1] - numLog[i] == -10){
                answer += 'a';
            }
        }
        return answer;
    }
}