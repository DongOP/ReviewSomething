package Sort;

import java.util.HashMap;
import java.util.Map;

public class CountTimesSort {

    /**
     * 统计 数组内元素出现的次数
     *
     * @param args 目标数组
     */
    public static void countTimesSort(int[] args) {
        if (args.length == 0) {
            return;
        }
//        Arrays.sort(args); // 给数组从小到大排序
        Map<Object, Integer> uniqueMap = new HashMap<>();
        for (Object arg : args) {
            Integer times = uniqueMap.get(arg);
            uniqueMap.put(arg, times == null ? 1 : times + 1);
        }
        // 统计完成
        System.out.println(uniqueMap);
        // 打印元素出现次数的统计结果
        for (Map.Entry<Object, Integer> entry : uniqueMap.entrySet()) {
            System.out.println("参数=" + entry.getKey() + ", 出现次数=" + entry.getValue());
        }
    }

    // 单元测试
    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 6, 6, 1, 1, 9, 2, 3, 3, 1};
        countTimesSort(arr);
    }
}
