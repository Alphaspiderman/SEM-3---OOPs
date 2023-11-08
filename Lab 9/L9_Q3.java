package Lab_9;

import java.util.ArrayList;

public class L9_Q3 {
    public static void main(String[] args) {
        Buffer buffer = new Buffer(5);

        Thread producerThread = new Thread(new Producer(buffer));
        Thread consumerThread = new Thread(new Consumer(buffer));

        producerThread.start();
        consumerThread.start();
    }
}

class Buffer {
    private ArrayList<Integer> list = new ArrayList<>();
    private int capacity;

    public Buffer(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void produce(int item) {
        while (list.size() == capacity) {
            try {
                wait(); // Wait if the buffer is full
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        list.add(item);
        System.out.println("Produced: " + item);

        notify(); // Notify waiting consumer
    }

    public synchronized int consume() {
        while (list.isEmpty()) {
            try {
                wait(); // Wait if the buffer is empty
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        int item = list.remove(0);
        System.out.println("Consumed: " + item);

        notify(); // Notify waiting producer

        return item;
    }
}

class Producer implements Runnable {
    private Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.produce(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable {
    private Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            buffer.consume();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}