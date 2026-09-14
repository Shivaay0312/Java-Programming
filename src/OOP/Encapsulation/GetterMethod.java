package OOP.Encapsulation;

//public class Encapsulation {

    //// What is Encapsulation ?
    //Encapsulation = Bundling data and methods within a class and protecting the data from direct access.

///    ✅ Encapsulation ---> We will make the data private.

    ///Basic Syntax  Encapsulation:
   // class Student {

       // private String name;
       // private int age;
//
//        Ab bahar se:
//
//        s.name = "Rahul";
//
//   ❌  We are not access Directly outsources.


        //// 🔐 Topic 2: private Variable.
        //This variable cannot be accessed directly outside the class.

        //🧠 Remember -->
        //public → can be accessed from outside ✅
        //private → cannot be accessed directly from outside ❌

        //// 🔥 Topic 3: Getter Method.
        //When a variable is private, a getter method is used to read or access its value from outside.

        /// Example:

        //class Student {

          //  private String name;

           // public String getName() {
            //    return name; // It means → return the value of 'name'.
//            }
//        }
        // get (getter) = value lena/read karna.

        //// Example of Getter complete Java program.

        class Employee1 {

            // Private variable
            private String name;

            // Constructor
            Employee1(String name){
                this.name = name;
            }

            // Getter method
            public String getname(){
                return name; // return the value of 'name'.
            }
        }
        public class GetterMethod {
            public static void main(String[] args) {

                // Object creation
                Employee1 e = new Employee1("Shivaay");

                // Reading the value of a private variable using a getter method.
                System.out.println(e.getname());
            }
        }





