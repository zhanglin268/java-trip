package com.lin.demo2;

import java.util.LinkedList;
import java.util.List;

/**
 * @program:20200527
 * @description
 * @author: 张林
 * @creat:2020-05-28 19:55
 **/
public class BSTree {
    public static class Node {
        public int val;
        public Node left;
        public Node right;

        public Node(int val) {
            this.val = val;
        }
    }
    public Node root = null;

    //插入数据
    public boolean insert(int val) {
        Node node = new Node(val);
        if(root == null) {
            root = node;
            return true;
        }
        Node cur = root;
        Node parent = null;
        while (cur != null) {
            if (cur.val == val) {
                return false;
            }else if(cur.val < val) {
                parent = cur;
                cur = cur.right;
             }else {
                parent = cur;
                cur = cur.left;
            }
        }
        if(parent.val > val) {
            parent.left = node;
        }else {
            parent.right = node;
        }
        return true;
    }
    //查找
    public Node search(int val) {
        Node cur = root;
        while(cur != null) {
            if(cur.val == val) {
                return cur;
            }else if(cur.val < val) {
                cur = cur.right;
            }else {
                cur = cur.left;
            }

        }
        return null;
    }
    //删除
    public boolean remove(int key) {
        Node cur = root;
        Node parent = null;
        while(cur != null) {
            if(cur.val == key) {
                removeNode(parent,cur);
            }else if(key < cur.val) {
                parent = cur;
                cur = cur.left;
            }else {
                parent = cur;
                cur = cur.right;
            }
        }
        return false;
    }
    public void removeNode(Node parent,Node cur) {
        if(cur.left == null) {
            if(cur == root) {
                root = cur.right;
            }else if(cur == parent.left) {
                parent.left = cur.right;
            }else {
                parent.right = cur.right;
            }
        }else if(cur.right == null) {
            if(cur == root) {
                root = cur.left;
            }else if(cur == parent.left) {
                parent.left = cur.left;
            }else {
                parent.right = cur.left;
            }
        }else {
            Node targetParent = cur;
            Node target = cur.right;
            while(target.left != null) {
                targetParent = target;
                target = target.left;
            }
            cur.val = target.val;
            if(target == targetParent.left) {
                targetParent.left = target.right;
            }else {
                targetParent.right = target.right;
            }
        }
    }


    public  void preOrder(Node root) {
        if(root == null) {
            return ;
        }
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public  void inOrder(Node root) {
        if(root == null) {
            return ;
        }
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }


    public static void main(String[] args) {
        BSTree bsTree = new BSTree();
        int[] array = {1,3,2,5,6,7,8,23,55,14,53};
        for(int i : array) {
            bsTree.insert(i);
        }
        bsTree.preOrder(bsTree.root);
        System.out.println();
        bsTree.inOrder(bsTree.root);
        System.out.println();
        System.out.println(bsTree.search(8).val);
    }
}
   