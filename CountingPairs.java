public class CountingPairs {
    public static void main(String args[]) {
        int[] array = {1,1,1,2};
        System.out.println(new CountingPairs().countPairs(array, 1));
    }

    int countPairs(int array[], int k) {
        int count = 0;
        Utils.sort(array, array.length);
        int length = removeDuplicates(array, array.length);
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