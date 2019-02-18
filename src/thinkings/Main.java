package thinkings;

import java.util.concurrent.locks.ReentrantLock;

public class Main implements Runnable{
    public static ReentrantLock lock1 = new ReentrantLock();
    public static ReentrantLock lock2 = new ReentrantLock();
    int lock;

    public Main(int lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            if (lock == 1) {
            	System.out.println("1请求lock1锁");
                lock1.lockInterruptibly();  // 以可以响应中断的方式加锁
                System.out.println("1持有lock1锁");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {}
                System.out.println("1请求lock2锁");
                lock2.lockInterruptibly();
                System.out.println("1持有lock2锁");
            } else {
            	System.out.println("2请求lock2锁");
                lock2.lockInterruptibly();  // 以可以响应中断的方式加锁
                System.out.println("2持有lock2锁");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {}
                System.out.println("2请求lock1锁");
                lock1.lockInterruptibly();
                System.out.println("2持有lock1锁");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (lock1.isHeldByCurrentThread()) {
            	System.out.println(lock+"释放lock1锁");
            	lock1.unlock();  // 注意判断方式
            }
            if (lock2.isHeldByCurrentThread()){
            	System.out.println(lock+"释放lock2锁");
            	lock2.unlock();
            } 
            System.err.println(Thread.currentThread().getId() + "退出！");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Main deadLock1 = new Main(1);
        Main deadLock2 = new Main(2);
        Thread t1 = new Thread(deadLock1);
        Thread t2 = new Thread(deadLock2);
        t1.start();t2.start();
        Thread.sleep(1000);
        System.out.println("lock2响应中断");
        t2.interrupt(); // ③
    }
}
