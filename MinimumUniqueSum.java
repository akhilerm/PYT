public class MinimumUniqueSum {
	public static void main(String args[]) {
        int array[] = {3,1,2,7,2,2,3};
        System.out.println(getMinimumUniqueSum(7,array));
	}

	private static int getMinimumUniqueSum(int n, int arr[]) {
        int sum = 0;
        int i, j;

        Utils.sort(arr,n);

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

        Utils.print(arr, n);

        return sum;
	}

}