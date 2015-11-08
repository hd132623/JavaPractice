
package org.dimigo.thread;

public class Runner extends Thread {

    private String name;

    public Runner() {}

    public Runner(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println(name + " 출발");
        for(int i = 0; i < 11; i ++) {
            System.out.println(name + " 출발 " + (10 - i) * 10 + " 미터");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name + " 골인");
    }
}
