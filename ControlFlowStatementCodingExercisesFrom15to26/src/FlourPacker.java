public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        else {
            int comparingValueBig = 0;
            int comparingValueSmall = 0;
            int auxSmallCount = goal % 5;

            if (bigCount > 0) {
                int auxBigCount = goal / 5;

                for (int i = 0; i<auxBigCount; i++) {
                    comparingValueBig += 5;
                }
                for (int i = 0; i<auxSmallCount; i++){
                    comparingValueSmall +=1;
                }
            }
            else {
                for (int i = 0; i<auxSmallCount; i++){
                    comparingValueSmall +=1;
                }
            }
            return comparingValueBig/5 <= bigCount && comparingValueSmall <= smallCount;


        }
    }
}

