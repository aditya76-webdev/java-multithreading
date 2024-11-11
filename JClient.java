public class JClient {
    public static void main (String[] args) throws InterruptedException{
        J obj1 = new J();
        Thread t1 = new Thread(obj1);
        t1.start();
        t1.join();
        for(int i =0; i< 4; i++){
            System.out.println("This thread is : "+ Thread.currentThread().getName());
        }
    }
}
