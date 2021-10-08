package interview.huawei;

public class MainEatingSpeed {
    public int mainEatingSpeed(int[] piles, int h) {
        int maxSpeed = Integer.MIN_VALUE;
        for (int pile : piles) {
            maxSpeed = Math.max(maxSpeed, pile);
        }
        int left = 1;
        int right = maxSpeed;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (getEatingHour(piles, mid) > h) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }


    private int getEatingHour(int[] piles, int speed) {
        int hour = 0;
        for (int pile : piles) {
            hour += (pile + speed - 1) / speed;
        }
        return hour;
    }
}
