package Sort;

import java.util.Arrays;

/**
 * 冒泡排序
 */
public class BubbleSort {

    public static String bubbleSort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) { // 趟数
            for (int j = 0; j < arr.length - i - 1; j++) { // j表示：第i趟，元素可进行的交换次数
                // 大的数字往后移换
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // 返回 String 类型
        return Arrays.toString(arr);
    }

    // 单元测试
    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 6, 6, 1, 1, 9, 2, 3, 3, 1};
        System.out.println(bubbleSort(arr));
    }
}
