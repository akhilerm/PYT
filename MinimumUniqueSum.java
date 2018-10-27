public class MinimumUniqueSum {
	public static void main(String args[]) {
        int array[] = {3,1,2,7,2};
        System.out.println(getMinimumUniqueSum(5,array));
	}

	private static int getMinimumUniqueSum(int n, int arr[]) {
        int sum = 0;
        int i, j;

        sort(arr,n);

        

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
}