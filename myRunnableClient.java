public class myRunnableClient {
    public static void main(String[] args) {
        myRunnable t1 = new myRunnable();
        Thread thread1 = new Thread(t1);
        thread1.start();
        Thread t2 = new Thread();
        t2.start();
        // t1.start();
        t2.run();
        thread1.run();
        for(int i =0; i<100; i++){
            System.out.println("Main thread");
        }
    }
}
