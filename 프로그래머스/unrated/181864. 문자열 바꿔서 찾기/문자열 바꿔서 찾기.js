function solution(myString, pat) {
    var answer = 0
    // 문자열을 배열로 변환한 뒤
    let arr = Array.from(myString)
    
    // 각 원소들이 A이면 B로 아니면 A로 바꿔줍니다.
    for(let i = 0; i < arr.length; i++){
        arr[i] = arr[i] == 'A' ? 'B' : 'A'
    }
    // 그리고 문자열로 다시 변환한 뒤
    myString = arr.join('')
    // pat이 포함되는지 확인합니다
    if(myString.includes(pat)){
        answer = 1
    }
    return answer
}