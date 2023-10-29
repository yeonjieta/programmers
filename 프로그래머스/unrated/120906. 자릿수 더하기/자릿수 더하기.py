def solution(n):
    answer = 0
    nStr = str(n)
    for i in nStr:
        answer += int(i)
    return answer