package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray {
    public static void main(String args[]) {
        int[] arr = { 1, 2, 3, 4, 5, 6};

        reverseLib(arr);
        reverseInPlace(arr);
    }

    public static void reverseLib(int[] arr) {
        List<Integer> result = new ArrayList<Integer>(arr.length);
        for (int a : arr) {
            result.add(a);
        }
        Collections.reverse(result);
        System.out.println(Arrays.toString(result.toArray()));
    }

    public static void reverseInPlace(int[] arr) {

        int temp;
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1]  =temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
