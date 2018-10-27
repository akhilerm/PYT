import java.io.*;
public class MinimumUniqueSum {
	public static void main(String args[]) {
//        int array[] = {3,1,2,7,2,2,3};
        int array[] = new int[3000];
        int noOfInputs,i = 0;
        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            noOfInputs = Integer.parseInt(br.readLine());
            i = 0;
            while (i < noOfInputs) {
                array[i++] = Integer.parseInt(br.readLine());
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(getMinimumUniqueSum(noOfInputs, array));
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

//        Utils.print(arr, n);

        return sum;
	}

}