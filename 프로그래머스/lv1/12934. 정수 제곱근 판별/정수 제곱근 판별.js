function solution(n) {
    let x = 0
    // 제곱이 같은 수를 곱해서 나오는 것이기 때문에 n으로 나눈 수와 몫이 같아야하기 때문에 if문 조건을 이렇게 정함
    for(let i = 0; i <=n; i++){
        if(n / i == i){
            x = i
            return (x+1) * (x+1)
        }
    }
    // 제곱이 아닐 땐 -1을 반환
      for(let i = 0; i <=n; i++){
        if(n / i != i){
            return -1
        }
    }
    
}