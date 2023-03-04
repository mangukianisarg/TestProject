public class count_character {
    public static void main(String[] args) {
        int[] freq = new int[128];
        String str = "akash! !@$%$@A";
        for (char ch : str.toCharArray()) {
            freq[ch]++;
        }

        for (int i = 0; i < 128; i++) {
            if (freq[i] != 0) {
                System.out.println((char)(i) + " -> " + freq[i]);
            }
        }
    }
}
