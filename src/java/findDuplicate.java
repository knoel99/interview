package src.java;

/**
 * 3. Write a function that finds the duplicate number in an unsorted array containing every number from 1 to 100.
 *
 * Only one of the numbers will appear twice.
 */
public class findDuplicate {
    public static void main(String[] arg) {
        // Duplicate is 21
        int[] ar = { 17, 18, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94,21, 95, 96, 97, 98, 99, 100, 19,23, 24, 25, 26, 27, 1, 2, 3,  51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73,  20, 22, 8, 9, 10, 11, 12, 13, 14, 15, 74, 75, 76, 77, 78, 79, 80, 4, 5, 6, 7, 16, 28, 29, 30, 31, 32, 33,21, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 81, 82, 83, 84};

        System.out.print(findDuplicate(ar));

    }

    /**
     * Sum of integer from 1 to 100 is 5050 (Gauss sum)
     * sum = 5050 + x
     * x = sum - 5050
     * @param ar
     * @return
     */
    public static int findDuplicate(int[] ar){
        int sum=0;
        for (int i: ar){
            sum += i;
        }
        return sum - 5050;
    }

}
