function solution(s) {
    // s를 배열로 변환 후 내림차순으로 정렬 후 문자열로 변환해 준다.
    return Array.from(s).sort((a,b) => a < b ? 1 : -1).join('')
}