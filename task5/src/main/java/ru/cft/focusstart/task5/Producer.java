package ru.cft.focusstart.task5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Producer implements Runnable {
    public static final Logger log = LoggerFactory.getLogger(Program.class.getName());
    private Manufacture manufacture;

    public Producer(Manufacture manufacture) {
        this.manufacture = manufacture;
    }

    @Override
    public void run() {
        try {
            while (true) {
                log.info(Thread.currentThread().getName() + " в режиме ожидания");
                Thread.sleep(manufacture.getProducerTime());
                log.info(Thread.currentThread().getName() + " в работе");
                int resource = manufacture.atomicInteger.incrementAndGet();
                manufacture.addResource(String.valueOf(resource));
                log.info("Произведен #" + resource + " " + Thread.currentThread().getName() + " Размер хранилища: " + manufacture.resourceList.size());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

