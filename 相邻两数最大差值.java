/*
��һ����������A�������һ�����Ӷ�ΪO(n)���㷨������������������������ֵ��
����һ��int����A��A�Ĵ�Сn���뷵�����Ĳ�ֵ����֤����Ԫ�ض���1����
����������
[1,2,5,4,6],5
���أ�2
*/
//�ύʱ�䣺2016-12-18 ���ԣ�Java ����ʱ�䣺 88 ms ռ���ڴ棺1243K ״̬������ȷ
import java.util.*;
 
public class Gap {
    public int maxGap(int[] A, int n) {
        if (A == null || n <= 0) {
            return -1;
        }
        int max = A[0];
        int min = A[0];
        int Maxlen = 0;
        // �ҳ������Сֵ
        for (int i = 1; i < n; i++) {
            max = Math.max(max, A[i]);
            min = Math.min(min, A[i]);
        }
        if (min == max) {
            return 0;
        }
        boolean[] hasNum = new boolean[n + 1];
        int[] Max = new int[n + 1];
        int[] Min = new int[n + 1];
        for (int i = 0; i < n; i++) {
            int num = bucket(A[i], n - 1, max, min);
            Max[num] = hasNum[num] ? Math.max(Max[num], A[i]) : A[i];
            Min[num] = hasNum[num] ? Math.min(Min[num], A[i]) : A[i];
            hasNum[num] = true;
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n + 1; j++)
                if (hasNum[i] && hasNum[j]) {
                    Maxlen = Math.max(Min[j] - Max[i], Maxlen);
                    break;
                }
        }
        return Maxlen;
    }
 
    public static int bucket(long num, long len, long max, long min) {
        return (int) ((num - min) * len / (max - min));
    }
}