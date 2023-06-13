// n명이 똑같은 조각의 피자 수를 먹어야 한다.
// 피자는 여섯조각으로 나눈다.

class Solution {
    public int solution(int n) {
        int answer = 0;
    for(int i = 1; i <= 100; i ++){
        if((n * i) % 6 == 0){
            // 피자를 6명에게 공정하게 나눠주기 위해서 n명 * i(반복문을 통해 달라지는 값)를 하다
            // 그 값이 6의 배수가 되면 
            answer = n * i / 6;
            // 피자 판 수를 구해야 하니 조각의 갯수인 6을 나눠 결과를 구하고
            break;
            // 멈춘다.
        }
    }
           return answer;
    }
}