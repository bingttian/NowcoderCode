/*
����һ��ip��ַ�����ж��Ƿ�Ϸ���
*/
//�ύʱ�䣺2016-12-09 ���ԣ�Java ����ʱ�䣺 132 ms ռ���ڴ棺1258K ״̬������ȷ
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        while(n>0){
            String ip=input.next();
            if(isIP(ip)){
                System.out.println("Yes!");
            }else{
                System.out.println("No!");
            }
            n--;
        }
    }
     
    public static boolean isIP(String ip){
        String[] s=ip.split("\\.");
        if(s.length==4){
            for(int i=0;i<4;i++){
                //ת������
                int a = Integer.parseInt(s[i]);
                if(a>255||a<0){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}