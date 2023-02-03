import java.util.ArrayList;
import java.util.Iterator;

public class program8 {
    public static void main(String[] args) {
        ArrayList <Product> products = new ArrayList<Product>();
        Product p = new Product();
        p.title= "X-Men";
        p.price = 333;
        products.add(p);
        System.out.println(p.toString());
    }
    static class Product{
        String title;
        int price;

        public String toString(){
            return title + " and " + price;
        }
    }
}
