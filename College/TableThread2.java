package College;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
class TableThread2 extends Thread{
    Table t;
    TableThread2(Table t) {
        this.t = t;
    }
    @Override
    public void run(){
        t.printtable(100);
    }

    

}
