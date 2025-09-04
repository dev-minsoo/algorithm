import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        Map<String, Integer> columnMap = new HashMap<>();
        columnMap.put("code", 0);
        columnMap.put("date", 1);
        columnMap.put("maximum", 2);
        columnMap.put("remain", 3);
        
        int extIndex = columnMap.get(ext);
        int sortIndex = columnMap.get(sort_by);
        
        List<int[]> filteredData = new ArrayList<>();
        
        for(int[] row : data) {
            if(row[extIndex] < val_ext) {
                filteredData.add(row);
            }
        }
        
        filteredData.sort((a, b) -> Integer.compare(a[sortIndex], b[sortIndex]));
        
        return filteredData.toArray(new int[filteredData.size()][]);
    }
}