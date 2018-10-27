public class MinimumUniqueSum {
	public static void main(String args[]) {
        int array[] = {3,1,2,7,2,2,3};
        System.out.println(getMinimumUniqueSum(7,array));
	}

	private static int getMinimumUniqueSum(int n, int arr[]) {
        int sum = 0;
        int i, j;

        sort(arr,n);

        for (i = 0;i < n;i++) {
            for (j = i+1;j < n;j++) {
                if (arr[i] == arr[j]) {
                    arr[j]++;
                }
                else {
                    break;
                }
            }
        }

        for (i = 0;i < n;i++) {
            sum +=arr[i];
        }

        print(arr, n);

        return sum;
	}

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