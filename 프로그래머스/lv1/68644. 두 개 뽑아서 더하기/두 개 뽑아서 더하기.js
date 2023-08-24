function solution(numbers) {
    var answer = [];

    // 각 인덱스의 원소마다 더 한 후 
    for(let i = 0; i < numbers.length - 1; i++){
        for(let j = i + 1; j < numbers.length; j++){
            answer.push(numbers[i] + numbers[j])
        }
    }
    
    // 오름차순 정렬 후 중복 제거 후 다시 배열로
    answer = Array.from(new Set(answer.sort((a, b) => a - b)));
    
    return answer;
}
