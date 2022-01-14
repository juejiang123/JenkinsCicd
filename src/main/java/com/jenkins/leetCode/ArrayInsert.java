package com.jenkins.leetCode;

public class ArrayInsert {
    private int[] array1;
    private int size;

    public ArrayInsert(int cap){
        this.array1 = new int[cap];
        size = 0;
    }

    public void insert(int ele, int index) {
        if(index<0 || index>size){
            System.out.println("超出范围");
            throw new IndexOutOfBoundsException("超出范围了");
        }
        for(int i=size-1;i>=index;i--){
            array1[i+1]= array1[i];
        }
//        for (int i=size-1;i>=i;i--){
//            array1[i+1]=array1[index];
//        }
        array1[index] = ele;
        size++;

    }

    public void delete(int index) {
        if(index<0 || index>size){
            System.out.println("超出范围");
            throw new IndexOutOfBoundsException("超出范围了");
        }

        int del = array1[index];
        for(int i=index;i<=size-1;i++){
            array1[i]= array1[i+1];
        }

        size--;
    }

    public void output(){
        for (int i=0;i<size;i++){
            System.out.print(array1[i]+" ");

        }
        System.out.println("");
    }

    public static void main(String[] args) {
        ArrayInsert arrayInsert = new ArrayInsert(6);
        arrayInsert.insert(2,0);
        arrayInsert.insert(3,1);
        arrayInsert.insert(4,0);
        arrayInsert.output();
        arrayInsert.delete(2);
        arrayInsert.output();


    }
}
