/*
�ȶ�����ȥ�̳���һ��ñ�ӣ��̳�����N��ñ�ӣ���Щñ�ӵļ۸������ͬ��
�ȶ�������һ���۸�������˵�ñ�ӣ��ʵ������˵�ñ�Ӽ۸��Ƕ��٣�
*/
//�ύʱ�䣺2017-06-22 ���ԣ�Java ����ʱ�䣺 54 ms ռ���ڴ棺9296K ״̬������ȷ
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;
   
public class Main{
   
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int[] data=new int[num];
        for(int i=0;i<num;i++){
            data[i]=input.nextInt();
        }
        System.out.println(result(num, data));
    }
       
    public static int result(int num,int[] data){
        TreeSet<Integer> set=new TreeSet<Integer>();
        for(int i=0;i<num;i++){
            set.add(data[i]);
        }
        if(set.size()<3){
            return -1;
        }else {
            int[] res=new int[set.size()];
            Iterator itSet = set.iterator();
            int index=0;
            while(itSet.hasNext()){
                res[index++]=(Integer)itSet.next();
            }
            return res[2];
        }
    }
}