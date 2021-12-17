package ru.cft.focusstart.task5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ManufactureProperties {
    public static final Logger log = LoggerFactory.getLogger(Program.class.getName());
    private static final String PATH_TO_PROPERTIES = "config.properties";
    private Properties prop;
    private int producerCount;
    private int consumerCount;
    private int producerTime;
    private int consumerTime;
    private int storageSize;

    public int getProducerCount() {
        return producerCount;
    }

    public int getConsumerCount() {
        return consumerCount;
    }

    public int getProducerTime() {
        return producerTime;
    }

    public int getConsumerTime() {
        return consumerTime;
    }

    public int getStorageSize() {
        return storageSize;
    }

    public ManufactureProperties() {
        try(InputStream input = ManufactureProperties.class.getClassLoader().getResourceAsStream(PATH_TO_PROPERTIES)) {
            prop = new Properties();
            prop.load(input);
            producerCount = Integer.parseInt(prop.getProperty("producerCount"));
            consumerCount = Integer.parseInt(prop.getProperty("consumerCount"));
            producerTime = Integer.parseInt(prop.getProperty("producerTime"));
            consumerTime = Integer.parseInt(prop.getProperty("consumerTime"));
            storageSize = Integer.parseInt(prop.getProperty("storageSize"));
        } catch (IOException e) {
            log.error("Не найден конфигурационный файл: " + PATH_TO_PROPERTIES);
            e.printStackTrace();
        }
    }
}
