package com.xiyoulinux.blockingqueue;

import java.util.Arrays;
import java.util.Stack;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 双锁实现
 * 使用级联唤醒(Cascade Wake-up)提高性能
 *
 * @param <E> 元素类型
 */
@SuppressWarnings("all")
public class BlockingQueue1<E> implements BlockingQueue<E> {

    private final E[] array;
    private int head;
    private int tail;

    private final ReentrantLock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();

    public BlockingQueue1(int capacity) {
        this.array = (E[]) new Object[capacity];
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }

    @Override
    public int size() {
        return tail;
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public boolean isFull(){
        return size() == array.length;
    }

    @Override
    public void offer(E e) throws InterruptedException {
        lock.lock();
        try {
            while(isFull()){
                condition.await();
            }
            array[tail++] = e;
            condition.signal();
        }  finally {
            lock.unlock();
        }
    }

    @Override
    public E poll() throws InterruptedException {
        lock.lock();
        try {
            while (isEmpty()) {
                condition.await();
            }
            E e = array[head];
            array[head] = null;
            condition.signal();
            return e;
        }  finally {
            lock.unlock();
        }
    }
}
