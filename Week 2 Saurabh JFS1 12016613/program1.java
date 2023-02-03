public class program1 {
    int arg = 5;
    void myTest(int arg){ // default constructor
        arg = arg;
    }
    public static void main(String[] args) {
        int arg = 10;
        program1 obj = new program1();
        obj.myTest(arg);
        System.out.println(obj.arg);
    }
}