package Array;

import java.util.Arrays;
import java.util.BitSet;

public class MissingNumberInArray {

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 5, 6, 7, 8, 9, 10 };
        int n = 10;

        int arr1[] = {1, 3, 4, 6, 7, 8, 9, 10};

        System.out.println(findSingleMissingNumber1(arr, n));
        System.out.println(findSingleMissingNumber2(arr));
        findMultipleMissingNumbers(arr1, n);
    }

    public static int findSingleMissingNumber1(int[] arr, int n) {
        int sum_n = (n * (n + 1)) / 2;
        int i_sum = 0;
        for (int e : arr) {
            i_sum += e;
        }

        if (i_sum == sum_n) {
            return 0;
        } else {
            return sum_n - i_sum;
        }
    }

    public static int findSingleMissingNumber2(int[] arr) {
        int sum = 1;
        for(int i=2; i<=(arr.length+1); i++) {
            sum += i;
            sum -= arr[i-2];
        }

        return sum;
    }

    public static void findMultipleMissingNumbers(int[] arr, int n) {
        BitSet b = new BitSet(n);

        for(int a: arr){
            b.set(a - 1);
        }

        System.out.println("Missing numbers in array "+Arrays.toString(arr));

        int missing = n - arr.length;
        int prevMissing = 0;

        for(int i=0; i<missing; i++) {
            prevMissing = b.nextClearBit(prevMissing);
            System.out.print(Integer.toString(++prevMissing) + ' ');
        }
        System.out.println();
    }

}
