import java.util.ArrayList;
import java.util.Comparator;

public class program7 {
    public static void main(String[] args) {
        ArrayList<String> states = new ArrayList<String>();
        states.add("California");
        states.add("Alabama");
        states.add("Alaska");
        states.add("Arkansas");

        System.out.println("Array list: " + states);
        // Accessing elelments using get method

        String s = states.get(2);
        System.out.println("I got " + s);
        // Size of array list
        System.out.println("Array List size: " + states.size());

        // for loop
        for (int i = 0; i < states.size(); i++) {
            System.out.println(states.get(i));
        }

        // update elements using set

        states.set(1, "Texas");
        System.out.println("New States : " + states);

        // removing elements using remove method

        states.remove(3);
        System.out.println("New States: " + states);

        // sorting using sort method

        states.sort(Comparator.naturalOrder());
        System.out.println("Array after sorting: " + states);

        // get index of element
        System.out.println("Texas is at " + states.indexOf("Texas") + " index.");
        // contains method

        System.out.println("Is NewYork There? " + states.contains("NewYork"));

        // you can check if list is empty or not?

        System.out.println("Is list empty? " + states.isEmpty());

        states.removeAll(states);
        System.out.println("Is list empty? " + states.isEmpty());
    }
}