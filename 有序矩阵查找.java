/*
������һ���к��ж��ź���ľ��������һ����Ч�㷨��
���ٲ��Ҿ������Ƿ���ֵx��
����һ��int����mat��ͬʱ���������Сnxm�������ҵ���x��
�뷵��һ��boolֵ������������Ƿ����x��
���о��������ּ�x��Ϊint��Χ����������֤n��m��С�ڵ���1000��
����������
[[1,2,3],[4,5,6],[7,8,9]],3,3,10
���أ�false
*/
//�ύʱ�䣺2016-12-16 ���ԣ�Java ����ʱ�䣺 106 ms ռ���ڴ棺945K ״̬������ȷ
import java.util.*;
 
public class Finder {
    public boolean findX(int[][] mat, int n, int m, int x) {
      int i=0,j=m-1;
        while(i<=n-1&&j>=0){
            if(mat[i][j]==x){
                return true;
            }
            if(mat[i][j]<x){
                i++;
            }else{
                j--;
            }
        }
        return false;
    }
}