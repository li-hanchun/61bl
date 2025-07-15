/** Array Operations Class. Optional Exercise **/
public class ArrayOperations {
    /**
     * Delete the value at the given position in the argument array, shifting
     * all the subsequent elements down, and storing a 0 as the last element of
     * the array.
     */
    public static void delete(int[] values, int pos) {
        if (pos < 0 || pos >= values.length) {
            return;
        }
        for (int i = pos; i < values.length; i++) {
            values[i] = values[i+1];
        }
        values[values.length-1] = 0;
    }

    /**
     * Insert newInt at the given position in the argument array, shifting all
     * the subsequent elements up to make room for it. The last element in the
     * argument array is lost.
     */
    public static void insert(int[] values, int pos, int newInt) {
        if (pos < 0 || pos >= values.length) {
            return;
        }
        int[] result = new int[values.length+1];
        for (int i = 0; i < pos; i++) {
            result[i] = values[i];
        }
        for (int i = pos; i < values.length; i++) {
            result[i+1] = values[i];
        }
        result[pos] = newInt;
    }

    /** 
     * Returns a new array consisting of the elements of A followed by the
     *  the elements of B. 
     */
    public static int[] catenate(int[] A, int[] B) {
        if (A == null || B == null) {
            return null;
        }
        int[] result = new int[A.length + B.length];
        for (int i = 0; i < A.length; i++) {
            result[i] = A[i];
        }
        for (int i = 0; i < B.length; i++) {
            result[i + A.length] = B[i];
        }
        return result;
    }

}