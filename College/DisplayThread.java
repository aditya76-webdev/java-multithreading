public class DisplayThread extends Thread {
    Display d;
    String s;

    public DisplayThread(Display d,String s){
        this.d = d;
        this.s = s;
    }
    @Override
    public void run(){
        d.wish(s);
    }

    
}
