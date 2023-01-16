package Array;

import java.util.Arrays;
import java.util.HashSet;

public class PairSum {
    public static void main(String args[]) {
        int sum = 10;

        int[] arr = { 1, 2, 5, 5, 4, 6, 3, 7 };

        System.out.println("O(nlogn)");
        printSumPairsInPlace(arr, sum);
        System.out.println("O(n)");
        printSumPairs(arr, sum);
    }

    public static void printSumPairsInPlace(int[] arr, int sum) {
        int l = 0;
        int r = arr.length - 1;
        Arrays.sort(arr);

        while (l < r) {
            if (arr[l] + arr[r] == sum) {
                System.out.println(Integer.toString(arr[l]) + ' ' + Integer.toString(arr[r]));
                l++;
                r--;
            } else if (arr[l] + arr[r] < sum) {
                l++;
            } else {
                r--;
            }
        }
    }

    public static void printSumPairs(int[] arr, int sum) {
        HashSet<Integer> visited = new HashSet<>();

        for (int e : arr) {
            if (visited.contains(sum - e)) {
                System.out.println(Integer.toString(e) + ' ' + Integer.toString(sum - e));

            } else {
                visited.add(e);
            }
        }
    }
}
