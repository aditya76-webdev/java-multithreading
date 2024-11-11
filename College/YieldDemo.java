public class YieldDemo {
    public static void main(String[] args) {
        YieldThread obj1 = new YieldThread();
        
        obj1.start();
        for (int i =0; i< 5; i++) {
            Thread.yield();
            System.out.println(Thread.currentThread().getName() + " in control");
        }
        

    }
}
