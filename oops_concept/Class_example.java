package oops_concept;

public class Class_example {
    int x; // instance variable
    static int y; // static variable

    // Constructor
    public Class_example(int x) {
        this.x = x;
    }

    // Instance method
    public void display() {
        System.out.println("Instance variable x: " + x);
    }

    // Static method
    public static void show() {
        System.out.println("Static variable y: " + y);
    }

    public static void main(String[] args) {
        Class_example obj1 = new Class_example(10);
        Class_example obj2 = new Class_example(20);

        obj1.display(); // Output: Instance variable x: 10
        obj2.display(); // Output: Instance variable x: 20

        Class_example.y = 30;
        Class_example.show(); // Output: Static variable y: 30
    }
    
}
