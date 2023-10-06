class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++){
            // count의 수가 i마다 초기화 돼야하기 때문에 반복문 안에서 생성
            int count = 0;
            for(int j = 1; j <= i; j++){
                // 약수의 개수를 구하고
                if(i % j == 0){
                    count++;
                }
            }
            // 세개 이상이면 anwer에 +1 해준다.
            if(count >= 3){
              answer++;  
            }
        }
        return answer;
    }
}