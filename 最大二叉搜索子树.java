/*
��һ�ö��������������нڵ��ֵ����һ��,�ҵ����нڵ���� ��������������,���������������ͷ�ڵ�.
������������ͷ���root���뷵�������ͷ���,�����ֶ���ڵ���������������ͷ���Ȩֵ���ġ�
*/
//�ύʱ�䣺2017-01-10 ���ԣ�Java ����ʱ�䣺 211 ms ռ���ڴ棺3670K ״̬������ȷ
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
            data[1]=Integer.MAX_VALUE;  //����Сֵ
            data[2]=Integer.MIN_VALUE;  //�����ֵ
            return null;
        }
        TreeNode lNode=findMax(root.left, data);
        int lnum=data[0];   //0�ܽ������1��Сֵ��2���ֵ
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