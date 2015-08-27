package com.zuozuo.show_time.multiprocessing;

import com.zuozuo.service.IAlbumService;

/**
 * Created by zuozuo on 15-8-27.
 // */
public class SimpleThreads {

    // ThreadMessage
    static void threadMessage(String message) {
        String threadName = Thread.currentThread().getName();
        System.out.format("%s: %s%n", threadName, message);
    }

    private static class MessageLoop implements Runnable {

        public void run() {
            String importantInfo[] = { "First line", "Second line", "Third line", "Fourth line" };

            for (int i = 0; i < importantInfo.length; i++) {
                try {
                    Thread.sleep(2000);
                    threadMessage(importantInfo[i]);
                } catch (InterruptedException e) {
                    //                    e.printStackTrace();
                    threadMessage("Why Interrupt me?");
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        threadMessage("Begin the simpleThreads");

        long patience = 5000;

        long startTime = System.currentTimeMillis();

        Thread t = new Thread(new MessageLoop(), "MessageLoop");
        t.start();

        while (t.isAlive()) {
            try {
                threadMessage("still wating");
                t.join(1000);

                while (((System.currentTimeMillis() - startTime) > patience) && t.isAlive()) {
                    //                    t.interrupt();
                    threadMessage("I can not stand wait!");
                    t.join();
                }

            } catch (InterruptedException e) {
                threadMessage("Oh, interrupt!");
            }
        }
        threadMessage("Done!");
    }
}
//public class SimpleThreads {
//
//    // Display a message, preceded by
//    // the name of the current thread
//    static void threadMessage(String message) {
//        String threadName =
//                Thread.currentThread().getName();
//        System.out.format("%s: %s%n",
//                threadName,
//                message);
//    }
//
//    private static class MessageLoop
//            implements Runnable {
//        public void run() {
//            String importantInfo[] = {
//                    "Mares eat oats",
//                    "Does eat oats",
//                    "Little lambs eat ivy",
//                    "A kid will eat ivy too"
//            };
//            try {
//                for (int i = 0;
//                     i < importantInfo.length;
//                     i++) {
//                    // Pause for 4 seconds
//                    Thread.sleep(4000);
//                    // Print a message
//                    threadMessage(importantInfo[i]);
//                }
//            } catch (InterruptedException e) {
//                threadMessage("I wasn't done!");
//            }
//        }
//    }
//
//    public static void main(String args[])
//            throws InterruptedException {
//
//        // Delay, in milliseconds before
//        // we interrupt MessageLoop
//        // thread (default one hour).
//        long patience = 1000 * 60 * 60;
//        patience = 5000;
//
//        // If command line argument
//        // present, gives patience
//        // in seconds.
//        if (args.length > 0) {
//            try {
//                patience = Long.parseLong(args[0]) * 1000;
//            } catch (NumberFormatException e) {
//                System.err.println("Argument must be an integer.");
//                System.exit(1);
//            }
//        }
//
//        threadMessage("Starting MessageLoop thread");
//        long startTime = System.currentTimeMillis();
//        Thread t = new Thread(new MessageLoop());
//        t.start();
//
//        threadMessage("Waiting for MessageLoop thread to finish");
//        // loop until MessageLoop
//        // thread exits
//        while (t.isAlive()) {
//            threadMessage("Still waiting...");
//            // Wait maximum of 1 second
//            // for MessageLoop thread
//            // to finish.
//            t.join(1000);
//            if (((System.currentTimeMillis() - startTime) > patience)
//                && t.isAlive()) {
//                threadMessage("Tired of waiting!");
//                t.interrupt();
//                // Shouldn't be long now
//                // -- wait indefinitely
//                t.join();
//            }
//        }
//        threadMessage("Finally!");
//    }
//}