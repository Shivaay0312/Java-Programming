package OOP;

//public class Constructor {

      //// Constructor();
    //In object-oriented programming (OOP), a constructor is a special method
    // inside a class that automatically runs when you create a new object.

///What does a constructor do?
// A constructor helps set initial values as soon as an object is created.

    /// The first constructor

    //Syntax:
  //  class Student {

        //Rule 1:
        ///The constructor's name is the same as the class name.

       // Student() { // This is not a method,,,
            /// This is a constructor.
          //  System.out.println("Object Created");

//            class Student {

               //Rule 1:
               ///The constructor's name is the same as the class name.

//                Student() { // Constructor
                ///✔ Same Name
                ///

               //Rule 2
                /// Constructor has no return type.
             // Example 1:-
             //void bhi nahi.
             //int bhi nahi.
             //Kuch bhi nahi.
  //      }


                    /// Example 1:- Constructor();

             class Children{

                 Children(){
                     System.out.println("Closed");
                 }
             }
             public class Constructor {
                 static void main(String[] args) {

                     Children c1 = new Children();
                     Children c2 = new Children();


             /// Parameterized Constructor.

              //Student s1 = new Student();
               //s1.name = "Shiv";
               //s1.age = 21;
              // Passing these values through the constructor

             /// Example 2:- Parameterized
                     class Student {

                         // Instance Variables
                         String name;
                         int age;

                         // Constructor
                         Student(String name, int age) {
                             /// Student → Constructor Name

                             this.name = name;

                             /// Left Side -->
                             // this.name→ Class instance variable
                             /// Right side -->
                             // name -> Constructor parameter

                             this.age = age;

                             /// Left Side -->
                             // this.age→ Class instance variable
                             /// Right side -->
                             // age -> Constructor parameter

                             //// That means: Store the value of constructor parameter in instance variable.
                             // this.name = "Rahul";
                             // s1.name = "Rahul";
                         }


                         // Method
                         void display() {
                             System.out.println("Name:"  + name + "," + "Age:" + age);
                         }
                     }

//                     public class Constructor {
//
//                      public static void main(String[] args) { // Main Method call

                             // Object create
                             Student s1 = new Student("Rahul", 20);

                             // Method call
                             s1.display();
                         }
                     }