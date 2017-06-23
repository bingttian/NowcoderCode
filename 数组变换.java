/*
牛牛有一个数组，里面的数可能不相等，现在他想把数组变为：所有的数都相等。问是否可行。
牛牛可以进行的操作是：将数组中的任意一个数改为这个数的两倍。
这个操作的使用次数不限，也可以不使用，并且可以对同一个位置使用多次。
*/
//提交时间：2017-06-07 语言：Java 运行时间： 36 ms 占用内存：342K 状态：答案正确
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