import java.util.Iterator;
import java.util.Vector;

public class program6 {
    public static void main(String[] args) {
        Vector<Object> vec = new Vector<>();
        vec.add("Texas");
        vec.add("Zurich");
        vec.add("New York");

        Iterator it = vec.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
