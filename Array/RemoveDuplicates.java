package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class RemoveDuplicates {
    public static void main(String args[]) {
        int[] arr = { 1, 2, 3, 3, 4, 5, 5, 6, 7, 7 };

        System.out.println(Arrays.toString(removeDupLib(arr)));
        System.out.println(Arrays.toString(removeDupZeros(arr)));
        System.out.println(Arrays.toString(removeDupShift(arr)));
    }

    public static int[] removeDupLib(int[] arr) {
        HashSet<Integer> unique = new HashSet<>();

        for (int e : arr) {
            unique.add(e);
        }

        int[] result = new int[unique.size()];
        int i = 0;
        Iterator<Integer> set = unique.iterator();
        while (set.hasNext()) {
            result[i++] = set.next();
        }

        return result;
    }

    public static int[] removeDupZeros(int[] arr) {
        int[] result = new int[arr.length];
        result[0] = arr[0];
        int prev = arr[0];

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != prev){
                result[i] = arr[i];
            }
            prev = arr[i];
        }

        return result;
    }

    public static int[] removeDupShift(int[] arr) {
        Arrays.sort(arr);
        int i = 0;
        for(int j = 1; j<arr.length; j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        return Arrays.copyOfRange(arr, 0, i+1);
    }
}
