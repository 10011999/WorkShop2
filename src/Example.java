import java.util.ArrayList;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        ArrayList<String>color=new ArrayList<>();
        color.add("red");
        color.add("white");
        color.add("black");
        color.add("green");
        color.add("blue");
        System.out.println(color);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter color to search");
        String input=sc.next();
        for (String element : color){
            if(input == element) {
                System.out.println("Available");
            }else {
                System.out.println("Not");
            }
        }
    }
}
