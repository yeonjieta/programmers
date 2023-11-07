class Solution {
    public int solution(int[][] arr) {
        int answer = 1;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                // 원래는 == 로 했는데 안됐음 > i와 j가 둘 다 0인 경우는 무조건 같으니 
                // 기본 answer를 1로 초기화시키고 같지 않을 때 0을 반환 시키는걸로 하는게 맞음
                if(arr[i][j] != arr[j][i]){
                    answer = 0;
                }
            }
        }
        return answer;
    }
}