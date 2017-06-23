/*
����һ����ȫ�������ĸ��ڵ�root������������Ľڵ������
�����ȫ�������Ľڵ���ΪN����ʵ��ʱ�临�Ӷȵ���O(N)�Ľⷨ��
�������ĸ����root���뷵�����Ĵ�С��
*/
//�ύʱ�䣺2017-01-03 ���ԣ�Java ����ʱ�䣺 85 ms ռ���ڴ棺2730K ״̬������ȷ
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
public class CountNodes {
    public int count(TreeNode root) {
       int res=0;
        res=countFullTree(root, res);
        return res-1;
    }
     
    public static int countFullTree(TreeNode root,int res){
        if(root==null){
            return res;
        }
        int lhigh=get_high(root);
        int rhigh=get_high(root.right)+1;
        if(lhigh==rhigh){
            res+=Math.pow(2, lhigh)-1;      //���������С�2��n�η���һ�������
            res++;                          //��������ͷ���
            res=countFullTree(root.right, res);
        }else{
            res+=Math.pow(2,rhigh)-1;
            res++;
            res=countFullTree(root.left, res);
        }
        return res;
    }
     
    public static int get_high(TreeNode root){
        int high=0;
        while(root!=null&&root.left!=null){
            high++;
            root=root.left;
        }
        return high;
    }
}