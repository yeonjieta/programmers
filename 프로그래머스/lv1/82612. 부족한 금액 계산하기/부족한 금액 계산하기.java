class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long total = 0;
        // 전체금액을 구하기 위한 반복문
        for(int i = 1; i <= count; i++){           
            total += price * i;
        }
        if(total > money){
            answer = total - money;
        }  
        else{
            // 금액이 부족하지 않을 경우 추가
            answer = 0;
        }
        return answer;
    }
}