public class YieldThread extends Thread{
    @Override
    public void run(){
        for( int i =0; i< 5; i++){
            System.out.println("This thread is : "+Thread.currentThread().getName());
        }
    }
    
}
