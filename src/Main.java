import java.util.Arrays;

public class Main {
    public static void findPair(int[] ints, int target) {
        Arrays.sort(ints);
        System.out.printf("Sorted Arrays " + Arrays.toString(ints));
        int low = 0;
        int high = ints.length - 1;
        while (low < high) {
            // sum found
            if (ints[low] + ints[high] == target) {
                System.out.printf("\nTarget Pair for " + target + " found (%d, %d)\n", ints[low], ints[high]);
                return;
            }
            if (ints[low] + ints[high] < target) {
                low++;
            } else {
                high--;
            }
        }
        System.out.println("\nTarget Pair for " + target + " not found :)");
    }

    public static void findSecondMax(int[] ints) {
        Arrays.sort(ints);
        int i;
        int max1 = ints[0];
        int max2 = ints[1];
        if (max1 > max2) {
            max1 = ints[1];
            max2 = ints[0];
        }
        for (i = 2; i < ints.length; i++) {
            if (ints[i] > max1) {
                max2 = max1;
                max1 = ints[i];
            }
        }
        System.out.printf("Second Max found (%d) \n", max2);
        System.out.printf("Max found (%d) \n", max1);
    }

    public static void findMissingNumber(int[] ints) {
        int n = ints.length;
        int sum = ((n + 1) * (n + 2)) / 2;
        for (int i = 0; i < n; i++)
            sum -= ints[i];
        System.out.println("Missing Number is " + sum);
    }

    public static void findDuplicateNumber(int[] ints) {
        int n = ints.length;
        int sum = ((n + 1) * (n + 2)) / 2;
        for (int i = 0; i < n; i++)
            sum -= ints[i];
        System.out.println("Duplicate Number is " + sum);
    }

    public static void binarySearch(int[] ints, int To_Find) {
        System.out.println("Binary Search Arr" + Arrays.toString(ints));
        int i = 0, j = ints.length - 1;
        while (j - i > 1) {
            int mid = (j + i) / 2;
            if (ints[mid] < To_Find) {
                i = mid + 1;
            } else {
                j = mid;
            }
        }
        if (ints[i] == To_Find) {
            System.out.println(To_Find + " Found At Index " + i);
        } else if (ints[j] == To_Find) {
            System.out.println(To_Find + " Found At Index " + j);
        } else {
            System.out.println(To_Find + " Not Found");
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello there!");
        int[] ints = {2, 91, 1, 33, 34, 10};
        int[] ints1 = {2, 7, 1, 4, 5, 3};
        int[] ints2 = {2, 7, 3, 4, 5, 3};
        int sum = 3;
        findPair(ints, sum);
        findSecondMax(ints1);
        findMissingNumber(ints1);
        findDuplicateNumber(ints2);
        binarySearch(ints1, 3);
    }
}