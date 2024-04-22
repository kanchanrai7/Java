// Java program to implement solution of producer-consumer problem.

import java.util.*;

class Queue {
    private LinkedList<Integer> list = new LinkedList<>();
    int capacity;

    public Queue(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void put(int value) throws InterruptedException {
        while (list.size() == capacity) {
            wait();
        }
        list.add(value);
        System.out.println("Producer has produced: " + value);
        notify();
    }

    public synchronized int get() throws InterruptedException {
        while (list.size() == 0) {
            wait();
        }
        int value = list.removeFirst();
        System.out.println("Consumer has consumed: " + value);
        notify();
        return value;
    }
}

class Producer extends Thread {
    private Queue queue;

    public Producer(Queue queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            for (int i = 0; i < queue.capacity; i++) {
                queue.put(i + 1);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer extends Thread {
    private Queue queue;

    public Consumer(Queue queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            for (int i = 0; i < queue.capacity; i++) {
                queue.get();
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        Queue queue = new Queue(10); 

        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();
    }
}