// Utility class for PYT Test
public class Utils {
    static void sort(int arr[], int length) {
        int i, j;
        int temp;
        for (i = 0;i < length;i++) {
            for (j = i+1;j < length;j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    static void print(int arr[], int length) {
        System.out.print("[");
        for (int i = 0;i < length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }
}