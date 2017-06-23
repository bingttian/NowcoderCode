/*
对于一个字符串，请设计一个算法，将字符串的长度为len的前缀平移到字符串的最后。
给定一个字符串A和它的长度，同时给定len，请返回平移后的字符串。
测试样例：
"ABCDE",5,3
返回："DEABC"
*/
//提交时间：2016-12-20 语言：Java 运行时间： 43 ms 占用内存：603K 状态：答案正确
import java.util.*;
 
public class Translation {
     public static String stringTranslation(String A, int n, int len) {
        A=change(A, 0, len-1);
        //System.out.println(A.toString());
        A=change(A, len, n-1);
        //System.out.println(A.toString());
        A=change(A, 0, n-1);
        //System.out.println(A.toString());
        return A;
     }
      
     public static String change(String s,int start,int end){
            char[] str=s.toCharArray();
            int temp;
            s=null;
            //System.out.println("=========================");
            //System.out.println("start="+start+",end="+end);
            int mid=(end+start)/2;
            for(int i=start;i<=mid;i++){
                //System.out.println("str[i]="+str[i]+",str[end]="+str[end]);
                temp=str[i];
                str[i]=str[end];
                str[end]=(char) temp;
                end--;
            }
            s=String.valueOf(str);
            return s;
        }
}