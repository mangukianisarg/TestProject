//13-01-2023
//Implement insert, update, search, delete, display in sorted array

import java.util.Arrays;
import java.util.Scanner;

public class ArraysFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 20;
        int[] arr = new int[n];
        int l = -1;

        int choice = 0;
        while (choice != 6) {
            System.out.println("\n1.Insert\n2.Update\n3.Search\n4.Delete\n5.Display\n6.Merge\n7.Exit");
            System.out.print("\tEnter Your Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    if (l == n - 1) {
                        System.out.println("Array is Full");
                        break;
                    }
                    l = insert(arr, l);
                    break;
                case 2:
                    if (l == -1) {
                        System.out.println("Array is Empty!");
                        break;
                    }
                    update(arr, l);
                    break;
                case 3:
                    if (l == -1) {
                        System.out.println("Array is Empty!");
                        break;
                    }
                    search(arr, l);
                    break;
                case 4:
                    if (l == -1) {
                        System.out.println("Array is Empty!");
                        break;
                    }
                    l = delete(arr, l);
                    break;
                case 5:
                    if (l == -1) {
                        System.out.println("Array is Empty!");
                        break;
                    }
                    display(arr, l);
                    break;
                case 6:
                    mergeSortedArray();
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Enter Valid Number.");
            }
        }
    }

    private static int insert(int[] arr, int l) {
        Scanner sc = new Scanner(System.in);
        l++;
        System.out.print("Enter Multi-pal Value Separated by ',' : ");
        String s = sc.next();
        System.out.print(s);
        String[] c = s.split(",");
        for (int k = 0; k < c.length; k++) {
            arr[k] = Integer.parseInt(c[k]);
        }
        sort(arr, l);
        return l;
    }

    private static void sort(int[] arr, int l) {
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j <= l; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                } /*else if (arr[i] == arr[j]){
                    System.out.println("THERE ARE MULTIPLE VALUE FOUND");
                    return;
                }*/
            }
        }
    }


    private static void update(int[] arr, int l) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value which you want to Update: ");
        int value = sc.nextInt();
        for (int i = 0; i <= l; i++) {
            if (arr[i] == value) {
                System.out.print("Enter New Value: ");
                arr[i] = sc.nextInt();
                sort(arr, l);
                return;
            }
        }
        System.out.println("Entered Value not in Array.");
    }

    private static void search(int[] arr, int l) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value which you want to Search: ");
        int value = sc.nextInt();
        int i = 0, j = l;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr[mid] > value) {
                j = mid - 1;
            } else if (arr[mid] < value) {
                i = mid + 1;
            } else {
                System.out.println(value + " is Found at index:" + mid);
                return;
            }
        }
        System.out.println(value + " is Not Found");
    }

    private static int delete(int[] arr, int l) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value which you want to delete: ");
        int value = sc.nextInt();
        int i = 0, j = l;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr[mid] > value) {
                j = mid - 1;
            } else if (arr[mid] < value) {
                i = mid + 1;
            } else {
                l--;
                for (int k = i; k < l; k++) {
                    arr[k] = arr[k + 1];
                }
                return l;
            }
        }
        System.out.println("Entered Element not Found in Array.");
        return l;
    }

    private static void display(int[] arr, int l) {
        System.out.print("All Elements are: ");
        for (int i = 0; i <= l; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void mergeSortedArray() {

        int arr1[] = {2,37,63,25,48,23,64,12,3,78,12,94,64,98,67};
        int n1 = arr1.length;

        int arr2[] = {32,16,54,86,74,58,76,34,93,58,76,3};
        int n2 = arr2.length;

        int arr3[] = new int[n1 + n2];
        int i = 0;
        int j = 0;
        int k = 0;

        // traverse the arr1 and insert its element in arr3
        while (i < n1) {
            arr3[k++] = arr1[i++];
        }

        // now traverse arr2 and insert in arr3
        while (j < n2) {
            arr3[k++] = arr2[j++];
        }

        ArraysFunction.sort(arr3, arr3.length-1);

        for (int m=0; m<arr3.length; m++){
            System.out.print(arr3[m] + " ");
        }
    }
}
