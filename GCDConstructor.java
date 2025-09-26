public class LCM {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static int find(int... nums) {
        int lcm = nums[0];
        for (int i = 1; i < nums.length; i++) {
            lcm = (lcm * nums[i] / gcd(lcm, nums[i]));
        }
        return lcm;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(LCM.find(10, 4, 15, 8));
        System.out.println(LCM.find(10, 15));
        System.out.println(LCM.find(3, 5, 7));
    }
}