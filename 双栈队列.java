/*
��дһ����,ֻ��������ջ�ṹʵ�ֶ���,֧�ֶ��еĻ�������(push��pop)��
����һ����������ope�����ĳ���n������Ԫ��Ϊ��������push������
Ϊ0����pop��������֤�������кϷ���һ����pop�������뷵��pop�Ľ�����С�
����������
[1,2,3,0,4,0],6
���أ�[1,2]
*/
//�ύʱ�䣺2016-12-22 ���ԣ�Java ����ʱ�䣺 88 ms ռ���ڴ棺1285K ״̬������ȷ
import java.util.*;
 
public class TwoStack {
  static Stack<Integer> stackpush=new Stack<Integer>();
    static Stack<Integer> stackpop=new Stack<Integer>();
     
    public static int[] twoStack(int[] ope, int n) {
        int index=0;
        for(int i=0;i<n;i++){
            if(ope[i]==0){
                index++;
            }else{
                stackpush.push(ope[i]);
            }
        }
        int[] res=new int[index];
        int num=0;
        for(;index>0;index--){
            res[num++]=pop();
        }
        return res;
    }
     
    public static int pop(){
        while(!stackpush.isEmpty()){
            stackpop.push(stackpush.pop());
        }
        return stackpop.pop();
    }
}