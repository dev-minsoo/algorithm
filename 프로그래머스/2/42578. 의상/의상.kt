class Solution {
    fun solution(clothes: Array<Array<String>>): Int {
        val map = hashMapOf<String, Int>()
        clothes.forEach { cloth -> map[cloth[1]] = map.getOrDefault(cloth[1], 0) + 1}
        
        var answer = 1
        map.values.forEach { count -> answer *= (count + 1) }
        
        return answer - 1
    }
}