using System;

public class Solution {
    public int solution(int num, int n) {
        // c#도 자바처럼 삼항연산자가 가능하다
        return num % n == 0 ? 1 : 0;
    }
}