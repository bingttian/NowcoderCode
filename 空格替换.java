/*
���дһ�����������ַ����еĿո�ȫ���滻Ϊ��%20����
�ٶ����ַ������㹻�Ŀռ����������ַ�������֪���ַ�������ʵ����(С�ڵ���1000)��
ͬʱ��֤�ַ����ɴ�Сд��Ӣ����ĸ��ɡ�
����һ��string iniString Ϊԭʼ�Ĵ����Լ����ĳ��� int len, 
�����滻���string��
����������
"Mr John Smith��,13
���أ�"Mr%20John%20Smith"
��Hello  World��,12
���أ���Hello%20%20World��
*/
//�ύʱ�䣺2016-12-21 ���ԣ�Java ����ʱ�䣺 43 ms ռ���ڴ棺854K ״̬������ȷ
import java.util.*;
 
public class Replacement {
    public static String replaceSpace(String iniString, int length) {
        char[] str=iniString.toCharArray();
        int len=str.length;
        for(int i=0;i<str.length;i++){
            if(str[i]==' '){
                len+=2;
            }
        }
        char[] res=new char[len];
        int j=0;
        for(int i=0;i<str.length;i++){
            if(str[i]!=' '){
                res[j++]=str[i];
            }else{
                res[j++]='%';
                res[j++]='2';
                res[j++]='0';
            }
        }
        iniString=String.valueOf(res);
        return iniString;
    }
}