class Solution {
    public int solution(int n, int k) {
        int food = 12000*n;
        int free = n / 10;
        int answer = food + (k - free)*2000;
        return answer;
    }
}