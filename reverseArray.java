/**
 * 1. Write a function that reverses an array in place.
 *
 * In other words, the function should not use an auxiliary array to do the work.
 */
public class reverseArray {

    public static void main(String[] arg) {
        String[] ar1 = {};
        String[] ar2 = {"a"};
        String[] ar3 = {"a", "b"};
        String[] ar4 = {"a", "b", "c"};
        String[] ar5 = {"a", "b", "c", "d", "e"};
        String[] ar6 = {"a", "b", "c", "d", "e", "f"};

        print(reverse(ar1));
        print(reverse(ar2));
        print(reverse(ar3));
        print(reverse(ar4));
        print(reverse(ar5));
        print(reverse(ar6));

    }

    public static String[] reverse(String[] ar){
        if(ar == null || ar.length <= 1) return ar;
        int n = ar.length;
        int j, iMid;
        String tmp;

        iMid = n % 2 == 0 ? n/2 : n/2+1;

        for (int i=0; i<iMid; i++){
            j = n - i - 1;
            tmp = ar[i];
            ar[i] = ar[j];
            ar[j] = tmp;
        }
        return ar;
    }

    public static void print(String[] ar){
        StringBuilder out = new StringBuilder("{");
        if(ar == null || ar.length == 0) {
            System.out.println(out + "}");
            return;
        }
        for(String s: ar){
            out.append(s).append(", ");
        }
        System.out.println(out.substring(0,out.length()-2) + "}");

    }
}
