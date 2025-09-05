class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int time = 1;
        int maxHealth = health;
        int success = 0;
        
        for(int[] attack : attacks) {
//             공격 받기 전 붕대 작업
            for(int i=time; i<attack[0]; i++) {
                success++;
                if (success == bandage[0]) {
                    health += bandage[1] + bandage[2];
                    success = 0;
                } else {
                    health += bandage[1];    
                }

                if (health > maxHealth) {
                    health = maxHealth;
                }
                
            }
//             공격
            health -= attack[1];
            success = 0;
            if (health <= 0) {
                return -1;
            }
            
            time = attack[0]+1;
        }
        
        return health;
    }
}