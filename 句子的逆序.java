/*
����һ���ַ����������һ���㷨��ֻ���ַ����ĵ��ʼ������������
Ҳ����˵���ַ�����һЩ�ɿո�ָ��Ĳ�����ɣ�����Ҫ����Щ��������
����һ��ԭ�ַ���A�����ĳ��ȣ��뷵���������ַ�����
����������
"dog loves pig",13
���أ�"pig loves dog"
*/
//�ύʱ�䣺2016-12-19 ���ԣ�Java ����ʱ�䣺 71 ms ռ���ڴ棺1389K ״̬������ȷ
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