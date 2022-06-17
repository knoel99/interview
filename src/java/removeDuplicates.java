package src.java;

public class removeDuplicates {

    public static void main(String[] arg) {
        int[] ar = {93, 94, 21, 4, 17, 18, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 21, 4, 87, 88, 89, 90, 91, 92, 93};
        String[] ar2 = {"a", "b", "c", "d", "e", "d", "e", "f", "a"};

        print(naive(ar));
        print(naive(ar2));

    }


    public static int[] naive(int[] ar){
        int[] clean = new int[ar.length];
        // Starts with -1 to ignore when i=j in the nested loop
        int numberDuplicate;
        for (int i=0; i<ar.length; i++){
            numberDuplicate=-1;
            for (int j=0; j<ar.length; j++){
                if (ar[i]==ar[j]) numberDuplicate++;
                // IF a real duplicate found, break;
                if (numberDuplicate==1) break;
            }
            // If no duplicate add to result
            if (numberDuplicate<1){
                clean[i] = ar[i];
            }
        }
        return clean;
    }
    public static String[] naive(String[] ar){
        String[] clean = new String[ar.length];
        // Starts with -1 to ignore when i=j in the nested loop
        int numberDuplicate;
        for (int i=0; i<ar.length; i++){
            numberDuplicate=-1;
            for (int j=0; j<ar.length; j++){
                if (ar[i].equals(ar[j])) numberDuplicate++;
                // IF a real duplicate found, break;
                if (numberDuplicate==1) break;
            }
            // If no duplicate add to result
            if (numberDuplicate<1){
                clean[i] = ar[i];
            }
        }
        return clean;
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

    public static void print(int[] ar){
        StringBuilder out = new StringBuilder("{");
        if(ar == null || ar.length == 0) {
            System.out.println(out + "}");
            return;
        }
        for(int s: ar){
            out.append(s).append(", ");
        }
        System.out.println(out.substring(0,out.length()-2) + "}");

    }
}
