public class Test4 implements Runnable {

    @Override
    public void run() {
        System.out.println("Name of this thread is : "+Thread.currentThread().getName()+" priority of this thread is : "+ Thread.currentThread().getPriority());
    }
    
    
}
