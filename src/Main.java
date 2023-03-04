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
        Arrays.sort(ints);
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

        int mid = (i + j) / 2;
        while (i <= j) {
            if (ints[mid] < To_Find) {
                i = mid + 1;
            } else if (ints[mid] == To_Find) {
                System.out.println("Element is found at index: " + mid);
                break;
            } else {
                j = mid - 1;
            }
            mid = (i + j) / 2;
        }
        if (i > j) {
            System.out.println("Element is not found!");
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

    public static void bubbleSort(int[] ints) {
        int n = ints.length;
        int k = 1;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (ints[j] > ints[j + 1]) {
                    int temp = ints[j];
                    ints[j] = ints[j + 1];
                    ints[j + 1] = temp;
                }
            }
            System.out.println("Bubble Sort Step " + k++ + " : " + Arrays.toString(ints));
        }
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        int k = 1;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
            System.out.println("Selection Sort Step " + k++ + " : " + Arrays.toString(arr));
        }
    }

    public static void reverseNumber(int number) {
        if (number < 10) {
            System.out.println(number);
            return;
        } else {
            System.out.print(number % 10);
            reverseNumber(number / 10);
        }
    }

    public static void mergeArray(int[] ints, int[] ints2) {
        int n1 = ints.length;
        int n2 = ints2.length;
        int ints3[] = new int[n1 + n2];
        int j = 0;
        int k = 0;
        int i = 0;

        while (i < n1 && j < n2) {
            if (ints2[j] < ints2[i]) {
                ints3[k] = ints2[j];
                k++;
                j++;
            } else if (ints2[j] > ints[i]) {
                ints3[k] = ints[i];
                k++;
                i++;
            }
        }
        while (i < n1) {
            ints3[k] = ints[i];
            i++;
            k++;
        }
        while (j < n2) {
            ints3[k] = ints2[j];
            k++;
            j++;
        }
        for (int p = 0; p < ints3.length; p++) {
            System.out.print(ints3[p] + " ");
        }
//        Arrays.sort(ints);
//        Arrays.sort(ints2);
//        int n1 = ints.length;
//        int n2 = ints2.length;
//        int[] temp = new int[n1+n2];
//        int i = 0;
//        int j = 0;
//        int k = 0;
//
//        while (i < n1 && j < n2) {
//            if (ints2[j] > ints[i]) {
//                temp[k] = ints2[j];
//                k++;
//                j++;
//            } else if (ints[i] > ints2[j]) {
//                temp[k] = ints[i];
//                k++;
//                i++;
//            }
//        }
//
//
//        System.out.println(Arrays.toString(temp));
    }

    public static void reverseString(String s) {
        int n = s.length();
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
    }

    public static void palindromeString(String s) {
        s = s.trim();
        System.out.println(s);
        int left = 0;
        int right = s.length() - 1;

        if (s.isEmpty()) {
            System.out.println("String is Empty");
            return;
        }
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                System.out.println("String is not Palindrome");
                return;
            } else {
                left++;
                right--;
            }
        }
        System.out.println("String is Palindrome");
    }

    public static void countWord(String s){
        int count = 1;
        if (s.isEmpty()){
            System.out.println("String is Empty");
            return;
        }
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == ' '){
                count++;
            }
        }
        System.out.printf("Total Word Counted : %d" , count);
    }

    public static void removeVowels(String s){
        String s1;

    }
    
    public static void checkChar(String str){
        System.out.println(str);
        System.out.println(str.length());
        char[] strArr = str.toCharArray();
        System.out.println(strArr.length);
        int[] ascii = new int[128];
        for (int i = 1; i > strArr.length; i++){
//            char character = strArr[i];// This gives the character 'a'
//            int a = (int) character;
            System.out.print(strArr[i]);
//            System.out.println(a);
//            if(ascii[i] == a){
//                ascii[i]++;
//            }

//            char c = (int)str.charAt(i);
//            if(str.charAt(i) == )
        }
    }

    public static void main(String[] args) {
        String s = "Hello There!";
        int[] ints = {2, 91, 1, 33, 34, 10, 12};
        int[] ints1 = {1, 3, 5, 7, 9};
        int[] ints2 = {2, 4, 6, 8, 10, 12};
        int[] ints3 = {0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1,};
        int sum = 3;
        int a = 10;
        int b = 10;
        int c = 100;
        findPair(ints, sum);
        findSecondMax(ints1);
        findMissingNumber(ints1);
        findDuplicateNumber(ints2);
        binarySearch(ints, 657);
        arrangeArray(ints3);
        findMaxVar(a, b, c);
        rightStarTriangle(5);
        rightNumberTriangle(5);
        numberTriangle(5);
        numberPattern(5);
        sequenceNumberPattern(5);
        oneZeroPattern(5);
        leftStartTriangle(5);
        bubbleSort(ints);
        selectionSort(ints1);
        reverseNumber(324354986);
        mergeArray(ints1, ints2);
        reverseString(s);
        palindromeString(s);
        countWord(s);
        removeVowels(s);
        checkChar(s);
    }


}