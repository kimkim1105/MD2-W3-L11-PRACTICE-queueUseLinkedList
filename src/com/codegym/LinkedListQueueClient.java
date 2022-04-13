package com.codegym;

public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(30);
//        System.out.println("Dequeue item is "+queue.dequeue().key);
//        System.out.println("Dequeue item is "+queue.dequeue().key);
        queue.enqueue(40);
//        System.out.println("Dequeue item is "+queue.dequeue().key);
        queue.enqueue(50);
//        System.out.println("Dequeue item is "+queue.dequeue().key);
        queue.enqueue(80);
        System.out.println("Dequeue item is "+queue.dequeue().key);
    }
}
