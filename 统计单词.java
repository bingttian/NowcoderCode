/*
��һ�����򣬶����û�����ģ��ԡ�.����β��һ�����֣�
ͳ��һ���ж��ٸ����ʣ����ֱ����ÿ�����ʺ��ж��ٸ��ַ��� 
��������һ�������ո�����Ĳ��־�Ϊһ�����ʣ�
*/
//�ύʱ�䣺2016-12-07 ���ԣ�Java ����ʱ�䣺 45 ms ռ���ڴ棺782K ״̬������ȷ
import java.util.Scanner;
 
public class Main{
 
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while (input.hasNext()) {
            String s=input.nextLine();
            word(s);
        }
    }
 
    private static void word(String s) {
        char w = 0;
        int i=0,sum=0;
        while(w!='.'){
            w=s.charAt(i);
            i++;
            if(w==' '){
                if(s.charAt(i-2)!=' '){
                System.out.print(sum+" ");
                sum=0;
                }
            }
            if(w!=' ')
            sum++;
        }
        System.out.println(sum-1);
    }
}