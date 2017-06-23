/*
从二叉树的节点A出发，可以向上或者向下走，但沿途的节点只能经过一次，
当到达节点B时，路径上的节点数叫作A到B的距离。对于给定的一棵二叉树，
求整棵树上节点间的最大距离。
给定一个二叉树的头结点root，请返回最大距离。
保证点数大于等于2小于等于500.
*/
//提交时间：2017-01-09 语言：Java 运行时间： 31 ms 占用内存：583K 状态：答案正确
import java.util.*;
 
/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}*/
public class LongestDistance {
    public static int findLongest(TreeNode root) {
        int[] res = new int[1];
        int max=findlongdis(root,res);
        return max;
    }
     
    public static int findlongdis(TreeNode root,int[] res){
        if(root==null){
            res[0] = 0;
            return 0;
        }
        int lmax=findlongdis(root.left,res);
        int lchildmax=res[0];
        int rmax=findlongdis(root.right,res);
        int rchildmax=res[0];
        res[0]=Math.max(rchildmax + 1, lchildmax + 1);
        int max=Math.max(Math.max(lmax, rmax),lchildmax+rchildmax+1);
        return max;
    }
}