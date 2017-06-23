/*
三维空间中有N个点，每个点可能是三种颜色的其中之一，三种颜色分别是红绿蓝，分别用'R', 'G', 'B'表示。 
现在要找出三个点，并组成一个三角形，使得这个三角形的面积最大。
但是三角形必须满足：三个点的颜色要么全部相同，要么全部不同。
*/
//提交时间：2017-06-22 语言：Java 运行时间： 149 ms 占用内存：11636K 状态：答案正确
import java.text.DecimalFormat;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String[] colors = new String[num];
        int[][] data = new int[num][3];
        for (int i = 0; i < num; i++) {
            colors[i] = input.next();
            for (int j = 0; j < 3; j++) {
                data[i][j] = input.nextInt();
            }
        }
        System.out.println(result(num, colors, data));
    }
 
    public static String result(int num, String[] colors, int[][] data) {
        double max = 0;
        for (int i = 0; i < num; i++) {
            for (int j = i + 1; j < num; j++) {
                for (int k = j + 1; k < num; k++) {
                    if (IsColor(i, j, k, colors)) {
                        max = Math.max(max, Area(i, j, k, data));
                    }
                }
            }
        }
        DecimalFormat df = new DecimalFormat("#.00000");
        return df.format(max);
    }
 
    public static boolean IsColor(int i, int j, int k, String[] colors) {
        if (!colors[i].equals(colors[j])  && !colors[i].equals(colors[k]) && !colors[j].equals(colors[k])) {
            return true;
        }
        if (colors[i].equals(colors[j]) && colors[j].equals(colors[k])) {
            return true;
        }
        return false;
    }
 
    public static double Distance(int a, int b, int[][] data) {
        return Math.sqrt((data[a][0] - data[b][0]) * (data[a][0] - data[b][0])
                + (data[a][1] - data[b][1]) * (data[a][1] - data[b][1])
                + (data[a][2] - data[b][2]) * (data[a][2] - data[b][2]));
    }
 
    public static double Area(int i, int j, int k, int[][] data) {
        double a = Distance(i, j, data);
        double b = Distance(j, k, data);
        double c = Distance(i, k, data);
        double p = (a + b + c) / 2;
        if(p * (p - a) * (p - b) * (p - c)<0){
            return 0;
        }
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}