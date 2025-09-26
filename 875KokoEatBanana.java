class KokoEatBanana {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        long total = 0;

        for (int p : piles) {
            total += p; // total bananas
        }

        // Lower bound (at least total/h bananas per hour)
        int left = (int) ((total - 1) / h) + 1;

        // Upper bound (if she eats most evenly)
        int right = (int) ((total - n) / (h - n + 1)) + 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            int time = 0;
            for (int m : piles) {
                time += (m - 1) / mid + 1; // same as ceil(m / mid)
            }

            if (time > h) {
                left = mid + 1; // not enough speed
            } else {
                right = mid; // try smaller speed
            }
        }

        return left;
    }
}
