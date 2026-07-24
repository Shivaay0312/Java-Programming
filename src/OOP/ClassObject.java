package OOP;

//class ClassObject {

    //// Class - Object:
   // Class: A blueprint or template.
   // Object: A real thing created from that blueprint.

    // Line 1- Student s = new Student(); // Only Create a Object.
    /// s = is a real object
    // Line 2- s.name = "Shivnandan"; // It stores the value under the object.

    /// Both Lines work are different.




//    class Student {
//
//        /// Example 1: Class & Object:
//
//        String name;
//        int age;
//        int rollnum;
//    }
//
    public class ClassObject{
       public static void main(String[] args) {
//
//           Student s = new Student();
//
//           s.name = "Shiv";
//           s.age = 21;
//           s.rollnum = 101;
//         System.out.println(s.name+","+s.age+","+s.rollnum);


        /// Example 2:- Crete Multiple Class in OOP.
        // Ek Class → Bahut saare Objects
        class Student{
            String name;
            int age;
        }
//    public class ClassObject {
//        public static void main(String[] args) {

            Student s1 = new Student();
            Student s2 = new Student();
            s1.name = "Shiv";
            s1.age = 21;

            s2.name = "Aman";
            s2.age = 22;
            System.out.println(s1.name + "," + s1.age);
            System.out.println(s2.name + "," + s2.age);
        }
    }
