public class Bananas {
    public int minEatingSpeed(int[] piles, int h) {
        int k = 1;
        int n = piles.length;
        for (int i = 0; i < n; i++) {
            int x = h;
            while (x-- >= 0) {
                if (k >= piles[i]) {
                    continue;
                } else {
                    k++;
                }
            }
        }
        return k;
    }
}
