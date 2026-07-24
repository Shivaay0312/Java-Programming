package OOP;

//public class MultiObject {

    /// Topic 1 - How multiple objects use the same method.

// Topic 1: One Method for Multiple Objects

    class Students{ // Class Declaration

        String name;
        int age;
        int rollNum;

        void show(){ // Non-Static method Declaration.

            System.out.println(name);
            System.out.println(age);
            System.out.println(rollNum);

    }
}
public class MultiObject {
    public static void main(String[] args) { // Method Calling


        // Creating Multiple Objects
        Students s1 = new Students();
        Students s2 = new Students();
        Students s3 = new Students();

        s1.name = "Archi";
        s1.age = 21;
        s1.rollNum = 101;

        s2.name = "Shiv";
        s2.age = 22;
        s2.rollNum = 102;

        s3.name = "Bhaskar";
        s3.age = 20;
        s3.rollNum = 103;

        s1.show();
        s2.show();
        s3.show();

    }
}