package ru.cft.focusstart.task5;

public class Consumer implements Runnable {

    private Manufacture manufacture;

    public Consumer(Manufacture manufacture) {
        this.manufacture = manufacture;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String resource = manufacture.getResource();
                System.out.println("Забрали " + resource + " " + Thread.currentThread().getName());
                Thread.sleep(manufacture.getConsumerTime());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

