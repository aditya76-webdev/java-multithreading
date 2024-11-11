public class client {
    public static void main(String[] args) {
        numberPrinter np = new numberPrinter(0);
        Thread t1 = new Thread(np);
        Thread t2 = new Thread(np);
        t1.start();
        t2.start();
    }
    

}
