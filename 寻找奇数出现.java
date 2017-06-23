/*
有一个整型数组A，其中只有一个数出现了奇数次，其他的数都出现了偶数次，请打印这个数。要求时间复杂度为O(N)，额外空间复杂度为O(1)。
给定整形数组A及它的大小n，请返回题目所求数字。
测试样例：
[1,2,3,2,1],5
返回：3
*/
//提交时间：2017-01-12 语言：Java 运行时间： 78 ms 占用内存：1422K 状态：答案正确
import java.util.*;
 
public class OddAppearance {
    public int findOdd(int[] A, int n) {
        int eo=0;
        for(int i=0;i<n;i++){
            eo=A[i]^eo;
        }
        return eo;
    }
}