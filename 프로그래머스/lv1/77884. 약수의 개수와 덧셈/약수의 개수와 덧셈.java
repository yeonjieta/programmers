class Solution {
    public int solution(int left, int right) {
        int answer = 0;     
        for(int i = left; i <=right; i++){
        int count = 0;
            // 약수의 개수를 구하기 위한 반복문
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    count++;
                }
            }
             if(count % 2 == 0){
                    answer += i;
                }
                else{
                    answer -= i;
                }
        }
        return answer;
    }
}