/*
����һ���ַ����������һ���㷨�����ַ����ĳ���Ϊlen��ǰ׺ƽ�Ƶ��ַ��������
����һ���ַ���A�����ĳ��ȣ�ͬʱ����len���뷵��ƽ�ƺ���ַ�����
����������
"ABCDE",5,3
���أ�"DEABC"
*/
//�ύʱ�䣺2016-12-20 ���ԣ�Java ����ʱ�䣺 43 ms ռ���ڴ棺603K ״̬������ȷ
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