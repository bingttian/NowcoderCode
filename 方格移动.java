/*
在XxY的方格中，以左上角格子为起点，右下角格子为终点，每次只能向下走或者向右走，请问一共有多少种不同的走法
给定两个正整数int x,int y，请返回走法数目。保证x＋y小于等于12。
测试样例：
2,2
返回：2
*/
//提交时间：2017-01-12 语言：Java 运行时间： 37 ms 占用内存：603K 状态：答案正确
import java.util.*;
 
public class Robot {
    public int countWays(int x, int y) {
      int count = x + y-2;
        int a = 1, b = 1;
        if(x==1||y==1){
            return 1;
        }
        for (int i = 0; i < x-1; i++) {
            a*=count--;
        }
        for (int i = 1; i < x; i++) {
            b*=i;
        }
        System.out.println(a+" "+b);
        return a/b;
    }
}