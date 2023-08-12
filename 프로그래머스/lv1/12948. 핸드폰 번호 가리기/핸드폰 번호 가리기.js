// 전체 길이 중 뒤 4개만 남기고 앞은 다 *로 대체한다.
// fill 함수 사용 fill(대체할 값, 시작인덱스, 끝인덱스+1)
function solution(phone_number) {
    // 문자열을 배열로 바꾸고 fill함수로 뒤 4자리 빼고 다 *로 대체한뒤, 문자열로 다시 바꿔준다.
    return Array.from(phone_number).fill('*', 0, phone_number.length - 4).join('')
}