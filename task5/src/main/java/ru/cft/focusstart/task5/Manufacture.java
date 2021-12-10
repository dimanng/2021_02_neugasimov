package ru.cft.focusstart.task5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Manufacture {
    public static final Logger log = LoggerFactory.getLogger(Program.class.getName());
    private final int producerCount;
    private final int consumerCount;
    private final int producerTime = 1500;
    private final int consumerTime = 2000;
    private final int storageSize = 10;
//TODO properties - файл

    public AtomicInteger atomicInteger = new AtomicInteger(0);

    private final List<String> resourceList = new ArrayList<>();
    public final Object manufactureMonitor = new Object();

    public Manufacture(int producerCount, int consumerCount) {
        this.producerCount = producerCount;
        this.consumerCount = consumerCount;
    }

    public int getProducerTime() {
        return producerTime;
    }

    public int getConsumerTime() {
        return consumerTime;
    }

    public void startManufacture() {
        for (int i = 1; i <= producerCount; i++) {
            Thread producerThread = new Thread(new Producer(this));
            producerThread.setName("Producer " + i);
            producerThread.start();
        }

        for (int i = 1; i <= consumerCount; i++) {
            Thread consumerThread = new Thread(new Consumer(this));
            consumerThread.setName("Consumer " + i);
            consumerThread.start();
        }
    }

    public void addResource(String resource) throws InterruptedException {
        synchronized (manufactureMonitor) {
            while (resourceList.size() >= storageSize){
                manufactureMonitor.wait();
            }
            resourceList.add(resource);
            manufactureMonitor.notifyAll();
        }
        System.out.println("Добавлен ресурс " + resource + " Размер хранилища: " + resourceList.size());
    }

    public String getResource() throws InterruptedException {
        synchronized (manufactureMonitor) {
            while(resourceList.isEmpty()){
                manufactureMonitor.wait();
            }
            String resource = resourceList.remove(resourceList.size() - 1);
            manufactureMonitor.notifyAll();
            return resource;
        }
    }
}
