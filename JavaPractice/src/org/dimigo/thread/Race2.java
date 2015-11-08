
package org.dimigo.thread;

public class Race2 {

    public static void main(String[] args) {
        Thread runner1 = new Thread(new Runner2("홍길동"));
        Thread runner2 = new Thread(new Runner2("홍길순"));

        System.out.println("main thread start");

        runner1.setPriority(Thread.MAX_PRIORITY);
        runner2.setPriority(Thread.MAX_PRIORITY);

        runner1.start();
        runner2.start();
        System.out.println("main thread stop");
    }

}
