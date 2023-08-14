function solution(n) {
    // 곱해야하니 1을 기본값으로 두고
    var answer = 1
    // 1 ~ n 까지 반복문을 돌리면서
    for(let i = 1; i <= n; i++){
        // 팩토리얼이니 계속 곱해준다.
        answer *= i
        // 만약 계속 곱한 수가 n 과 같으면 n을 반환하고
        if(answer == n){
            return i
        }
        // n보다 크다면 1을 뺀 수를 반환한다.
        // i를 바로 한 번 더 곱했을 때 n보다 커진다면 그 밑 수가 n과 제일 가까우면서 이하인 수이기 때문이다.
        if(answer > n){
            return i - 1
        }
    }
}