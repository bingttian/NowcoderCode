/*
ţţ������һ���ַ���A�������������һ���ַ���B��B�ĳ��ȴ��ڵ���A��
����ţţ���A����ú�B��һ���������������Ը���ţţһ�����ˡ�
����A�ĳ������ӵ���B��һ������ʱ�򣬶�Ӧ��ÿһλ��ȵ�Խ�࣬
�����Խϲ��������"abc"��"abd"��Ӧ��ȵ�λ��Ϊ2��Ϊǰ��λ��
ţţ������A�Ŀ�ͷ���߽�β��������ַ���ʹ�ó��Ⱥ�Bһ����
������ţţ��A��������ַ�֮�󣬲���ȵ�λ�������ж���λ��
*/
//�ύʱ�䣺2017-06-07 ���ԣ�Java ����ʱ�䣺 22 ms ռ���ڴ棺276K ״̬������ȷ
import java.util.Scanner;
  
public class Main {
  
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String A=input.nextLine();
        String B=input.nextLine();
        System.out.println(same(A,B));
    }
      
    public static int same(String A,String B){
        int result=A.length();
        for(int i=0;i<B.length()-A.length()+1;i++){
            int temp=0;
            for(int j=0;j<A.length();j++){
                if(A.charAt(j)!=B.charAt(j+i)){
                    temp++;
                }
            }
            result=Math.min(result, temp);
        }
        return result;
    }
}