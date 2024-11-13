import java.util.List;
import java.util.ArrayList;

public class LamdaExampleForList {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();

        list.add("Abhishek");
        list.add("Rahul");
        list.add("Rohan");
        list.add("Gourav");

        list.forEach((n)->System.out.println(n));
    }
}
