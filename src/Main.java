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
        for (int anInt : ints) sum -= anInt;
        System.out.println("Missing Number is " + sum);
    }

    public static void findDuplicateNumber(int[] ints) {
        int n = ints.length;
        int sum = ((n + 1) * (n + 2)) / 2;
        for (int anInt : ints) sum -= anInt;
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

    public static void arrangeArray(int[] ints) {
        int count = 0;
        int n = ints.length;

        for (int i = 0; i < n; i++) {
            if (ints[i] == 0) {
                count++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (i < count) {
                ints[i] = 0;
            } else {
                ints[i] = 1;
            }
        }
        System.out.println("Arranged Array: " + Arrays.toString(ints));
    }

    public static void findMaxVar(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println("Integer a is Max.");
        } else if (b > a && b > c) {
            System.out.println("Integer b is Max.");
        } else if (c > a && c > b) {
            System.out.println("Integer c is Max.");
        } else if ((a == b) && (b == c) && (a == c)) {
            System.out.println("Integer a, b and c all are same.");
        } else if (a == b) {
            System.out.println("Integer a and b both are same.");
        } else if (b == c) {
            System.out.println("Integer b and c both are same.");
        } else if (a == c) {
            System.out.println("Integer a and c both are same.");
        }
    }

    public static void rightStarTriangle(int n) {
        int i, j;
        for (i = 0; i <= n; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void rightNumberTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void numberTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void numberPattern(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void sequenceNumberPattern(int n) {
        int value = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(value + " ");
                value++;
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void oneZeroPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 0) {
                    System.out.print(0 + " ");
                } else {
                    System.out.print(1 + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void leftStartTriangle(int n) {
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Hello there!");
        int[] ints = {2, 91, 1, 33, 34, 10};
        int[] ints1 = {2, 7, 1, 4, 5, 3};
        int[] ints2 = {2, 7, 3, 4, 5, 3};
        int[] ints3 = {0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1,};
        int sum = 3;
        int a = 10;
        int b = 10;
        int c = 100;
        findPair(ints, sum);
        findSecondMax(ints1);
        findMissingNumber(ints1);
        findDuplicateNumber(ints2);
        binarySearch(ints1, 3);
        arrangeArray(ints3);
        findMaxVar(a, b, c);
        rightStarTriangle(5);
        rightNumberTriangle(5);
        numberTriangle(5);
        numberPattern(5);
        sequenceNumberPattern(5);
        oneZeroPattern(5);
        leftStartTriangle(5);

    }
}