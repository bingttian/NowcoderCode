/*
�Ӷ������Ľڵ�A�������������ϻ��������ߣ�����;�Ľڵ�ֻ�ܾ���һ�Σ�
������ڵ�Bʱ��·���ϵĽڵ�������A��B�ľ��롣���ڸ�����һ�ö�������
���������Ͻڵ��������롣
����һ����������ͷ���root���뷵�������롣
��֤�������ڵ���2С�ڵ���500.
*/
//�ύʱ�䣺2017-01-09 ���ԣ�Java ����ʱ�䣺 31 ms ռ���ڴ棺583K ״̬������ȷ
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