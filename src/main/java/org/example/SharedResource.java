package org.example;

import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {
    boolean isAvailable=false;
    ReentrantLock lock = new ReentrantLock();

    public void produce(){
        try{
            lock.lock();
            System.out.println("Lock acquired by: " + Thread.currentThread().getName());
            isAvailable=true;
        }catch(Exception e){
            //some exception handling code
        }
        finally {
            System.out.println("Lock released by: " + Thread.currentThread().getName());
            lock.unlock();
        }
    }
}
