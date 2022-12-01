public class CountOnes {
    private static int countOnes(int[] arr, int l, int r) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            if ((mid == l || arr[mid - 1] == 0) && arr[mid] == 1)
                return r - mid;

            if (arr[mid] == 1)
                return countOnes(arr, mid + 1, r);

            return countOnes(arr, l, mid - 1);
        }
        return 0;

    }

    public static void main(String[] args) {
        int[] arr = { 0, 0, 0, 1, 1, 1 };
        int n = arr.length;
        System.out.println(countOnes(arr, 0, n));

    }
}
