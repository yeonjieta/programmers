def solution(num_list):
    # 변수 선언
    answer = 0 
    odd = ""
    even = ""
    # 반복문을 돌려 홀수 짝수를 구분 후 각 변수에 문자열로 더해준다.
    for i in num_list:
        if i % 2 != 0 :
            odd += str(i)
        else :
            even += str(i)
    # 다시 정수로 변환해 더해준다
    answer = int(odd) + int(even)
    return answer