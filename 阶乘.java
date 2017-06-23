/*
����n�� ��y1=1!+3!+...m!(m��С�ڵ���n����������� 
y2=2!+4!+...p!(p��С�ڵ���n�����ż��)��
*/
//�ύʱ�䣺2016-12-06 ���ԣ�Java ����ʱ�䣺 25 ms ռ���ڴ棺277K ״̬������ȷ
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            int n=input.nextInt();
            System.out.println(num1(n)+" "+num2(n));
        }
    }
     
    private static int sum(int n) {
        int a=1;
        for(int i=1;i<=n;i++){
            a=i*a;
        }
        return a;
    }
     
    private static int num1(int n) {
        int y1=0;
        for(int i=1;i<=n;i=i+2){
            y1 +=sum(i);
        }
        return y1;
    }
     
    private static int num2(int n) {
        int y2=0;
        for(int i=2;i<=n;i=i+2){
            y2 +=sum(i);
        }
        return y2;
    }
}