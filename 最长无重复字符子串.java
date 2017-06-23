/*
����һ���ַ���,�����һ����Ч�㷨���ҵ��ַ���������ظ��ַ����Ӵ����ȡ�
����һ���ַ���A�����ĳ���n���뷵����������ظ��ַ��Ӵ����ȡ�
��֤A���ַ�ȫ��ΪСдӢ���ַ����ҳ���С�ڵ���500��
����������
"aabcb",5
���أ�3
*/
//�ύʱ�䣺2016-12-21 ���ԣ�Java ����ʱ�䣺 42 ms ռ���ڴ棺647K ״̬������ȷ
import java.util.*;
 
public class DistinctSubstring {
    public static int longestSubstring(String A, int n) {
        char[] str=A.toCharArray();
        int[] map=new int[256];
        for (int i = 0; i < 256; i++) {
            map[i] = -1;
        }
        int pre=-1;
        int len=0;
        int cur=0;
        for(int i=0;i<n;i++){
            pre=Math.max(pre, map[str[i]]);
            cur=i-pre;
            len=Math.max(cur, len);
            map[str[i]]=i;
        }
        return len;
    }
}