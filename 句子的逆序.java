/*
对于一个字符串，请设计一个算法，只在字符串的单词间做逆序调整，
也就是说，字符串由一些由空格分隔的部分组成，你需要将这些部分逆序。
给定一个原字符串A和他的长度，请返回逆序后的字符串。
测试样例：
"dog loves pig",13
返回："pig loves dog"
*/
//提交时间：2016-12-19 语言：Java 运行时间： 71 ms 占用内存：1389K 状态：答案正确
import java.util.*;
 
public class Reverse {
   public static String reverseSentence(String A, int n) {
        String str=change(A, n);
        String[] word=str.split(" ");
        for(int i=0;i<word.length;i++){
            word[i]=change(word[i], word[i].length());
        }
        String b=word[0];
        if(word.length==1){
            return b;
        }else{
            b+=" ";
        }
        for(int i=1;i<word.length;i++){
            b+=word[i];
            if(i!=word.length-1){
                b+=" ";
            }
        }
        return b;
    }
     
    public static String change(String s,int n){
        char[] str=s.toCharArray();
        int temp;
        s=null;
        for(int i=0;i<n/2;i++){
            temp=str[i];
            str[i]=str[n-1-i];
            str[n-1-i]=(char) temp;
        }
        s=String.valueOf(str);
        return s;
    }
}