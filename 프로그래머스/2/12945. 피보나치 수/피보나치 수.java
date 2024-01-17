class Solution {
    public int solution(int n) {
        int[] intArray = new int[n+1];
        intArray[0] = 0;
        intArray[1] = 1;
        for(int i=2; i<=n; i++) {
            intArray[i] = (intArray[i-2] + intArray[i-1])%1234567; 
        }
        return intArray[intArray.length-1];
    }
}