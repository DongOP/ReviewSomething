package Sort;

/**
 * 递归算法 Recursive Algorithm
 */
public class RecursiveSort {
    // 斐波那契数列 F(n)=F(n-1)+F(n-2)
    public static int fibonacciSort(int n) {
        if (n <= 2) {
            return 1;
        } else {
            return fibonacciSort(n - 1) + fibonacciSort(n - 2);
        }
    }

    // 单元测试
    public static void main(String[] args) {
        int n = 10;
        System.out.println("fibonacciSort(" + n + ")展示=" + fibonacciSort(n));

        System.out.println("increaseSum(" + n + ")展示=" + increaseSum(n));

        int num = 5;
        System.out.println("factorial(" + num + ")展示=" + factorial(num));
    }

    // 求1+2+3+4+5+6+7……+1000的和
    public static int increaseSum(int n) {
        if (n > 0) {
            return n + increaseSum(n - 1);
        } else {
            return 0;
        }
    }

    // 阶乘 n!=1×2×3×...×n
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
