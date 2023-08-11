function solution(absolutes, signs) {
  
    let total = 0
    // 만약 ture 이면 그대로 합에 더하고
    for(let i = 0; i < absolutes.length; i++){
        if(signs[i] == true){
            total += absolutes[i] 
        }
    // 만약 false이면 -1을 곱해 더한다
        else {
            total += absolutes[i] * -1
        }
    }
    return total
}