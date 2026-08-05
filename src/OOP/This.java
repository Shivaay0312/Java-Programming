package OOP;

public class This {

    /// / this keyword:
    //this keyword refers to the current object. It is used to differentiate
    // instance variables from local variables or parameters having the same name.


        /// Syntax: this keyword
    public class Student { // class name

        String name; // Instance variable

        Student(String name) { // constructor Parameter

            this.name = name; // using this keyword to....
//          Right Side - Parameter(name)
//               ↓
//          Left Side - this.name (Instance Variable)

        }
    }
}
