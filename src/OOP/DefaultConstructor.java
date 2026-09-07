package OOP;

//public class DefaultConstructor {

    // A default constructor is a constructor that has no parameters. If we do not write any constructor,the Java compiler automatically provides a default constructor.

    //// Example: default constructor.
    //Student()     --->      ✅ Default Constructor

    //// Programe-1:

    class Studentss{

        String name;
        int age;

        // Default Constructor
        Studentss() { // No Parameter that means Default Constructor

            //We have written this value inside the constructor ourselves.
            /// if we are not write any type of value constructor print null values.
            name = "Shivaay";
            age = 19;
        }

        void display() {
            System.out.println("Name:" + name);
            System.out.println("Age:" + age);
        }
    }

    public class DefaultConstructor {

        public static void main(String[] args) {

            Studentss s1 = new Studentss(); // Constructor automatically call hoga

            s1.display();

        }
    }


