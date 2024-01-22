class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        int startX = wallpaper[0].length();
        int endX = 0;
        int startY = wallpaper.length;
        int endY = 0;
        
        boolean flag = true;
        
        for (int i = 0; i < wallpaper.length; i++) {
            if (wallpaper[i].indexOf("#") != -1) { //1
                if (startX > wallpaper[i].indexOf("#")) {
                    startX = wallpaper[i].indexOf("#");
                }
                if (flag) { //2 
                    startY = i;
                    flag = false;
                }
                if (endX < wallpaper[i].lastIndexOf("#")) {
                    endX = wallpaper[i].lastIndexOf("#");
                }
                endY = i;
            }
        }
        answer[0] = startY;
        answer[1] = startX;
        answer[2] = endY+1;
        answer[3] = endX+1;
        return answer;
    }
}