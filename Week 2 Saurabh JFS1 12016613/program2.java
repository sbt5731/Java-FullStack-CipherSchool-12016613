class App {
    App(){
        System.out.println("Constructor of App");
    }
    App(int num) {
        System.out.println(num);
    }
}
public class program2 extends App{
    program2(){
        super(20);
        System.out.println("Constructor of Test2");
    }

    public static void main(String[] args) {
        new program2();
    }
}
// if you call constructor of derived then the first constructor to be
// called will be the constructor of base and then derived