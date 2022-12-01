package DSA1.Easy;

public class RemoveDuplicates {
    public static void removeDuplicates(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                if (arr[i] == arr[j]) {
                    continue;

                }

            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 3, 4, 7, 9, 1, 2, 5, 3, 8, 3, 4, 7, 6, 1 };

        removeDuplicates(arr);
    }
}
