/*
���ֽ�����ŷ�����?�ϣ�Ȼ���ֽ�����±�����?���ۣ�ѹ���ۺۺ���չ����
��ʱ��1���ۺۣ�ͻ���?��ָ��ֽ���ı�?�������ۺ۽������¡��ۺ� ��
ͻ���?��ָ��ֽ����?���ۺ۽������ϡ��ۺۡ�
���ÿ�ζ����±�����? ���ۣ�����N�Ρ�����ϵ��¼���������ۺ۵�?��
�����۵Ĵ���n,�뷵�ش��ϵ��µ��ۺ۵����飬
��Ϊ���ۺ����ӦԪ��Ϊ"down",��Ϊ���ۺ���Ϊ"up".
����������
1
���أ�["down"]
*/
//�ύʱ�䣺2017-01-07 ���ԣ�Java ����ʱ�䣺 154 ms ռ���ڴ棺1845K ״̬������ȷ
import java.util.*;
 
public class FoldPaper {
    public String[] foldPaper(int n) {
        LinkedList<String> list = new LinkedList<String>();
        fold(1, n, true, list);
        String[] res = new String[list.size()];
        int len = list.size();
        for (int i = 0; i < len; i++) {
            res[i] = list.poll();
        }
        return res;
    }
 
    public static void fold(int i, int n, boolean flag, LinkedList<String> list) {
        if (i > n) {
            return;
        }
        fold(i + 1, n, true, list);
        list.add(flag ? "down" : "up");
        fold(i + 1, n, false, list);
    }
}