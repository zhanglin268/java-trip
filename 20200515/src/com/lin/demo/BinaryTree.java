package com.lin.demo;

import java.util.*;

/**
 * @program:20200515
 * @description
 * @author: 张林
 * @creat:2020-05-15 19:44
 **/
class Node {
    //public char val;
    public int val;
    public Node left;
    public Node right;
    public Node (int val) {
        this.val = val;
    }
}
public class BinaryTree {
       public Node buildTree() {
        /*Node A = new Node('A');
        Node B = new Node('B');
        Node C = new Node('C');
        Node D = new Node('D');
        Node E = new Node('E');
        Node F = new Node('F');
        Node G = new Node('G');
        Node H = new Node('H');
        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        E.right = H;
        C.left = F;
        C.right = G;
        return A;
*/
        Node a = new Node(5);
        Node b = new Node(5);
        Node c = new Node(5);
        Node d = new Node(5);
        Node e = new Node(5);
        Node f = new Node(5);
        Node g = new Node(5);
        Node h = new Node(5);
        Node i = new Node(5);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        d.left = g;
        c.right = f;
        f.left = h;
        f.right = i;

        return a;



       }

    Node pre ;
    public Node increasingBST(Node root) {
        if(root == null) {
            return null;
        }

        Node tmp = new Node(-1);
        pre = tmp;
        func(root);
        return pre.right;

    }
    public void func(Node root) {
        if(root == null) {
            return ;
        }
        func(root.left);
        root.left = null;
        pre.right = root;
        pre = root;
        func(root.right);

    }


    //根据所给的按某种顺序排列的字符串求生成的二叉树
   /* int i = 0;
    public Node buildTree(String str) {
        Node root = null;
        if( str.charAt(i) != '#') {
            root = new Node(str.charAt(i));
            i++;
            root.left = buildTree(str);
            root.right = buildTree(str);

        }else {
            i++;
        }
        return root;
    }*/


