function solution(num_list) {
    let total = 0
    let multiply = 1
    let length = num_list.length
    for(let i = 0; i < length; i++){
        total += num_list[i]
        multiply *= num_list[i]
    }
    if(multiply < total*total){
        return 1
    }
    else {
        return 0
    }
}