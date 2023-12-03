class Solution {
    public int solution(int n) {
        int answer = 1;
        int incre = 1;
        
        while (true) {
            if (answer <= n) {
                incre++;
                answer *= incre;
            } else {
                incre--;
                break;
            }
        }
        return incre;
    }
}