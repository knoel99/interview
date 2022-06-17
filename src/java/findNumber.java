package src.java;

/**
 * 2. Write a function that finds the missing number in an unsorted array containing
 * every one of the other 99 numbers ranging from 1 to 100.
 */
public class findNumber {

    public static void main(String[] arg) {
        // Missing 21
        int[] ar = { 17, 18, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 19,23, 24, 25, 26, 27, 1, 2, 3,  51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73,  20, 22, 8, 9, 10, 11, 12, 13, 14, 15, 74, 75, 76, 77, 78, 79, 80, 4, 5, 6, 7, 16, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 81, 82, 83, 84};

        System.out.print(findMissingNumber(ar));

    }

    /**
     * Sum of integer from 1 to 100 is 5050 (Gauss sum)
     * @param ar
     * @return
     */
    public static int findMissingNumber(int[] ar){
        int sum=0;
        for (int i: ar){
            sum += i;
        }
        return 5050 - sum;
    }

}
