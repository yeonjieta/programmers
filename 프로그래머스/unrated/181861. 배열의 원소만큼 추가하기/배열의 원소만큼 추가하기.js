function solution(arr) {
    var answer = []
     for (let i=0; i<arr.length; i++) {
        let element = arr[i]
        for (let j=0; j<element; j++) {
            answer.push(element)
        }
    }
    return answer;
}