
class ClosestSum {
    public static void closestSum(int[] ar1, int[] ar2, int m, int n, int x) {
        int diff = Integer.MAX_VALUE;

        int left = 0, right = 0;
        int l = 0, r = n - 1;

        while (l < m && r >= 0) {
            if (Math.abs(ar1[l] + ar2[r] - x) < diff) {
                left = l;
                right = r;
                diff = Math.abs(ar1[l] + ar2[r] - x);
            }
            if (ar1[l] + ar2[r] > x)
                r--;
            else
                l++;
        }
        System.out.print("[ " + ar1[left] + ", " + ar2[right] + " ]");
    }

    public static void main(String[] args) {
        int ar1[] = { 1, 4, 5, 7 };
        int ar2[] = { 10, 20, 30, 40 };
        int n = ar1.length;
        int m = ar2.length;
        int x = 38;
        closestSum(ar1, ar2, m, n, x);
    }

}
