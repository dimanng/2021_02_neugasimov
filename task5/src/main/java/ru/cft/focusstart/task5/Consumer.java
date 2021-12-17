package ru.cft.focusstart.task5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Consumer implements Runnable {
    public static final Logger log = LoggerFactory.getLogger(Program.class.getName());
    private Manufacture manufacture;

    public Consumer(Manufacture manufacture) {
        this.manufacture = manufacture;
    }

    @Override
    public void run() {
        try {
            while (true) {
                log.info(Thread.currentThread().getName() + " в режиме ожидания");
                Thread.sleep(manufacture.getConsumerTime());
                log.info(Thread.currentThread().getName() + " в работе");
                String resource = manufacture.getResource();
                log.info("Потреблен #" + resource + " " + Thread.currentThread().getName() + " Размер хранилища: " + manufacture.resourceList.size());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

