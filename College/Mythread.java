public class Mythread extends Thread {
    
    @Override
    public void run(){
        for(int i =0;i<10;i++){
            System.out.println(i+ " Child Thread");
        }
    }
    public static void main(String[] args) {
        Mythread t1 = new Mythread();
        t1.start();
        for(int i =0; i<10; i++){
            System.out.println(i+" Main thread");
        }
    }
}