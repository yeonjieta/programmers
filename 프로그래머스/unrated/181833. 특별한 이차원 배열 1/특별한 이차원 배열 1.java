class Solution {
    public int[][] solution(int n) {
        // answer 이차원배열의 길이는 각 n씩이다
        int[][] answer = new int[n][n];
        // 반복문을 돌려 0,0 1,1 이런식으로 배열의 순서끼리 동일할 때만 1을 넣는다
        for(int i = 0; i < n; i++){           
            answer[i][i] = 1;    
        }
        return answer;
    }
}