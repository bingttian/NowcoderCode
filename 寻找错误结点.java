/*
一棵二叉树原本是搜索二叉树，但是其中有两个节点调换了位置，
使得这棵二叉树不再是搜索二叉树，请找到这两个错误节点并返回他们的值。
保证二叉树中结点的值各不相同。
给定一棵树的根结点，请返回两个调换了位置的值，其中小的值在前。
*/
//提交时间：2017-01-09 语言：Java 运行时间： 107 ms 占用内存：1232K 状态：答案正确
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
public class FindErrorNode {
    public int[] findError(TreeNode root) {
        LinkedList<TreeNode> queue=new LinkedList<TreeNode>();
        zhong_fun(root, queue);
        int[] res=new int[2];
        int len=queue.size();
        int k=1;
        int n=queue.poll().val;
        for(int i=0;i<len-1;i++){
            int m=queue.poll().val;
            System.out.println(n+" "+m);
            if(n>m){
                if(res[1]==0){
                    res[1]=n;
                }else{
                    res[0]=m;
                }
                res[0]=m;
            }
            n=m;
        }
        return res;
    }
     
    public static void zhong_fun(TreeNode root,LinkedList<TreeNode> list){
        if(root==null){
            return;
        }
        zhong_fun(root.left, list);
        list.add(root);
        zhong_fun(root.right, list);
    }
}