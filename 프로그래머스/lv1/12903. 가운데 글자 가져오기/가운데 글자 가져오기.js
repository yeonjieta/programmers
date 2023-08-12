function solution(s) {
    var answer = ''
    // 문자열을 s로 바꾼 뒤
    let arr = Array.from(s)
    // 전체 길이수가 홀수이면
    if(s.length % 2 != 0){
        // 정중앙 수를 뽑는다,Math.floor를 사용해 소수점은 버린다.
        answer = arr[Math.floor(s.length / 2)]
    } // 전체 길이수가 짝수이면 
    else{ // 길이에서 2를 나눈수와 그 앞수를 출력해야 정중아 2개의 수가 된다.
        answer = arr[Math.floor(s.length / 2) - 1] + arr[Math.floor(s.length / 2)]
    }
    
    return answer
}