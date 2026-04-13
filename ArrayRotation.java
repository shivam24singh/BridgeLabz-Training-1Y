public class ArrayRotation {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int k = 3;
        int n = arr.length;

        k = k % n; // handle k > n

      
        for (int i = 0; i < k; i++) {
            int first = arr[0];
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = first;
        }

        System.out.print("Left Rotation: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}