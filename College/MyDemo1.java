public class MyDemo1 extends Thread {
    @Override
    public void run(){
        System.out.println("Zero argument ");
    }
    
    public void run(int i){
        System.out.println("One Argument");
    }
}
