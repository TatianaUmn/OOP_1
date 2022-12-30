package Task2;

public class Main {
    public static void main(String[] args) {

        Human vasya = new Human("Вася", "No");
        Waldrobe waldrobe = new Waldrobe("Close");


        System.out.println("Человек подходит к шкафу");
        System.out.println(vasya);
        System.out.println(waldrobe);
        Logic logica = new Logic();
        logica.waldrobeHuman(vasya, waldrobe);



    }
}
