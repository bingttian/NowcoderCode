/*
����һ��������������������Ʊ�ʾ��1�ĸ��������и����ò����ʾ��
*/
//�ύʱ�䣺2017-01-16 ���ԣ�Java ����ʱ�䣺 34 ms ռ���ڴ棺528K ״̬������ȷ
public class Solution {
    public int NumberOf1(int n) {
         int t=0;
         char[] a=Integer.toBinaryString(n).toCharArray();
         for(int i=0;i<a.length;i++){
             if(a[i]=='1'){
                 t++;
             }
         }
         return t;
        }
}

