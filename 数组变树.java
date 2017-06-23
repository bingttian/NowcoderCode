/*
对于一个没有重复元素的整数数组，请用其中元素构造一棵MaxTree，
MaxTree定义为一棵二叉树，其中的节点与数组元素一一对应，
同时对于MaxTree的每棵子树，它的根的元素值为子树的最大值。
现有一建树方法，对于数组中的每个元素，其在树中的父亲为数组中它左边比它大的第一个数和右边比它大的第一个数中更小的一个。
若两边都不存在比它大的数，那么它就是树根。请设计O(n)的算法实现这个方法。
给定一个无重复元素的数组A和它的大小n，请返回一个数组，其中每个元素为原数组中对应位置元素在树中的父亲节点的编号，若为根则值为-1。
测试样例：
[3,1,4,2],4
返回：[2,0,-1,2]
*/
//提交时间：2016-12-23 语言：Java 运行时间： 139 ms 占用内存：1972K 状态：答案正确
import java.util.*;
 
public class MaxTree {
    public static int[] buildMaxTree(int[] A, int n) {
        Stack<Integer> stack = new Stack<Integer>();
        int[] res = new int[n];
 
        // 初始状态下，所有元素的父结点都为 null，对应下标为-1
        Arrays.fill(res, -1);
 
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && A[stack.peek()] < A[i]) {
                //左边的第一个比A[i]大的数字比右边第一个比A[i]的数字大，就选右边较小的。否则就保持左边那个作为A[i]的父节点
                if (res[stack.peek()] == -1 || A[res[stack.peek()]] > A[i]) {
                    res[stack.peek()] = i;// 更新成右侧最大值
                }
                stack.pop();
            }
            if (!stack.isEmpty()) {
                res[i] = stack.peek();
            }
            stack.push(i);
 
        }
        return res;
    }
}