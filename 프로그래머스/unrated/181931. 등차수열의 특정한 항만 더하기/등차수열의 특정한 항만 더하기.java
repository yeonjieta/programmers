class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        for(int i = 0; i < included.length; i++){
            // included의 i 번째 요소가 true 이면 
            if(included[i]){
                // 더해준다.
                answer += a + d*i;
            }
        }
        return answer;
    }
}