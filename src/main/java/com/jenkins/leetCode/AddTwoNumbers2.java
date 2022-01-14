package com.jenkins.leetCode;


class Node {
    public int data;
    public Node next;

    public Node(int val){
        this.data = val;
    }
}
class CreateNode{

    private Node head;
    private Node last;
    private Node cursor;
    private int size;


    public void insert(int index,int dt){
        if(index<0 || index>size){
            throw new IndexOutOfBoundsException("超出范围");

        }
        Node insertedNode = new Node(dt);
        if(size==0){
            head = insertedNode;
            last = insertedNode;
        }else if(index==size){
            last.next = insertedNode;
            last = insertedNode;
        }else {
            Node preNode = get(index - 1);
            Node nextNode = preNode.next;
            preNode.next = insertedNode;
            insertedNode.next = nextNode;
        }

        size++;

    }

    public Node get(int index){
        if(index<0 || index>size){
            throw new IndexOutOfBoundsException("超出范围");
        }
        Node temp = head;
        for(int i=0;i<index;i++){
            temp = temp.next;
        }
        return temp;
    }

    public void output(){
        cursor = head;
        while (cursor!=null){
            System.out.println(cursor.data);
            cursor = cursor.next;
        }
    }

}

public class AddTwoNumbers2{

    public Node addTest(Node l1, Node l2){
        int carry = 0;
        Node node = new Node(0);
        Node cursor = node;
        while (l1 !=null || l2!=null || carry!=0){
            int l1Val = l1 !=null? l1.data:0;
            int l2Val = l2 !=null? l2.data:0;
            int sumVal = l1Val+l2Val+carry;
            carry = sumVal/10;
            Node sum = new Node(sumVal % 10);
            cursor.next = sum;
            cursor = cursor.next;
            if(l1 !=null){
                l1 = l1.next;
            }
            if(l2 !=null){
                l2 = l2.next;
            }
        }
        return node.next;

    }

    public static void main(String[] args) {
        Node node1 = new Node(3);
        node1.next = new Node(4);
        Node node2 = new Node(7);
        node2.next = new Node(8);
        AddTwoNumbers2 numbers2 = new AddTwoNumbers2();
        Node node = numbers2.addTest(node1, node2);
        Node temp = node;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;

        }

    }

}


