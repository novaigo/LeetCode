class Solution {
    public boolean isHappy(int n) {
        int s = n; // slow
        int f = n; // fast

        do {
            s = compute(s);
            f = compute(compute(f));

            if (s == 1) {
                return true;
            }
        } while (s != f); // provera za detekciju ciklusa

        return false; // vracanje false ako se ciklus detektira
    }

    private int compute(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}