package Classes;

public class Student {

    String name;
    int age;

public void write()
{
    System.out.println(name + " is Writing");
}

        public static void main(String[] args) {
        
        Student a = new Student();
        a.name = "RUU";
        a.age = 20;
        a.write();
        
    }
}
