// 피자 2 ~ 10 조각(slice), 먹는 사람 n명 , n명이 최소 한조각이상 먹어야함
// if n % slice == 0 result = n / slice , n % slice != 0 && n > slice  result = n / slice + 1
class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        if(n % slice == 0 ){
            answer = n / slice;
        }
        // n명에 조각수를 나눴을 때 딱 떨어지면 그만큼의 수가 피자 판 수가 된다.
        if(n % slice != 0 && n > slice){
            answer = n / slice + 1;
        }
        if(n < slice){
            answer = 1;
        }
        // 사람수가 조각수보다 작을 경우는 어차피 한 조각씩 다 돌아가기 때문에 생각할 필요 없고
        // 사람수가 조각수보다 많을 경우 + 딱 떨어지지 않을 땐 , 몫을 구한 후 거기서 1판 만 
        // 추가로 제공하면 모든 사람이 한 조각 이상 씩 먹을 수 있다.
        return answer;
    }
}