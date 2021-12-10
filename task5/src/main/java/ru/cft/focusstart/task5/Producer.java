package ru.cft.focusstart.task5;

public class Producer implements Runnable {

    private Manufacture manufacture;

    public Producer(Manufacture manufacture) {
        this.manufacture = manufacture;
    }

    @Override
    public void run() {
        try {
            while (true) {
                manufacture.addResource(String.valueOf(manufacture.atomicInteger.incrementAndGet()));
                System.out.println("Добавили " + String.valueOf(manufacture.atomicInteger.incrementAndGet()) + " " + Thread.currentThread().getName());
                Thread.sleep(manufacture.getProducerTime());

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

