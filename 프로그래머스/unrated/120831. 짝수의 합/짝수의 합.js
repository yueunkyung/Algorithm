function solution(n) {
    var answer = 0;
    var flag = 0 < n && n <= 1000;
    if(flag) {        
        for(var i=0; i<=n; i++) {
            if(i%2 == 0) {
                answer += i;
            }
        }
    }
    
    return answer;
}