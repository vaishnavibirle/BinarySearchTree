package com.bridgelabz;

/*Created Binary Tree using MyBinaryNode*/
public class MyBinaryTree<K extends Comparable<K>> {
    public MyBinaryNode<K> rootNode;
    public void add(K key) {
        this.rootNode = this.addNodes(rootNode, key);
    }
    /*Added the nodes in tree*/
    private MyBinaryNode<K> addNodes(MyBinaryNode<K> nodeValue, K key) {
        if(nodeValue == null)
            return new MyBinaryNode<>(key);
        int result = key.compareTo(nodeValue.key);
        if(result == 0)
            return nodeValue;
        else if(result < 0)
            nodeValue.leftchild = addNodes(nodeValue.leftchild, key);
        else
            nodeValue.rightchild = addNodes(nodeValue.rightchild, key);
        return nodeValue;
    }
    /*returning nodeValue using size method*/
    public int getSize() {
        return this.getSizeRecursively(rootNode);
    }
    private int getSizeRecursively(MyBinaryNode<K> nodeValue) {
        return nodeValue == null ? 0 : 1 + this.getSizeRecursively(nodeValue.leftchild)+this.getSizeRecursively(nodeValue.rightchild);
    }
}
