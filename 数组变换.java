/*
ţţ��һ�����飬����������ܲ���ȣ���������������Ϊ�����е�������ȡ����Ƿ���С�
ţţ���Խ��еĲ����ǣ��������е�����һ������Ϊ�������������
���������ʹ�ô������ޣ�Ҳ���Բ�ʹ�ã����ҿ��Զ�ͬһ��λ��ʹ�ö�Ρ�
*/
//�ύʱ�䣺2017-06-07 ���ԣ�Java ����ʱ�䣺 36 ms ռ���ڴ棺342K ״̬������ȷ
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
  
public class Main {
  
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int[] data=new int[num];
        for(int i=0;i<num;i++){
            data[i]=input.nextInt();
        }
        System.out.println(result(data));
    }
      
    public static String result(int[] data){
        int max=0;
        for(int i=0;i<data.length;i++){
            max=Math.max(max, data[i]);
        }
        List<Integer> list=new ArrayList<Integer>();
        list.add(max);
        while(max>0){
            max/=2;
            list.add(max);
        }
        for(int i=0;i<data.length;i++){
            if(!list.contains(data[i])){
                return "NO";
            }
        }
        return "YES";
    }
}