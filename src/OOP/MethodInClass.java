package OOP;

//public class MethodInClass {

    //// Topic: Methods inside Class

    /// Target Topic:
    //1. What is a method?
    //2. Why do we create methods inside a class?
    //3. How do you call a method using an object?
    //4. The role of the dot (.) operator
    //5. How do multiple objects use the same method?

    /// Today Goal:
    //Variables → Store data.
    //Methods → Perform tasks(behavior).

    /// ⭐ Dot (.) Operator:- Most Important point
    // The dot (.) is used to access the members (variables and methods) of an object.

     /// Example 1:-

     class Student{ // Class Declaration
     String name;
     int age;

     void display(){ // Method Declaration
         // void - Return Datatype.
         // display - Method name.
         System.out.println(name);
         System.out.println(age);
     }
}
public class MethodInClass {
    public static void main(String[] args) { // Method Calling

        Student s1 = new Student();
        s1.name = "Shivaay";
        s1.age = 21;
        s1.display();

        Student s2 = new Student();
        s2.name = "Ram";
        s2.age = 20;
        s2.display();
    }
}