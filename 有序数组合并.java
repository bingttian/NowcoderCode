/*
有两个从小到大排序以后的数组A和B，其中A的末端有足够的缓冲空容纳B。
请编写一个方法，将B合并入A并排序。
给定两个有序int数组A和B，A中的缓冲空用0填充，
同时给定A和B的真实大小int n和int m，请返回合并后的数组。
*/
//提交时间：2016-12-16 语言：Java 运行时间： 157 ms 占用内存：2414K 状态：答案正确
import java.util.*;
 
public class Merge {
    public int[] mergeAB(int[] A, int[] B, int n, int m) {
       int a=n-1;
        int b=m-1;
        int i=n+m-1;
        while(a>=0&&b>=0){
            if(A[a]>B[b]){
                A[i--]=A[a--];
            }else{
                A[i--]=B[b--];
            }
        }
        //System.out.println("a="+a+",b="+b);
        while(a>=0){
            A[i--]=A[a--];
        }
        while(b>=0){
            A[i--]=B[b--];
        }
        return A;
    }
}