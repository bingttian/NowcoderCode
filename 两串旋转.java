/*
�������һ���ַ���A����A��ǰ������һ����Ų�����ȥ�γɵ��ַ�����ΪA����ת�ʡ�
����A="12345",A����ת����"12345","23451","34512","45123"��"51234"��
���������ַ���A��B�����ж�A��B�Ƿ�Ϊ��ת�ʡ�
���������ַ���A��B�����ǵĳ���lena��lenb���뷵��һ��boolֵ�����������Ƿ�Ϊ��ת�ʡ�
����������
"cdab",4,"abcd",4
���أ�true
*/
//�ύʱ�䣺2016-12-11 ���ԣ�Java ����ʱ�䣺 43 ms ռ���ڴ棺856K ״̬������ȷ
import java.util.*;
 
public class Rotation {
    public boolean chkRotation(String A, int lena, String B, int lenb) {
        if(lena==lenb){
            String all=A+A;
            if(all.contains(B))
                return true;
        }
        return false;
    }
}