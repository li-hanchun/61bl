import java.util.ArrayList;
import java.util.List;

public class ArrayExercises {

    /** Returns an array [1, 2, 3, 4, 5, 6] */
    public static int[] makeDice() {
        // 直接创建并初始化数组
        return new int[]{1, 2, 3, 4, 5, 6};
    }

    /** * Returns the positive difference between the maximum element and minimum element of the given array.
     * Assumes array is nonempty.
     */
    public static int findMinMax(int[] array) {
        // 因为题目假设数组不为空，所以可以安全地将 min 和 max 初始化为第一个元素
        int min = array[0];
        int max = array[0];

        // 遍历数组找到真正的最小值和最大值
        for (int num : array) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        // 返回最大值与最小值的差
        return max - min;
    }
}