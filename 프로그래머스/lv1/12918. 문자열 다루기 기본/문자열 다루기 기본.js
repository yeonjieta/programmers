function solution(s) {
    // s의 길이가 4 또는 6이 아니면 false 반환
    if (s.length !== 4 && s.length !== 6) {
        return false
    }

    // s의 각 문자를 순회하면서 숫자가 아닌 문자가 있는지 확인
    for (let char of s) {
        if (char < '0' || char > '9') {
            return false
        }
    }

    // 모든 문자가 숫자인 경우 true 반환
    return true
}
