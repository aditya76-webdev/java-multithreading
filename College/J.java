public class J implements Runnable{
    public void run (){
        for(int i=0; i<5; i++){
            System.out.println("This is "+ Thread.currentThread().getName());
        }
    }
}