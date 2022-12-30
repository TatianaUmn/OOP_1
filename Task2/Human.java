package Task2;

public class Human {
    private String name;
    private String key;

    public Human(String name, String key) {
        this.name = name;
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
    
    public String toString() {
        return "Human [name = " + name + ", key = " + key + "]";
    }

    public static Human keySearch (Human h, Waldrobe w){
        
        if (h.getKey() == "No" && w.getPosition() == "Close"){
            System.out.println("Ключа нет. Нужно ключ у жены.");
            System.out.println("Теперь ключ есть");
            h.setKey("Yes"); 
            System.out.println(h);        
        }
        return h;    
    }
}
