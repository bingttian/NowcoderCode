/*
n����ͬ���ǹ����ָ�m���ˣ�ÿ������һ�ţ����ж����ַַ���
����n��m���뷵�ط���������֤nС�ڵ���12����mС�ڵ���n��
����������
10,3
���أ�36
*/
//�ύʱ�䣺2017-02-17 ���ԣ�Java ����ʱ�䣺 32 ms ռ���ڴ棺583K ״̬������ȷ
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