package com.lin.demo;

import java.util.ArrayList;

/**
 * @program:20200515
 * @description
 * @author: 张林
 * @creat:2020-05-15 19:44
 **/
class Node {
    public char val;
    public Node left;
    public Node right;
    public Node (char val) {
        this.val = val;
    }
}
public class BinaryTree {
    public Node buildTree() {
        Node A = new Node('A');
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
    }


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
    void getLeafSizel(Node root) {
        if(root == null) {
            return ;
        }else if(root.left == null && root.right == null) {
            leafSize++;
        } else {
            getLeafSizel(root.left);
            getLeafSizel(root.right);
        }
    }
    int getLeafSize2(Node root) {
        if(root == null) {
            return 0;
        }
        if(root.left == null && root.right == null) {
            return 1;
        }
        return getLeafSize2(root.left) + getLeafSize2(root.right);
    }



}
