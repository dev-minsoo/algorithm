import java.util.*;

class Solution {
    private boolean canPlaceMat(String[][] park, int startRow, int startCol, int size) {
        for(int row=startRow; row<startRow+size; row++) {
            for(int col=startCol; col<startCol+size; col++) {
                if(!park[row][col].equals("-1")) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public int solution(int[] mats, String[][] park) {
        mats = Arrays.stream(mats)
            .boxed()
            .sorted(Collections.reverseOrder())
            .mapToInt(Integer::intValue)
            .toArray();
        
        int height = park.length;
        int width = park[0].length;
        
        for(int matSize: mats) {
            for(int row=0; row<=height-matSize; row++) {
                for(int col=0; col<=width-matSize; col++) {
                    if(canPlaceMat(park, row, col, matSize)) {
                        return matSize;
                    }
                }
            }
        }
        
        return -1;
    }
}