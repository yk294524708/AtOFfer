package Demo06;

/**
 * Created by yan on 2016/10/8.
 * 06.�ؽ�������
 * ����ĳ��������ǰ���������
 * ������Ľ�������ؽ����ö�������
 * ���������ǰ���������������Ľ�
 * ���ж������ظ������֡���������ǰ
 * ���������{1,2,4,7,3,5,6,8}��
 * �����������{4,7,2,1,5,3,8,6}
 * �����ؽ������������ء�
 */

public class Solution {
     public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode root=reConstructBTree(pre,0,pre.length-1,in,0,in.length-1);
        return root;
    }
    private TreeNode reConstructBTree(int [] pre,int startPre,int endPre,int [] in,int startIn,int endIn) {

        if(startPre>endPre||startIn>endIn)
            return null;
        TreeNode root = new TreeNode(pre[startPre]);
        for(int i=startIn;i<=endIn;i++) {
            if (in[i] == pre[startPre]) {
                root.left=reConstructBTree(pre,startPre+1,startPre+i-startIn,in,startIn,i-1);
                root.right=reConstructBTree(pre,i-startIn + startPre + 1, endPre, in, i + 1, endIn);
            }
        }
        return root;
    }

      private class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }

}