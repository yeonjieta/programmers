def solution(n):
    # 소수점이 없어야 하기 때문에 // 사용 
    answer = n // 7
    if n % 7 != 0:
        answer += 1
    return answer