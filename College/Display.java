public class Display {
    public synchronized void wish(String s){
        for(int i =0; i<=4; i++){
            System.out.println("Hello : "+ s + i);
        }
    }
}
