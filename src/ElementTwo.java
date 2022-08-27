import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ElementTwo {
    public static void main(String[] args) {
        List<Integer> num=new ArrayList<>();
        num.add(90);
        num.add(23);
        num.add(47);
        num.add(20);
        num.add(33);
        num.add(40);
        num.add(49);
        num.add(50);
        num.add(81);
        System.out.println(num);
        for (int i=0;i< num.size();i++){
            if(num.get(i) % 10==0){
                num.remove(i);
            }
        }
        System.out.println(num);
    }
}
