function solution(arr, n) {
    var answer = []
    const length = arr.length
    // 길이가 홀수이면
    if(length % 2 != 0){
        for(let i = 0; i < length; i++){
            // 짝수 인덱스 위치엔 n을 더하고
            if(i % 2 == 0){
               answer[i] = arr[i] + n
            }
            // 홀수 인덱스는 그대로 출력
            else{
                answer[i] = arr[i]
            }
        }
    }
    else{
        for(let i = 0; i < length; i++){
            if(i % 2 != 0){
               answer[i] = arr[i] + n
            }
            else{
                answer[i] = arr[i]
            }
        }
    }
    return answer
}