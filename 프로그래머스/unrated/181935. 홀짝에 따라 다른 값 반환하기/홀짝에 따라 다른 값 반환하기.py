def solution(n):
    answer = 0
    if n % 2 == 0 :
        # 0부터 n-1 까지 이기 때문에 n+1로 해줘야한다.
        for i in range(n+1):
            if i % 2 == 0:
                answer += i*i
    else :
        for i in range(n+1):
            if i % 2 != 0:
                answer += i
    return answer