    void preOrderTraversal(Node root){ //前序遍历
        if(root == null) {
            return;
        }
        System.out.print(root.val+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    void inOrderTraversal(Node root){//中序遍历
        if(root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.val + " ");
        inOrderTraversal(root.right);
    }
    void postOrderTraversal(Node root){//后序遍历
        if(root == null) {
            return ;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.val + " ");
    }

    static int size = 0;//静态的只有一份
    void getSize1(Node root) {//求节点个数，以前序的方式

        if(root == null) {
            return ;
        }
        size++;//size放在那里都可以
        getSize1(root.left);
        //System.out.println(root.val + " ");
        getSize1(root.right);
    }

    int getSize2(Node root) {//子问题求节点个数
        if(root == null) {
            return 0;
        }
        int l = getSize2(root.left);
        int r = getSize2(root.right);
        return l+r+1;//return getSize2(root.left) + getSize2(root.right)+ 1;
    }
    static int leafSize = 0;
    void getLeafSizel(Node root) {//求叶子节点
        if(root == null) {
            return ;
        }else if(root.left == null && root.right == null) {
            leafSize++;
        } else {
            getLeafSizel(root.left);
            getLeafSizel(root.right);
        }
    }
    int getLeafSize2(Node root) {//求叶子节点2
        if(root == null) {
            return 0;
        }
        if(root.left == null && root.right == null) {
            return 1;
        }
        return getLeafSize2(root.left) + getLeafSize2(root.right);
    }
    int getKLevelSize(Node root,int k) {//求第k层的节点个数
        if(root == null) {
            return 0;
        }else if(k == 1) {
            return 1;
        }else {
            return getKLevelSize(root.left,k-1) + getKLevelSize(root.right,k-1);
        }

    }
    int getHeight(Node root) {  //拿到二叉树的高度
        if(root == null) {
            return 0;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        return leftHeight > rightHeight ? leftHeight  +1 :rightHeight+1;
    }
    Node find(Node root,int val) {//查找为val的节点
        if(root == null) {
            return null;
        }
        if(root.val == val) {
            return root;
        }
        Node leftNode = find(root.left,val);
        //2、左边
        //  递归--》左边全部递归完成后-》返回值是否是空
        if(leftNode != null) {
           return leftNode;
        }
        //3、右边
        Node rightNode =   find(root.right,val);
        if(rightNode != null) {
          return rightNode;

        }
        return null;
    }

    //oj练习题
    public boolean isSame(Node p,Node q) {//判断两个数是否相等
        if(p == null && q == null) {
            return true;
        }
        if (p == null || q != null) {
            return false;
        }
        if(p.val != q.val) {
            return false;
        }
        return isSame(p.left,q.left) && isSame(p.right,q.right);


    }
    //比较一个数是否包含一个子树
    public boolean isSubtree(Node s, Node t) {
        if(s == null || t == null) {
            return false;
        }
        if(isSame(s,t)) {
            return true;
        }
        return isSubtree(s.left,t) || isSubtree(s.right,t);

    }

    public boolean isSameTree(Node p, Node q) {
        if( (p == null && q != null)   || (p != null && q == null)) {
            return false;
        }
        if(p == null && q == null) {
            return true;
        }

        if(p.val != q.val) {
            return false;
        }

        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }


    public boolean isBalanced(Node root) {//平衡二叉树
        if(root == null) {
            return true;
        }
        int leftHeight =  maxDepth(root.left);
        int rightHeight = maxDepth(root.right);
        return Math.abs(leftHeight - rightHeight) < 2 &&
                isBalanced(root.left) &&isBalanced(root.right);

    }

    public int maxDepth(Node root) {
        if(root == null) {
            return 0;
        }
        int leftHeight = maxDepth(root.left);
        int rightHeight =  maxDepth(root.left);

        return leftHeight >  rightHeight? leftHeight+1 :
                rightHeight+1;
    }

    //层序遍历
        void levelOrderTraversal(Node root){

            if(root == null) return;

            Queue<Node> queue = new LinkedList<>();
            queue.offer(root);
            while(!queue.isEmpty()) {//while循环用来遍历整个树
                Node cur = queue.poll();
                if(cur != null) {
                    System.out.println(cur.val + " ");
                    if(cur.left != null) {
                        queue.offer(cur.left);

                    }
                    if(cur.right != null) {
                        queue.offer(cur.right);

                    }
                }

            }
        }
    //层序遍历   当做一个List<Integer> 放进去
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ret = new LinkedList<>();
        if(root == null) return ret;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            //1、求当前队列的大小  size
            int size = queue.size();
            List<Integer> row = new LinkedList<>();

            //2、while(size > 0)  -->控制当前每一层的数据个数
            while(size > 0) {
                Node cur = queue.poll();
                row.add((int)cur.val);
                if(cur.left != null) {
                    queue.offer(cur.left);
                }
                if(cur.right != null) {
                    queue.offer(cur.right);
                }
                size--;

            }
            ret.add(row);

        }


        return ret;
    }

    //判断一棵树是不是完全二叉树
    boolean isCompleteTree(Node root) {//
        if(root == null) {
            return true;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            Node cur = queue.poll();
            if(cur != null) {
                queue.offer(cur.left);
                queue.offer(cur.right);
            }else {
                break;
            }
        }
        //看一下 对里面是否都是空

        while(!queue.isEmpty()) {
            if( queue.peek() != null) {
                return false;
            }else {
                queue.poll();
            }
        }
        return true;
    }

    //前中后的非递归写法（栈）
    // 前序遍历
    void preOrderTraversalNor(Node root) {
        if(root == null) {
            return ;
        }
        Stack<Node> stack = new Stack<>();
        Node cur = root;
        while(cur != null || !stack.empty()) {
            while(cur != null ) {
                stack.push(cur);
                System.out.print(cur.val + " ");
                cur = cur.left;

            }
            Node top = stack.pop();
            cur = top.right;
        }



    }
    // 中序遍历
    void inOrderTraversalNor(Node root) {
        if(root == null) {
            return ;
        }
        Stack<Node> stack = new Stack<>();
        Node cur = root;
        while(cur != null || !stack.empty()) {
            while(cur != null) {
                stack.push(cur) ;
                cur = cur.left;
            }
            Node top = stack.pop();

            System.out.println(cur.val + " ");
            cur = top.right;
        }

    }
    // 后序遍历
    void postOrderTraversalNor(Node root) {
        if(root == null) {
            return ;
        }
        Stack<Node> stack = new Stack<>();
        Node cur = root;
        Node pre = null;
        while(cur != null || !stack.empty()) {
            while(cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.peek();
            if(cur.right == null || cur.right == pre) {
                System.out.println(cur.val + " ");
                stack.pop();
                pre = cur;
                cur = null;
            }else {
                cur = cur.right;
            }

        }




    }

        // 二叉树搜索树转换成排序双向链表
    Node prev = null;
    public void ConvertChild(Node root) {
        if(root == null) {
            return ;
        }
        ConvertChild(root.left);

        root.left = prev;
        if(prev != null) {
            prev.right = root;
        }
        prev = root;

        ConvertChild(root.right);
    }
    public Node Convert(Node root) {
        if(root == null) {
            return null;
        }
        ConvertChild(root);
        Node head = root;
        while(head.left != null) {
            head = head.left;
        }
        return head;
    }


    //根据一棵树的中序遍历与前序序遍历构造二叉树
    public Node buildTreeChild(int[] preorder,int preIndex,int[] inorder,int inbegain, int inend) {
        if(inbegain > inend) {
            return null;//表示没有节点了
        }
        Node root = new Node(preorder[preIndex]);
        int rootIndex = findIndexInorder(inorder,inbegain,inend,preorder[preIndex]);
        preIndex++;
        if(rootIndex == -1) {
            return null;
        }
        root.left = buildTreeChild(preorder,preIndex,inorder,inbegain,rootIndex-1);
        root.right = buildTreeChild(preorder,preIndex,inorder,rootIndex+1,inend);
        return root;
    }

    public int findIndexInorder(int[] inorder,int inbegain,int inend,int val) {
        for(int i = inbegain;i <= inend;i++) {
            if(inorder[i] == val) {
                return i;
            }
        }
        return -1;
    }

    int preIndex = 0;
    public Node buildTree(int[] preorder, int[] inorder) {
        if(preorder == null || inorder == null) {
            return null;
        }
        if(preorder.length <= 0 || inorder.length <= 0) {
            return null;
        }


        return buildTreeChild(preorder,preIndex,inorder,0,inorder.length-1);
    }
    // 根据一棵树的中序遍历与后序遍历构造二叉树
    public int postIndex = 0;
    public Node buildTreeChild1(int[] inorder,int[] postorder,int inbegain, int inend) {
        if(inbegain > inend) {
            return null;//表示没有节点了
        }
        Node root = new Node(postorder[postIndex]);
        int rootIndex = findIndexInorder(inorder,inbegain,inend,postorder[postIndex]);
        postIndex--;
        if(rootIndex == -1) {
            return null;
        }
        root.right = buildTreeChild1(inorder,postorder,rootIndex+1,inend);
        root.left = buildTreeChild1(inorder,postorder,inbegain,rootIndex-1);
        return root;
    }

    public int findIndexInorder1(int[] inorder,int inbegain,int inend,int val) {
        for(int i = inbegain;i <= inend;i++) {
            if(inorder[i] == val) {
                return i;
            }
        }
        return -1;
    }


    public Node buildTree1(int[] inorder, int[] postorder) {
        if(inorder == null || postorder == null) {
            return null;
        }
        if(inorder.length <= 0 || postorder.length <= 0) {
            return null;
        }


        return buildTreeChild1(inorder,postorder,0,inorder.length-1);
    }


    /////////
    public void tree2strChild(Node t,StringBuffer sb) {
        if(t == null) return;
        sb.append(t.val);

        if( t.left == null ) {

            if(t.right == null) {
                return;
            }else{
                sb.append("()");
            }
        }else {
            //( -> 递归 -> )
            sb.append("(");
            tree2strChild(t.left,sb);
            sb.append(")");
        }

        if(t.right == null) {
            return;
        }else{
            sb.append("(");
            tree2strChild(t.right,sb);
            sb.append(")");
        }

    }

    public String tree2str(Node t) {
        StringBuffer sb = new StringBuffer();
        tree2strChild(t,sb);
        return sb.toString();
    }





    //镜像对称二叉树
   /* public boolean isSymmetric(TreeNode root) {
        if(root == null) {
            return true;
        }
        return isSymmetricChild(root.left,root.right);

    }
    public boolean isSymmetricChild(TreeNode leftTree,TreeNode rightTree) {
        if((leftTree == null && rightTree != null) || (leftTree != null && rightTree == null)) {
            return false;
        }
        if(leftTree  == null && rightTree == null) {
            return true;
        }
        if(leftTree.val != rightTree.val) {
            return false;
        }
        return isSymmetricChild(leftTree.left,rightTree.right) && isSymmetricChild(leftTree.right,rightTree.left);

    }

*/






}
