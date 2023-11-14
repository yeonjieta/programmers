class Solution {
    public int solution(int[][] board, int k) {
        int answer = 0;
        // 반복문을 돌려 바깥 배열의 요소 안의
        for(int i = 0; i < board.length; i++){
            // 배열의 요소의 합을 비교해서 answer에 더해준다.
            for(int j = 0; j < board[i].length; j++){
                if(i + j <= k){
                    answer += board[i][j];
                }
            }
        }
        return answer;
    }
}