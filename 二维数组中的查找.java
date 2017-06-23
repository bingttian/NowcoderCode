/*
在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
*/
//提交时间：2017-02-22 语言：Java 运行时间： 139 ms 占用内存：5147K 状态：答案正确
public class Solution {
    public boolean Find(int target, int [][] array) {
int i=array.length-1;
        int j=0;
        while(i>=0 && j<array[0].length){
            if(array[i][j]<target){
                j++;
            }else if(array[i][j]>target){
                i--;
            }else{
                return true;
            }
        }
        return false;
    }
}