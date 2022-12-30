package Task2;

public class Waldrobe {

    private String position;

    public Waldrobe(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String toString() {
        return "Waldrobe [position = " + position + "]";
    }

    public static Waldrobe opening(Human h, Waldrobe w) {
        if (h.getKey() == "Yes" && w.getPosition() == "Close") {
            w.setPosition("Open");
            System.out.println("Шкаф открыт!");
        }
        return w;

    }
    
}
