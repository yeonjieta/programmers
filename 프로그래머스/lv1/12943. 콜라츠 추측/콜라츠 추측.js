function solution(num) {
    // i를 횟수로 잡는다. 
    for(let i=0;i<501;i++){
        //num 이 1 이면 그 횟수를 반환해야하니까 i를 반환하고 멈춘다.  
        if(num === 1){
            return i
            break
        // i가 500번이 됐지만 1이 되지 않는다면 -1을 반환하고
        }else if(i === 500){
            return -1
        }else if(num%2===0){
            num = num/2
        }else if(num%2!==0){
            num = (num*3)+1
        }
    }



}