public class test4Client {
    public static void main(String[] args) {

        System.out.println("name and priority of this thread is : "+Thread.currentThread().getName()+"  "+Thread.currentThread().getPriority());
        Test4 obj1 = new Test4();
        Thread t1 = new Thread(obj1);
        t1.setPriority(Thread.MAX_PRIORITY);

        Test4 obj2 = new Test4();
        Thread t2 = new Thread(obj2);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();

    }
}
