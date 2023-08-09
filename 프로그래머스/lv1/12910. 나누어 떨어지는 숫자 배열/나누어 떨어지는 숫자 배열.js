function solution(arr, divisor) {
    var answer = []
    // 새로운 배열의 인덱스를 위한 변수를 생성하고
    let index = 0
    // 반복문에 안 if문에 해당하지 않는 경우를 위해 먼저 -1을 설정
    // 만약 if문에 해당되면 덮어씌워서 새로운 배열 생성 가능
    answer[index] = -1
    for(let i = 0; i < arr.length; i++){
        // 반복문을 통해 원소 중 divisor로 나눠지는 값을 answer 배열에 더한다.
        if(arr[i] % divisor == 0){
            answer[index] = arr[i]
            index++
        }
    }
    return answer.sort((a,b) => a - b);
}