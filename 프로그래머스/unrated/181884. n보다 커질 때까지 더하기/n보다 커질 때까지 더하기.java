class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        for(int i = 0; i <numbers.length; i++){
            answer += numbers[i];
        // answer가 n 보다 크면 멈춘다.    
        if( answer > n){
            break;
        }  
        }
        return answer;
    }
}