class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(n+1) / 2];
        int index = 0;
        // answer 배열 안의 index를 초기화해주고
        for(int i = 1; i <= n; i++){
            if(i % 2 != 0){ // i 를 2로 나눴을 때 0이 아니면 홀수 이므로
                answer[index] =i;  // answer[index]에 넣는다.
                index++;  // 그리고 index를 1씩 증가시켜준다.
            }
        }   
        return answer;
    }
}