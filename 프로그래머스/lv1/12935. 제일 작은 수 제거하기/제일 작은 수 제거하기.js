// 최소값만 제거한다.
function solution(arr) {
    var answer = []
    // 일단 arr의 길이가 1이면 -1일 리턴하랬으니 먼저 조건을 적어주고
    if(arr.length === 1){
        return [-1]
    }
    
    // 최소값을 젤 첫번째 원소로 정한 후
    let min = arr[0] 
    // 반복문을 통해 비교해 진짜 최소값을 찾아낸다.
    for(let i = 0; i < arr.length; i++){
        if(min > arr[i]){
            min = arr[i]
        }
    }
    // 그리고 filter를 사용해 최소값을 뺀다.
    answer = arr.filter(ob => ob != min)
    return answer;
}