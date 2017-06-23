/*
对于一个给定的字符串数组，请找到一种拼接顺序，
使所有小字符串拼接成的大字符串是所有可能的拼接中字典序最小的。
给定一个字符串数组strs，同时给定它的大小，请返回拼接成的串。
测试样例：
["abc","de"],2
"abcde"
*/
//提交时间：2016-12-20 语言：Java 运行时间： 77 ms 占用内存：1181K 状态：答案正确
import java.util.*;
 
public class Prior {
    public static String findSmallest(String[] strs, int n) {
         if(strs==null || n==0){
             return "";
         }
         Arrays.sort(strs,new MyComparator());
         String res = "";
         for(int i=0;i<n;i++)
             res += strs[i];
         return res;
    }
}
 
class MyComparator implements Comparator<String> {
    public int compare(String a,String b){
        return (a+b).compareTo(b+a);
    }
}