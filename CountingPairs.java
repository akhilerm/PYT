import java.io.*;

public class CountingPairs {
    public static void main(String args[]) {
//        int[] array = {1,1,1,2};
        int array[] = new int[3000];
        int noOfInputs = 0, k=0, i = 0;
        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            noOfInputs = Integer.parseInt(br.readLine());
            i = 0;
            while (i < noOfInputs) {
                array[i++] = Integer.parseInt(br.readLine());
            }
            k = Integer.parseInt(br.readLine());
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(new CountingPairs().countPairs(array, noOfInputs, k));
    }

    int countPairs(int array[], int size, int k) {
        int count = 0;
        Utils.sort(array, size);
        int length = removeDuplicates(array, size);
        for (int i = 0;i < length;i++) {
            if (search(array, length, array[i] + k))
                count ++;
        }
        return count;
    }

    boolean search(int array[], int size, int element) {
        for (int i = 0;i < size;i++) {
            if (array[i] == element) {
                return true;
            }
        }
        return false;
    }

    int removeDuplicates(int array[], int length) {
        int i, j=0;
        for (i = 0;i < length - 1;i++) {
            if (array[i] != array[i+1]) {
                array[j++] = array[i];
            }
        }
        array[j++] = array[i];
        return j;
    }
}