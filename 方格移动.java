/*
��XxY�ķ����У������ϽǸ���Ϊ��㣬���½Ǹ���Ϊ�յ㣬ÿ��ֻ�������߻��������ߣ�����һ���ж����ֲ�ͬ���߷�
��������������int x,int y���뷵���߷���Ŀ����֤x��yС�ڵ���12��
����������
2,2
���أ�2
*/
//�ύʱ�䣺2017-01-12 ���ԣ�Java ����ʱ�䣺 37 ms ռ���ڴ棺603K ״̬������ȷ
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