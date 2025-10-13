class ProducernConsumer {
    int item;
    boolean flag = false;  // false = producer's turn, true = consumer's turn

    // Producer will call this method
    synchronized public void produce(int item) {
        try {
            while (flag) {  // if consumer hasn't consumed yet, wait
                wait();
            }
            this.item = item;
            System.out.println("Producer produced: " + item);
            flag = true;
            notify(); // notify consumer
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Consumer will call this method
    synchronized public int consume() {
        int value = 0;
        try {
            while (!flag) {  // if producer hasn't produced yet, wait
                wait();
            }
            value = this.item;
            System.out.println("Consumer consumed: " + value);
            flag = false;
            notify(); // notify producer
        } catch (Exception e) {
            e.printStackTrace();
        }
        return value;
    }
}

// Producer Thread
class Producer extends Thread {
    ProducernConsumer c;
    Producer(ProducernConsumer c) {
        this.c = c;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            c.produce(i);
        }
    }
}

// Consumer Thread
class Consumer extends Thread {
    ProducernConsumer c;
    Consumer(ProducernConsumer c) {
        this.c = c;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            c.consume();
        }
    }
}

// Main Class
class ProducerConsumer {
    public static void main(String[] args) {
        ProducernConsumer comp = new ProducernConsumer();
        Producer p = new Producer(comp);
        Consumer c = new Consumer(comp);

        p.start();
        c.start();
    }
}
