/*
n颗相同的糖果，分给m个人，每人至少一颗，问有多少种分法。
给定n和m，请返回方案数，保证n小于等于12，且m小于等于n。
测试样例：
10,3
返回：36
*/
//提交时间：2017-02-17 语言：Java 运行时间： 32 ms 占用内存：583K 状态：答案正确
import java.util.*;
 
public class Distribution {
    public int getWays(int n, int m) {
        int a=1;
            for(int i=0;i<m-1;i++){
                a*=(n-1);
                n--;
            }
            int b=cal(m-1);
            System.out.println(a+" "+b);
            return a/b;
        }
         
        public static int cal(int n){
            int res=1;
            for(int i=1;i<n+1;i++){
                res*=i;
            }
            return res;
        }
    }