function solution(numbers) {
    var descendingArr = numbers.sort((a, b) => b - a);
    
        
    return descendingArr[0] * descendingArr[1];
}