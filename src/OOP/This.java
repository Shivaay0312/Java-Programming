package OOP;

//// This, this.name and this() --> keyword

    /// / this keyword:
    //this keyword refers to the current object. It is used to differentiate
    // instance variables from local variables or parameters having the same name.


        /// Syntax: this keyword
    //public class Student { // class name

//        String name; // Instance variable
//
//        Student(String name) { // constructor Parameter
//
//            this.name = name; // using this keyword to....
//          Right Side - Parameter(name)
//               ↓
//          Left Side - this.name (Instance Variable)

        //// ⭐ this() --> Difference between this() or this.name

    class Student10 {

            String name;
            int age;

            // Constructor 1
            Student10() {
                this("Unknown", 0);
            }

            // Constructor 2
            Student10(String name, int age) {
                this.name = name;
                this.age = age;
            }
        }
        public class This{
            public static void main(String[] args){
                Student10 s = new Student10();
                System.out.print(s.name+ "," +s.age);
            }
    }

