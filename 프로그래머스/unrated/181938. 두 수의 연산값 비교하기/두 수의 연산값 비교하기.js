function solution(a, b) {
    let c = a.toString() + b.toString()
    let d = +(2 * a * b)
    if(+c >= d){
        return +c
    }
    else {
        return d
    }
}