class Solution {
    public int solution(int n) {
        int answer = n / 7;
        // 피자조각이 7개이며 사람수가 n이니 n / 7 하면 몫이 나온다.
        if(n % 7 != 0){
            // 만약 n을 7로 나눴을 때 0이 아니면 그 몫에서 +1을 하면 모든 사람이 한조각 이상 먹을 수 다. 0이면 딱 맞아떨어지는것이기 때문에 1조각 이상씩은 꼭 돌아간다.
            answer +=1;
        }
        return answer;
    }
}