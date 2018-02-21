package com.java;

/**
 * Created by dongmengyuan on 18-2-21.
 */

public class FirstThread extends Thread {
    //i是FirstThread的实例属性，不是局部变量
    private int i;
    //重写run()方法，run()方法的方法体是线程执行体
    public void run() {
        for( ; i < 100; i++) {
            //当线程使用继承Thread类时，直接使用this就可以获取当前线程
            //Thread对象的getName()返回当前线程的名字
            //直接调用getName()方法返回当前线程的名字
            System.out.println(getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        for(int i = 0; i < 100; i++) {
            //调用Thread的currentThread()方法获取当前线程
            System.out.println(Thread.currentThread().getName() + " " + i);
            if(i == 20) {
                //创建并启动第一个线程
                new FirstThread().start();
                //创建并启动第二个线程
                new FirstThread().start();
            }
        }

    }
}
