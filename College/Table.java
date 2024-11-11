package College;

public class Table {
    synchronized void printtable(int n){
        for(int i =1; i<=10; i++){
            System.out.println(n*i);
        }
    }
}
