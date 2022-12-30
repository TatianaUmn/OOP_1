package Task3;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Иван", true);
        Person person2 = new Person("Петр", false);
        Cat cat = new Cat("Васька", true);
        person.catCall(person.getOwner(), cat);

        System.out.print("\n");
        person.catCall(person2.getOwner(), cat);
    }
    
}
