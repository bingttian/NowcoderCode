/*
����һ������[a, b]�����������ڡ����������ĸ�����
�������Ķ��壺���ڲ�ͬλ�õ�������λ�����һ����λ�����Ҳ���ǰ��0�����������λ��Ϊ������
���磺153������ʹ������3������1���13��13��������������������
ͬ��153�����ҵ�31��53ҲΪ������ֻҪ�ҵ�һ��������������������
*/
//�ύʱ�䣺2017-06-07 ���ԣ�Java ����ʱ�䣺 108 ms ռ���ڴ棺4881K ״̬������ȷ
import java.util.ArrayList;
import java.util.Scanner;
  
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min = input.nextInt();
        int max = input.nextInt();
        System.out.println(result(min,max));
    }
  
    public static int result(int min,int max) {
        int num=0;
        for(int i=min;i<=max;i++){
            if(flag(i)){
                num++;
            }
        }
        return num;
    }
      
    public static boolean flag(int index){
        ArrayList<Integer> num = new ArrayList<Integer>();
        while(index>0){
            num.add(index%10);
            index/=10;
        }
        while(num.size()>1){
            for (int j = 1; j < num.size(); j++) {
                String temp = num.get(0).toString() + num.get(j).toString();
                if (num.get(0) != 0 && iszhi(temp)) {
                    return true;
                }
                temp = num.get(j).toString() + num.get(0).toString();
                if (num.get(j) != 0 && iszhi(temp)) {
                    return true;
                }
            }
            num.remove(0);
        }
        return false;
    }
      
    public static boolean iszhi(String num){
        if(Integer.valueOf(num)==2){
            return false;
        }
        for(int i=2;i<Integer.valueOf(num);i++){
            if(Integer.valueOf(num)%i ==0){
                return false;
            }
        }
        return true;
    }
}