/*
现在有一个行和列都排好序的矩阵，请设计一个高效算法，
快速查找矩阵中是否含有值x。
给定一个int矩阵mat，同时给定矩阵大小nxm及待查找的数x，
请返回一个bool值，代表矩阵中是否存在x。
所有矩阵中数字及x均为int范围内整数。保证n和m均小于等于1000。
测试样例：
[[1,2,3],[4,5,6],[7,8,9]],3,3,10
返回：false
*/
//提交时间：2016-12-16 语言：Java 运行时间： 106 ms 占用内存：945K 状态：答案正确
import java.util.*;
 
public class Finder {
    public boolean findX(int[][] mat, int n, int m, int x) {
      int i=0,j=m-1;
        while(i<=n-1&&j>=0){
            if(mat[i][j]==x){
                return true;
            }
            if(mat[i][j]<x){
                i++;
            }else{
                j--;
            }
        }
        return false;
    }
}