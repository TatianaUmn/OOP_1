package Task2;

public class Logic{

    public void waldrobeHuman(Human h, Waldrobe w) {
        if ((h.getKey() == "Yes" || h.getKey() == "No") && w.getPosition() == "Open") {
            System.out.println("Шкаф открыт. Ключ не нужен");
        } else if (h.getKey() == "Yes" && w.getPosition() == "Close") {
            Waldrobe.opening(h, w);
            System.out.println(h);
            System.out.println(w);
        } else if (h.getKey() == "No" && w.getPosition() == "Close") {
            Human.keySearch(h, w);
            System.out.println(w);
            Waldrobe.opening(h, w);
            System.out.println(w);
        }
    }
}