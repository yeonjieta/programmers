class Solution {
    public int[][] solution(int[] num_list, int n) {
        // 2차원배열의 길이는 num_list 배열을 n 만큼 나눈 것이며
        // 안 배열의 길이는 n 개이다.
        int[][] answer = new int[num_list.length / n][n];
        // num_list의 index를 이용해 안 배열에 값을 넣어주기 위해 생성
        int idx = 0;
        for(int i = 0; i < answer.length; i++){
            // 안 배열을 위해 새로운 배열을 생성하고
            int[] inner = new int[n];
            // 반복문을 통해
            for(int j = 0; j < n; j++){
                // 안 배열에 요소를 넣는다.
                inner[j] = num_list[idx];
                // num_list의 요소를 순서대로 넣어야 하므로
                // +1 씩해준다.
                idx++;
            }
            // 그리고 2차원 밖 배열의 첫번째 요소에 안배열을 넣어준다.
            answer[i] = inner;
            
        }
        return answer;
    }
}