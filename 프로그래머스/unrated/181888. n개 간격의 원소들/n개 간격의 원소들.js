function solution(num_list, n) {
    var answer = []
    let count = 0
    for(let i = 0; i < num_list.length; i += n){
        answer[count] = num_list[i]
        count++

    }
    return answer;
}