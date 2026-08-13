package OOP;

//public class ConstructorOverloading {

    //// Constructor Overloading
    //Creating multiple constructors within the same
    // class that have different parameters is called constructor overloading.

        /// Program 1

 class Studenta{
     int age;
     String name;

     // Constructor 1 - Default Constructor
        Studenta() {
        }
        void display(){
            System.out.println();
        }

        // Constructor 2 - One Parametrized Constructor
        Studenta( String name ) {
            this.name = name;
        }
            void show(){
            System.out.println("String: " + name);
        }

        // Constructor 3 - Parametrized Constructor
        Studenta( int age, String name ) {
            this.age = age;
            this.name = name;
        }
        void shown(){
            System.out.println("Age: " +age+ "," + "Name: " +name);
        }
 }

public class ConstructorOverloading {
    public static void main(String[] args) {

        Studenta s1 = new Studenta();
        s1.display();
        Studenta s2 = new Studenta("Vineet");
        s2.show();
        Studenta s3 = new Studenta(20, "Rudra");
        s3.shown();
    }
}
