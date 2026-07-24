package OOP;

//public class MethodParameters {

    /// ⭐ Parameter vs Argument

    // 1.Parameter = Method Declaration.

    // void add(int a, int b),,,, Where (a,b) is Parameters


    // 2.Arguments = Method Calling.

    // add(10, 20); ,,, where (10,20) is Arguments.


        /// Example 1:-

  class Child {  // class Declaration

//        String name;  ---> Variable Shadowing
//        int age;
//  humne method mai hi variable store kar diya hai isliye class variable ki
            // Jarurat nhi hai.

        void show(String name, int age) { // Method Declaration
            // Where ( name, age) is a Parameters
            System.out.println(name + "," + age);
        }
    }

public class MethodParameters {
   public static void main(String[] args) { // Method Calling

        Child c = new Child(); // Object Declaration

        c.show("Ramji",21); // ( Ramji, 21) is a Arguments
    }
}

