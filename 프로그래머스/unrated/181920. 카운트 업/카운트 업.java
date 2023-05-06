class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[end - start + 1];
        for(int i = start; i <= end; i++){
            answer[i-start] +=i; 
            // i는 start부터 시작하니까 start만큼을 빼줘야 0 부터시작
        }
        return answer;
    }
}