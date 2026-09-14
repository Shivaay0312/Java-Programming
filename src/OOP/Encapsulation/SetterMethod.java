package OOP.Encapsulation;

// public class SetterMethod {

     //// 🔐 Setter Method -> Setter = Setting or changing/Update a value inside a private variable.

     //// Example of Setter Complete Program.

       class Employee01 {

         private String name;

         // Setter Method
         public void setName(String name) {

             this.name = name;
         }

         // Getter Method
         public String getName() {

             return name;
         }
     }

     public class SetterMethod {
           public static void main(String[] args){

           Employee01 e = new Employee01();

           // Setter: value andar set karna
           e.setName("Shivaay");

            // Getter: value bahar read karna
               System.out.println(e.getName());
           }
     }

     //🧠Code flow Chart
//Student s = new Student()
//        ↓
//   Object created
//        ↓
//s.setName("Shiv")
//        ↓
//private name = "Shiv"
//        ↓
//s.getName()
//        ↓
//return name
//        ↓
//"Shiv"