public class OverLoading {

    public static void main(String[] args) {
        B b = new B();
        b.display("helo");
        b.display(1);

    }
}


class A {
    public void display() {
        System.out.println("enter a name");
    }
}

class B extends A {
    public void display(String a) {
        System.out.println("aditya");
    }
    public void display(int a) {
        System.out.println("abhishek");
    }
    }
