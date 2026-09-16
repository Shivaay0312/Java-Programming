package OOP.Encapsulation;

//public class SetterValidation {

    //// Encapsulation – Topic 5: Setter Validation.

    /// Setter Validation --> Add a condition inside the setter so that incorrect data cannot enter the object.


    /// ⭐ Actual benefit of Encapsulation --> That is why we keep the variable private and control its value through a setter.


  class Employee10{
      private int salary;

      public void setSalary(int salary){

          if(salary>=0){ // Setter Validation Condition
              this.salary = salary;
          }
        }
        public int getSalary(){
          return salary;
        }
    }
    public class SetterValidation {
      public static void main(String[] args){

          Employee10 e = new Employee10();
          e.setSalary(5000);
            System.out.println(e.getSalary());
      }
}
