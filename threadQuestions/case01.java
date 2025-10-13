class Task {
    public  synchronized void m1() {
        for (int i = 0; i < 5; i++) {
            System.out.println("m1 Instance method is executing " + Thread.currentThread().getName());
        }
    }
    
    public  synchronized void m2() {
        for (int i = 0; i < 5; i++) {
            System.out.println("m2 Instance method is executing " + Thread.currentThread().getName());
        }
    }
    
    public static synchronized void m3() {
        for (int i = 0; i < 5; i++) {
            System.out.println("m3 Static method is executing " + Thread.currentThread().getName());
        }
    }
    
    public static synchronized void m4() {
        for (int i = 0; i < 5; i++) {
            System.out.println("m4 Static method is executing " + Thread.currentThread().getName());
        }
    }
}

class First extends Thread {
    private Task Task;

    public First(Task Task) {
        this.Task = Task;
    }

    public void run() {
        // System.out.println(Thread.currentThread().getName());
        Task.m1();
    }
}

class Second extends Thread {
    private Task Task;

    public Second(Task t) {
        this.Task = t;
    }

    public void run() {
        // System.out.println(Thread.currentThread().getName());
        Task.m2();
    }
}

class Third extends Thread {
    private Task Task;

    public Third(Task t) {
        this.Task = t;
    }

    public void run() {
        // System.out.println(Thread.currentThread().getName());
        Task.m3();
    }
}

class Fourth extends Thread {
    private Task Task;

    public Fourth(Task t) {
        this.Task = t;
    }

    public void run() {
        // System.out.println(Thread.currentThread().getName());
        Task.m4();
    }
}

class case6 {
    public static void main(String[] args) {
        Task Task1 = new Task();
        Task Task2 = new Task();
        Task Task3 = new Task();
        Task Task4 = new Task();
        First t1 = new First(Task1);
        t1.setName("thread-1 ");
        Second t2 = new Second(Task2);
        t2.setName("thread-2 ");
        Third t3 = new Third(Task3);
        t3.setName("thread-3 ");
        Fourth t4 = new Fourth(Task4);
        t4.setName("thread-4 ");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}