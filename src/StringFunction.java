import java.util.Arrays;

public class StringFunction {
    public static void main(String[] args) {
        String s = "Hello World! How are you?";
        System.out.println(s);
//        System.out.println(s.length());
        char[] strArr = s.toCharArray();
//        System.out.println(strArr.length);
        int[] ascii = new int[128];
        for (int i = 0; i <= strArr.length - 1; i++) {

            System.out.println(ascii[(int) strArr[i]]);
//            System.out.println((int) strArr[i]);
//            if (strArr.length < ascii.length) {
                ascii[(int) strArr[i]] = ascii[(int) strArr[i]] + 1;
//            }
//            System.out.println(ascii[i]);
        }


        for (int i = 0; i <= strArr.length - 1; i++) {
//            System.out.println(ascii[i]);
//            if (strArr.length < ascii.length) {
//                if (ascii[i] == 2) {
//                    System.out.printf("Duplicate found: %d at %y", ascii[i], i);
//                } else if (ascii[i] == 1) {
//                    System.out.printf("One-time found: %d at %y", ascii[i], i);
//                }
//            }
        }
    }
}
