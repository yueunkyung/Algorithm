function solution(num1, num2) {
    var answer = 0;
    var flag = num1>=-50000 && num1<=50000 && num2>=-50000 && num2<=50000;
    
    if(flag){
        answer = num1 - num2;    
    }    
    
    return answer;
}