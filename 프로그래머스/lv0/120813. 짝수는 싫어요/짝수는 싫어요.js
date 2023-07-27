// 첫번째 방식
function solution(n) {
    let answer = []
                           
    let index = 0
    for(let i = 1; i <= n; i++){
        if(i % 2 != 0){
            answer[index] = i
            index++
        }
    }
    return answer
}

// 두번째 방식
function solution(n) {
    let answer = []
                           
    let element = 1
    for(let i = 0; i < Math.floor((n+1) /2); i++){
            answer[i] = element
            element += 2
        
    }
    return answer
}