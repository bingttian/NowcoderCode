/*
有一个整形数组A，请设计一个复杂度为O(n)的算法，算出排序后相邻两数的最大差值。
给定一个int数组A和A的大小n，请返回最大的差值。保证数组元素多于1个。
测试样例：
[1,2,5,4,6],5
返回：2
*/
//提交时间：2016-12-18 语言：Java 运行时间： 88 ms 占用内存：1243K 状态：答案正确
import java.util.*;
 
public class Gap {
    public int maxGap(int[] A, int n) {
        if (A == null || n <= 0) {
            return -1;
        }
        int max = A[0];
        int min = A[0];
        int Maxlen = 0;
        // 找出最大最小值
        for (int i = 1; i < n; i++) {
            max = Math.max(max, A[i]);
            min = Math.min(min, A[i]);
        }
        if (min == max) {
            return 0;
        }
        boolean[] hasNum = new boolean[n + 1];
        int[] Max = new int[n + 1];
        int[] Min = new int[n + 1];
        for (int i = 0; i < n; i++) {
            int num = bucket(A[i], n - 1, max, min);
            Max[num] = hasNum[num] ? Math.max(Max[num], A[i]) : A[i];
            Min[num] = hasNum[num] ? Math.min(Min[num], A[i]) : A[i];
            hasNum[num] = true;
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n + 1; j++)
                if (hasNum[i] && hasNum[j]) {
                    Maxlen = Math.max(Min[j] - Max[i], Maxlen);
                    break;
                }
        }
        return Maxlen;
    }
 
    public static int bucket(long num, long len, long max, long min) {
        return (int) ((num - min) * len / (max - min));
    }
}