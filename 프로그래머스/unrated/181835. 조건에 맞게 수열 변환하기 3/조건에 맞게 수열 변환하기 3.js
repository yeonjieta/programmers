function solution(arr, k) {
    var answer = []
    if(k % 2 == 0){
        for(let i = 0; i < arr.length; i++){
            answer[i] = arr[i] + k
        }
    }
    else{
        for(let i = 0; i < arr.length; i++){
            answer[i] = arr[i] * k
        }
    }
    return answer
}