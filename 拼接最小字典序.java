/*
����һ���������ַ������飬���ҵ�һ��ƴ��˳��
ʹ����С�ַ���ƴ�ӳɵĴ��ַ��������п��ܵ�ƴ�����ֵ�����С�ġ�
����һ���ַ�������strs��ͬʱ�������Ĵ�С���뷵��ƴ�ӳɵĴ���
����������
["abc","de"],2
"abcde"
*/
//�ύʱ�䣺2016-12-20 ���ԣ�Java ����ʱ�䣺 77 ms ռ���ڴ棺1181K ״̬������ȷ
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