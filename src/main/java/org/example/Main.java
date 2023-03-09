package org.example;

import java.util.concurrent.atomic.AtomicReference;

public class Main {
    public static void main(String[] args) {
       Random rnd = new Random();
        for(int i = 0; i < 8; i++) {
            Thread t = new Thread( () -> {
                Logger logger = Logger.getInstance();
                logger.log_message(LogLevel.values()[rnd.nextInt(5)],"Message: massage");
            });
            t.start();
        }
    }
}
