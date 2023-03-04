import java.util.*;
import java.util.stream.IntStream;

import static com.sun.org.apache.xerces.internal.util.XMLChar.trim;

public class LeetCode {
    public static void main(String[] args) {
        int[] ints1 = {4, 5, 6, 7, 0, 2, 1, 3};
        String[] word1 = {"a", "cb"};
        String[] word2 = {"abc", "car", "ada", "racecar", "cool"};
        String word = "is2 sentence4 This1 a3";
        int[] nums = {3, 3};
        int target = 6;
        int[] nums1 = {1, 1, 2};
        String s = "Hello how are you Contestant";
//        System.out.println(numIdenticalPairs(ints1));
//        System.out.println(kidsWithCandies(ints1, 1));
////        System.out.println(smallerNumbersThanCurrent(ints1));
//        System.out.println(Arrays.toString(smallerNumbersThanCurrent(ints1)));
//        System.out.println(sumOfUnique(ints1));
//        System.out.println(arrayStringsAreEqual(word1, word2));
//        System.out.println(truncateSentence(s, 4));
//        System.out.println(firstPalindrome(word2));
//        System.out.println(isPalindrome(word));
//        System.out.println(Arrays.toString(twoSum(nums, target)));
//        System.out.println(removeDuplicates1(nums1));
//        System.out.println(maxProfit(ints1));
//        System.out.println(restoreString(word, ints1));
        System.out.println(sortSentence(word));
    }

    public static int countKDifference(int[] nums, int k) {
        int i;
        int n = nums.length;
        int count = 0;
        for (i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++)
                if (nums[i] - nums[j] == k || nums[j] - nums[i] == k) count++;
        }
        return count;
    }

    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 1 + i; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        return sumWithExtraCandies(candies, extraCandies);
    }

    private static List<Boolean> sumWithExtraCandies(int[] candies, int extraCandies) {
        List<Boolean> temp = new ArrayList<>();
        int max = candies[0];
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            int sum = 0;
            sum = extraCandies + candies[i];
            if (sum >= max) {
                temp.add(true);
            } else {
                temp.add(false);
            }


        }
        return temp;
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
//        int[] ints1 = {6,5,4,8};
        int[] temp = new int[nums.length];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    count++;
                }
            }
            temp[i] = count;
        }
        return temp;
    }

    public int differenceOfSum(int[] nums) {
        int sum = 0;
        int digitSum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            while (nums[i] > 0) {
                int digit = nums[i] % 10;
                digitSum = digitSum + digit;
                nums[i] = nums[i] / 10;
            }
        }
        return Math.abs(sum - digitSum);
    }

    public static int sumOfUnique(int[] nums) {
        Arrays.sort(nums);
        int c = 0, sum = 0;
        for (int i = 0; i < nums.length; i = i + c) {
            c = 0;
            for (int j = i; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    c++;
                } else {
                    break;
                }
            }
            if (c == 1) {
                sum = sum + nums[i];
            }
        }
        return sum;
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String sum1 = "";
        String sum2 = "";
        for (int i = 0; i < word1.length; i++) {
            sum1 = sum1 + word1[i];

        }
        System.out.println("SUM 1" + sum1);
        for (int j = 0; j < word2.length; j++) {
            sum2 = sum2 + word2[j];

        }
        System.out.println("SUM 2" + sum2);

        if (sum1.equals(sum2)) {
            return true;
        } else {
            return false;
        }
    }

    public static String truncateSentence(String s, int k) {
        String[] temp = s.split(" ");
        String ans = "";
        for (int i = 0; i < k; i++) {
            if (i == 0 || i == k) {
                ans = ans + temp[i];
            } else {
                ans = ans + " " + temp[i];
            }
            String[] temp1 = ans.split(" ");
            System.out.println(Arrays.toString(temp1));
        }
        return ans;
    }

    public static String firstPalindrome(String[] words) {
        String ans = "";
        for (int i = 0; i < words.length; i++) {
            if (isPalindrome(words[i])) {
                ans = words[i];
                break;
            }
        }
        return ans;
    }

    public static Boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public int prefixCount(String[] words, String pref) {
//        int count = 0;
//        for (int i = 0; i < words.length; i++){
//            if (isContain(words[i], pref)){
//                count++;
//            }
//        }
        return (int) Arrays.stream(words).filter(w -> w.startsWith(pref)).count();
    }

    private Boolean isContain(String str, String pref) {
        Boolean temp = str.contains(pref);
        if (temp) {
            return temp;
        } else {
            return false;
        }
    }

    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (int i = 0; i < sentences.length; i++) {
            int temp = countWords(sentences[i]);
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }

    private int countWords(String str) {
        int word = str.split(" ").length;
        return word;
    }

    public static int[] twoSum(int[] nums, int target) {
//        nums = [2,7,11,15], target = 9
        int[] pair = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    pair[0] = i;
                    pair[1] = j;
                }
            }
        }
        return pair;
    }

    public static int[] removeDuplicates1(int[] nums) {
//        int k = 0;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 1; j < nums.length; j++) {
//                if (i != j && nums[i] == nums[j]) {
//                    k++;
//                }
//            }
//        }
//        return k;

//        int[] nums = [...]; // Input array
        int[] expectedNums = new int[nums.length]; // The expected answer with correct length

        int k = removeDuplicates(nums); // Calls your implementation

        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }

        return expectedNums;
    }

    private static int removeDuplicates(int[] ints) {
        int k = 0;
        for (int i = 0; i < ints.length; i++) {
            for (int j = 1; j < ints.length; j++) {
                if (i != j && ints[i] == ints[j]) {
                    k++;
                }
                while (i < ints.length) {
                    ints[i] = ints[i + 1];

                }
            }
        }
        return k;
    }

    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return end + 1;
    }

    public static int[] plusOne(int[] digits) {
        IntStream a = Arrays.stream(digits);
        long b = a.count();
        int i = (int) b;
        int c = i + 1;
        String temp = Integer.toString(c);
        int[] numbers = new int[temp.length()];
        return numbers;
    }

    public static int maxProfit(int[] prices) {
        int min = 10000;
        int maxDiff = 0;
        int size = prices.length;
        for (int i = 0; i < size; i++) {
            min = Math.min(prices[i], min);
            maxDiff = Math.max(prices[i] - min, maxDiff);
        }
        return maxDiff;
    }

    public int lengthOfLastWord(String s) {
        int count = 0;
        s = s.trim();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                break;
            }
            count++;
        }
        return count;
    }


