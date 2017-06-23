/*
对于两个字符串A和B，如果A和B中出现的字符种类相同且每种字符出现的次数相同，
则A和B互为变形词，请设计一个高效算法，检查两给定串是否互为变形词。
给定两个字符串A和B及他们的长度，请返回一个bool值，代表他们是否互为变形词。
测试样例：
"abc",3,"bca",3
返回：true
*/
//提交时间：2016-12-19 语言：Java 运行时间： 40 ms 占用内存：729K 状态：答案正确
import java.util.*;
 
public class Transform {
    public boolean chkTransform(String A, int lena, String B, int lenb) {
       if(lena!=lenb||A==null||B==null)
            return false;
        char[] str1=A.toCharArray();
        char[] str2=B.toCharArray();
        int[] strmap1=map(str1);
        int[] strmap2=map(str2);
        return compare(strmap1, strmap2);
    }
     
    public static int[] map(char[] str){
        int[] m=new int[256];
        for(int i=0;i<str.length;i++){
            m[str[i]]++;
             
        }
        return m;
    }
     
    public static boolean compare(int[] a,int[] b){
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }
}