// 장군개미 공격력 5, 병정 3, 일 1
// ex) 여치 hp 23  장군 4 병정 1 (최소한의 병력)
class Solution {
    public int solution(int hp) {
        int answer = 0;
        if (hp % 5 == 0){
            answer = hp / 5;
        }
        else if (hp % 5 % 3 == 0){
            answer = hp / 5 + hp % 5 / 3;
        }
        else if (hp % 5 % 3 != 0){
            answer = hp / 5 + hp % 5 /3 + hp % 5 % 3;
        }
        return answer;
    }
}