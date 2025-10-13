class A {
    private B bobj;

    public synchronized void m1(B bobj) {
        this.bobj = bobj;
        System.out.println(Thread.currentThread().getName() + " entered A.m1");

        try {
            Thread.sleep(100); // delay, taaki doosra thread B ka lock le le
        } catch (InterruptedException e) {
        }

        bobj.x2(); // yahan B ka lock chahiye hoga
        System.out.println(Thread.currentThread().getName() + " finished A.m1");
    }

    public synchronized void m2() {
        System.out.println(Thread.currentThread().getName() + " entered A.m2");
    }
}

class B {
    private A aobj;

    public synchronized void x1(A aobj) {
        this.aobj = aobj;
        System.out.println(Thread.currentThread().getName() + " entered B.x1");

        try {
            Thread.sleep(100); // delay, taaki pehla thread A ka lock le le
        } catch (InterruptedException e) {
        }

        aobj.m2(); // yahan A ka lock chahiye hoga
        System.out.println(Thread.currentThread().getName() + " finished B.x1");
    }

    public synchronized void x2() {
        System.out.println(Thread.currentThread().getName() + " entered B.x2");
    }
}

class First extends Thread {
    private A aobj;
    private B bobj;

    public First(A aobj, B bobj) {
        this.aobj = aobj;
        this.bobj = bobj;
    }

    public void run() {
        aobj.m1(bobj);
    }
}

class Second extends Thread {
    private A aobj;
    private B bobj;

    public Second(A aobj, B bobj) {
        this.aobj = aobj;
        this.bobj = bobj;
    }

    public void run() {
        bobj.x1(aobj);
    }
}

class DeadLock{
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        First t1 = new First(a, b);
        t1.setName("Thread-1");
        Second t2 = new Second(a, b);
        t2.setName("Thread-2");
        t1.start();
        t2.start();
    }
}
