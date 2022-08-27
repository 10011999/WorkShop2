import java.util.ArrayList;
import java.util.List;

public class Element {
    public static void main(String[] args) {
        List<String> word=new ArrayList<>();
        word.add("a");
        word.add("b");
        word.add("c");
        word.add("d");
        word.add("e");
        System.out.println(word);
        for (int i=0;i< word.size();i++) {
            if ("a" == word.get(i)) {
                word.set(i, "b");
                System.out.println(word.get(i));
            }
        }
        System.out.println(word);
    }
}
