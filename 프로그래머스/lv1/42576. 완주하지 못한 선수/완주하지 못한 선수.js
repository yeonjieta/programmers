function solution(participant, completion) {
    let answer = ''
    // 둘 다 정렬을 한 후
    participant.sort()
    completion.sort()

    // 반복문을 통해 같지 않은걸 찾다가, 찾으면 바로 멈춘다
    for(let i = 0; i < participant.length; i++) {
        if(participant[i] !== completion[i]) {
            answer = participant[i]
            break
        }
    }
    return answer
}