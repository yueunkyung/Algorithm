function solution(age) {
    const year = 2022;
    var answer = 0;
    
    if(age > 0 && age <= 120){
        answer = (year - age) + 1;
    }
    
    return answer;
}