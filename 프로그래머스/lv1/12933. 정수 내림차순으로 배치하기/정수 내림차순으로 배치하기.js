function solution(n) {
    // n을 문자열로 변환 후 배열로 변환 후 각 원소를 Number 함수를 써 숫자로 바꾼다. 
    let answer = n.toString().split('').map(Number)
    // 그러고 나서 내림차순으로 정렬한 후 배열의 원소들을 문자열로 바꾼후 +를 써서 정수로 변환
    return +(answer.sort((a,b) => b - a).join(''))
}