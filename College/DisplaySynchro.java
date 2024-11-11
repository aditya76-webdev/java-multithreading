public class DisplaySynchro {
    public static void main(String[] args) {
        Display d = new Display();
        DisplayThread t1 = new DisplayThread(d, "Aditya");
        DisplayThread t2 = new DisplayThread(d, "Akshat");
        DisplayThread t3 = new DisplayThread(d, "BhasKaran");
        DisplayThread t4 = new DisplayThread(d, "MC Stan");
        t1.start();
        t2.start();
        t4.start();
        t3.start();
        

    }
}