//    public static String restoreString(String s, int[] indices) {
////        Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
////        Output: "leetcode"
////        Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.
////        System.out.println(s.toCharArray());
//        char[] s1 = new char[s.length()];
//        for (int i = 0; i < indices.length; i++){
//                s1[indices[i]] = s.charAt(i);
//        }
//        String string = new String(s1);
//        return string;
//    }


    //    public static String sortSentence(String s) {
    public static String sortSentence(String s) {
        String[] result = new String[s.split(" ").length];
        for (String word : s.split(" ")) {
            result[word.charAt(word.length() - 1) - '1'] = trim(word);
        }
        return String.join(" ", result);
    }


//    }


}

class Solution1 {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        PriorityQueue<Project> unavailableProjects = new PriorityQueue<Project>((o1, o2) -> o1.capital - o2.capital);
        PriorityQueue<Project> availableProjects = new PriorityQueue<Project>((o1, o2) -> o2.profit - o1.profit);

        for (int i = 0; i < profits.length; i++) {
            Project project = new Project(profits[i], capital[i]);
            if (project.capital <= w) {
                availableProjects.offer(project);
            } else {
                unavailableProjects.offer(project);
            }
        }
        while (k-- > 0) {
            while (!unavailableProjects.isEmpty() && unavailableProjects.peek().capital <= w) {
                 availableProjects.offer(unavailableProjects.poll());
            }
            if (availableProjects.isEmpty()) {
                break;
            } else {
                w += availableProjects.poll().profit;
            }
        }
        return w;
    }

    class Project {
        int profit, capital;

        Project(int profit, int capital) {
            this.profit = profit;
            this.capital = capital;
        }
    }
}


class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int ans = 0;

        for (int[] row : grid)
            Arrays.sort(row);

        for (int j = 0; j < grid[0].length; ++j) {
            int maxOfColumn = 0;
            for (int i = 0; i < grid.length; ++i)
                maxOfColumn = Math.max(maxOfColumn, grid[i][j]);
            ans += maxOfColumn;
        }

        return ans;
    }
}



