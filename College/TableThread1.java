package College;

public class TableThread1 extends Thread {
    Table t;
    TableThread1(Table t){
        this.t =t;
    }
    @Override
    public void run(){
        t.printtable(5);
    }
}
