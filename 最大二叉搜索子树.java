/*
有一棵二叉树，其中所有节点的值都不一样,找到含有节点最多 的搜索二叉子树,并返回这棵子树的头节点.
给定二叉树的头结点root，请返回所求的头结点,若出现多个节点最多的子树，返回头结点权值最大的。
*/
//提交时间：2017-01-10 语言：Java 运行时间： 211 ms 占用内存：3670K 状态：答案正确
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
public class MaxSubtree {
    public TreeNode getMax(TreeNode root) {
    int[] data=new int[3];
        return findMax(root, data);
    }
     
 
    public static TreeNode findMax(TreeNode root,int[] data){
        if(root==null){
            data[0]=0;
            data[1]=Integer.MAX_VALUE;  //记最小值
            data[2]=Integer.MIN_VALUE;  //记最大值
            return null;
        }
        TreeNode lNode=findMax(root.left, data);
        int lnum=data[0];   //0总结点数，1最小值，2最大值
        int lmin=data[1];
        int lmax=data[2];
        TreeNode rNode=findMax(root.right, data);
        int rnum=data[0];
        int rmin=data[1];
        int rmax=data[2];
         
        data[1]=Math.min(lmin,root.val);
        data[2]=Math.max(rmax,root.val);
        System.out.println(Arrays.toString(data));
        if(lNode==root.left&&rNode==root.right&&lmax<root.val&&rmin>root.val){
            data[0]=lnum+rnum+1;
            return root;
        }
        data[0]=Math.max(rnum,lnum);
        TreeNode node=rnum>=lnum?rNode:lNode;
        return node;
    }
}