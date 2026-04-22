package OOP;

public class PolymorphismOverloading {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        PolymorphismOverloading obj = new PolymorphismOverloading();
        System.out.println(obj.add(2, 3));
        System.out.println(obj.add(2, 3, 4));
    }
}