/*
度度熊想去商场买一顶帽子，商场里有N顶帽子，有些帽子的价格可能相同。
度度熊想买一顶价格第三便宜的帽子，问第三便宜的帽子价格是多少？
*/
//提交时间：2017-06-22 语言：Java 运行时间： 54 ms 占用内存：9296K 状态：答案正确
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