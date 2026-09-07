package OOP;

//// Parametrized Constructor--> That contain parameters in constructor.
class Student11 {
    String name;
    int age;

    Student11(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void display() {
            System.out.println("Name:"+ name+ "," +"Age:"+ age);
            //System.out.println(age);
    }
}
    public class ParametrizedConstructor {
       public static void main(String[] args) {
            Student11 s = new Student11("Rahul" ,21);
            //// Given the arguments value
            s.display();
    }
}
