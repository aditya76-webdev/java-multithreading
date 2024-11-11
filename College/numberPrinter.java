
public class numberPrinter implements Runnable {

    int number;

    public numberPrinter(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        while (number <= 100) {
            number += 1;
            System.out.println("this number " + number + " is printed by thread" + Thread.currentThread().getName());
        }
    }

}
