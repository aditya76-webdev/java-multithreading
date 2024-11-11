package College;

public class TableClient {
    public static void main(String args[]){
    
    Table obj = new Table();
    
    TableThread1 t1=new TableThread1(obj);
    
    TableThread2 t2=new TableThread2(obj);
    
    t1.start();
    
    t2.start();
    
    }
    
    
}
