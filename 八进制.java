/*
����һ������������ת���ɰ˽����������
*/
//�ύʱ�䣺2016-12-06 ���ԣ�Java ����ʱ�䣺 115 ms ռ���ڴ棺1980K ״̬������ȷ
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
            ChangetoEight(input.nextInt());
        }
    }
      
    public static void ChangetoEight(int n){
        String s = "";
        while(n>0){
            s = n%8+s;
            n = n/8;
        }
        System.out.println(s);
    }
}