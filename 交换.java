/*
请编写一个算法，不用任何额外变量交换两个整数的值。
给定一个数组num，其中包含两个值，请不用任何额外变量交换这两个值，并将交换后的数组返回。
测试样例：
[1,2]
返回：[2,1]
*/
//提交时间：2017-01-10 语言：Java 运行时间： 33 ms 占用内存：583K 状态：答案正确
import java.util.*;
 
public class Swap {
    public int[] getSwap(int[] num) {
        num[0]=num[0]^num[1];
        num[1]=num[0]^num[1];
        num[0]=num[0]^num[1];
        return num;
    }
}