package com.bridgelabz;

/*Created MyBinaryNode by using INode
Extend comparable to compare left and right node
 */
public class MyBinaryNode<K extends Comparable<K>> {
    K key;
    MyBinaryNode<K> leftchild; //leftchild is leftnode
    MyBinaryNode<K> rightchild; //rightchild is rightnode

    public MyBinaryNode(K key) {
        this.key = key;
        this.leftchild = null;
        this.rightchild = null;
    }
}