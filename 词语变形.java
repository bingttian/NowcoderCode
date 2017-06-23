/*
���������ַ���A��B�����A��B�г��ֵ��ַ�������ͬ��ÿ���ַ����ֵĴ�����ͬ��
��A��B��Ϊ���δʣ������һ����Ч�㷨��������������Ƿ�Ϊ���δʡ�
���������ַ���A��B�����ǵĳ��ȣ��뷵��һ��boolֵ�����������Ƿ�Ϊ���δʡ�
����������
"abc",3,"bca",3
���أ�true
*/
//�ύʱ�䣺2016-12-19 ���ԣ�Java ����ʱ�䣺 40 ms ռ���ڴ棺729K ״̬������ȷ
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