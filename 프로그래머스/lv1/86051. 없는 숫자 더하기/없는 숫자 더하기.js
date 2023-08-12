function solution(numbers) {
    // answer에 0 ~ 9 까지 수를 넣어두고 
    var answer = [0,1,2,3,4,5,6,7,8,9]
    let total = 0
    // numbers 배열에 answer의 원소들이 있는지 확인한다.
    for(let i = 0; i < answer.length; i++){
        if(!numbers.includes(answer[i])){
            // 그리고 들어가있지 않은 원소를 total에 더해준다.
            total += answer[i]
        }
    }
    return total;
}