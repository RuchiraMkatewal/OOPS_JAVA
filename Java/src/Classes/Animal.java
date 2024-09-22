package Classes;

public class Animal {

    String name;
    String type;

    public void walk()
    {
        System.out.println(name + " is Walking.");
        System.out.println(name + " is a " + type +  " animal");
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        a.name = "Cat";
        a.type = "pet";
       
        a.walk();
    }


}
