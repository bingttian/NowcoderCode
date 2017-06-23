/*
有一棵二叉树，请设计一个算法，按照层次打印这棵二叉树。
给定二叉树的根结点root，请返回打印结果，
结果按照每一层一个数组进行储存，所有数组的顺序按照层数从上往下，
且每一层的数组内元素按照从左往右排列。保证结点数小于等于500。
*/
//提交时间：2016-12-11 语言：Java 运行时间： 33 ms 占用内存：709K 状态：答案正确
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
public class TreePrinter {
    public int[][] printTree(TreeNode root) {
       if(root==null)
            return null;
        LinkedList<TreeNode> queue=new LinkedList<TreeNode>();
        ArrayList<Integer> arr=new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> layer=new ArrayList<ArrayList<Integer>>();
        TreeNode last=root;
        TreeNode nlast=null;
        TreeNode temp=null;
        queue.add(root);
        while(!queue.isEmpty()){
            temp=queue.poll();
            arr.add(temp.val);
            if(temp.left!=null){
                queue.add(temp.left);
                nlast=temp.left;
            }
            if(temp.right!=null){
                queue.add(temp.right);
                nlast=temp.right;
            }
            if(temp==last){
                layer.add(arr);
                arr=new ArrayList<Integer>();
                last=nlast;
            }
        }
         
        int[][] a=new int[layer.size()][];
        for(int i=0;i<layer.size();i++){
            a[i]=new int[layer.get(i).size()];
            for(int j=0;j<layer.get(i).size();j++){
                a[i][j]=layer.get(i).get(j);
            }
        }
         
        return a;
    }
}