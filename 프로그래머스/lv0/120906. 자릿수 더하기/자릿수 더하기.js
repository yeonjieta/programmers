function solution(n) {
    var answer = 0;
    let str = n.toString()
    let arr = Array.from(str)
    for(let i = 0; i < arr.length; i++){
        answer += +arr[i]
    }
    return answer;
}