function solution(num_list) {
    var answer = 0
    let odd = num_list[0] 
    // 여기선 0번째 원소를 1번째 원소로 취급하니 0,2,4 ... 이 원소들을 odd라 하겠다
    // 0번째가 합에 포함돼야하니 먼저 여기에 설정해준다.
    let even = 0 // 영단어로 따지면 반대지만 문제에서 0번째를 1번으로 취급하니 반대로 설정
    
    for(let i = 1; i < num_list.length; i++){
        if(i % 2 == 0){
            odd += num_list[i]
        }
        else{
            even += num_list[i]  
        }
    }
    if( odd >= even){
        answer = odd
    }
    else{
        answer = even
    }
    
    return answer
}