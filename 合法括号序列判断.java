/*
����һ���ַ����������һ���㷨���ж����Ƿ�Ϊһ���Ϸ������Ŵ���
����һ���ַ���A�����ĳ���n��
�뷵��һ��boolֵ�������Ƿ�Ϊһ���Ϸ������Ŵ���
����������
"(()())",6
���أ�true
����������
"()a()()",7
���أ�false
����������
"()(()()",7
���أ�false
*/
//�ύʱ�䣺2016-12-21 ���ԣ�Java ����ʱ�䣺 33 ms ռ���ڴ棺583K ״̬������ȷ
import java.util.*;
 
public class Parenthesis {
    public static boolean chkParenthesis(String A, int n) {
        char[] str=A.toCharArray();
        int count=0;
        for(int i=0;i<n;i++){
            if(str[i]=='('){
                count++;
            }else if(str[i]==')'){
                if(count<0){
                    return false;
                }else{
                    count--;
                }
            }else{
                if(count<0){
                    return false;
                }
            }
        }
        if(count==0){
            return true;
        }
        return false;
    }
}