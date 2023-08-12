function solution(n) {
    var answer = ''
    let su = '수'
    let bak = '박'
    // 돌아가면서 홀수일 땐 '수' 를 짝수 일 땐 '박'을 더해준다. 
    for(let i = 1; i <= n; i++){
        if(i % 2 == 0){
            answer += bak
        }
        else{
            answer += su
        }
    }
    return answer;
}