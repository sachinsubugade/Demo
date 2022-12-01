public class BinarySearch {
    public int binarySearch(int[] arr, int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == x)
                return mid;

            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }

    public static void main(String[] args) {

        BinarySearch obj = new BinarySearch();

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int n = arr.length;
        int x = 50;
        int result = obj.binarySearch(arr, 0, n - 1, x);

        if (result == -1)
            System.out.println("number is not present");
        else
            System.out.println("number present at " + result + " index");
    }
}
