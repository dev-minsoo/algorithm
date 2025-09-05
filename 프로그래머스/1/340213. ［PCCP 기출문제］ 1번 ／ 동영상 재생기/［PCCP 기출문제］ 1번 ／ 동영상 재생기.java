class Solution {
    private int calculSecond(String times) {
        String[] time = times.split(":");
        return Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]);
    }
    
    private String calculTime(int seconds) {
        int minuate = seconds / 60;
        int second = seconds % 60;
        return zeroPadding(minuate) + ":" + zeroPadding(second);
    }
    
    private String zeroPadding(int num) {
        String numStr = Integer.toString(num);
        if (numStr.length() == 1) numStr = "0" + numStr;
        return numStr;
    }
    
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int videoSecond = calculSecond(video_len);
        int posSecond = calculSecond(pos);
        int opStartSecond = calculSecond(op_start);
        int opEndSecond = calculSecond(op_end);
        
        for(String command : commands) {    
            if (command.equals("prev")) {
                posSecond -= 10;
                if(posSecond < 0) {
                    posSecond = 0;
                }
            } else { // "next"
                if(posSecond >= opStartSecond && posSecond <= opEndSecond) {
                   posSecond = opEndSecond;
                }
                posSecond += 10;
                if(posSecond > videoSecond) {
                    posSecond = videoSecond;
                }
            }
            
            if(posSecond >= opStartSecond && posSecond <= opEndSecond) {
                posSecond = opEndSecond;
            }
        }
        
        String answer = calculTime(posSecond);
        return answer;
    }
}