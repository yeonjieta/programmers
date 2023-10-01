function solution(a, b) {
    var answer = 0
    // 모두 홀수 일 때
    if(a % 2 != 0 && b % 2 != 0){
        answer = a*a + b*b
    }
    // 하나만 홀수 일 때
    else if(a % 2 != 0 || b % 2 != 0){
        answer = 2 * (a + b)
    }
    // 짝수 일 땐 절대값
    else if(a % 2 === 0 && b % 2 === 0){
        answer = Math.abs(a - b)
    }
    return answer
}