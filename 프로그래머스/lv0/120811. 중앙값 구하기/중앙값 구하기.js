function solution(array) {
    array.sort((a,b) => a > b ? 1 : -1); // 오름차순으로 정렬하고 
    return array[Math.floor(array.length/2)]  // 중간값을 구하기 위해 길이를 2로 나누고 실수는 버린다.
}