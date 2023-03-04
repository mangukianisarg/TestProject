// Java implementation of the approach
class GFG
{
    final static int MAX = 26;

    // Function to return the minimum
    // operations required
    static int minOperation(String str, int len)
    {

        // To store the first and the last
        // occurrence of all the characters
        int first[] = new int[MAX];
        int last[] = new int[MAX];

        // Set the first and the last occurrence
        // of all the characters to -1
        for (int i = 0; i < MAX; i++)
        {
            first[i] = -1;
            last[i] = -1;
        }

        // Update the occurrences of the characters
        for (int i = 0; i < len; i++)
        {
            int index = (str.charAt(i) - 'a');

            // Only set the first occurrence if
            // it hasn't already been set
            if (first[index] == -1)
                first[index] = i;

            last[index] = i;
        }

        // To store the minimum operations
        int minOp = -1;

        for (int i = 0; i < MAX; i++)
        {

            // If the frequency of the current
            // character in the string
            // is less than 2
            if (first[i] == -1 ||
                    first[i] == last[i])
                continue;

            // Count of characters to be
            // removed so that the string
            // starts and ends at the
            // current character
            int cnt = len - (last[i] - first[i] + 1);

            if (minOp == -1 || cnt < minOp)
                minOp = cnt;
        }
        return minOp;
    }

    // Driver code
    public static void main (String[] args)
    {
        String str = "Nisarg Mangukiya";
        int len = str.length();

        System.out.println(minOperation(str, len));
    }
}
