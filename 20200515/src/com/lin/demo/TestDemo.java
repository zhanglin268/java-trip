package com.lin.demo;

/**
 * @program:20200515
 * @description
 * @author: 张林
 * @creat:2020-05-16 20:00
 **/
public class TestDemo {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        Node root = binaryTree.buildTree();
        binaryTree.preOrderTraversal(root);//A B D E H C F G
        System.out.println();
        binaryTree.inOrderTraversal(root);//D B E H A F C G
        System.out.println();
        binaryTree.postOrderTraversal(root);//D H E B F G C A
        System.out.println();
        binaryTree.getSize1(root);
        System.out.println("节点的个数" + binaryTree.size);
        System.out.println("节点的个数" + BinaryTree.size);

        System.out.println("节点个数 " + binaryTree.getSize2(root));
        binaryTree.getLeafSizel(root);
        System.out.println("叶子节点的个数 " + BinaryTree.leafSize);
        System.out.println("叶子节点 "+binaryTree.getLeafSize2(root));

    }



}
