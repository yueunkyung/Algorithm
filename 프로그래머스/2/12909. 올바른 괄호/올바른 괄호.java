class Solution {
    boolean solution(String s) {
        boolean answer = true;

        char[] sArr = s.toCharArray();
        int cnt = 0;

        for(int i = 0; i < sArr.length; i++) { 
            if(sArr[i] == '(') {
                cnt++;
            } else if(sArr[i] == ')') {
                cnt--;
                if(cnt < 0){
                    return false;
                }
            }
        }

        return cnt==0;
    }
}