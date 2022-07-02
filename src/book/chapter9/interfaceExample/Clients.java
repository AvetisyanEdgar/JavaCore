package book.chapter9.interfaceExample;

public class Clients implements Callback {
    public void callback(int p){
        System.out.println("метод callBack(), вызываемый параметром " + p);

    }
    void nonIfaceMeth(){
        System.out.println("В классах реализующих интерфейсы могут определяться и другие члены");
    }


}
