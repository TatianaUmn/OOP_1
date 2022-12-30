package Task3;

public class Person {
    private String name;
    private boolean owner;

    public Person(String name, boolean owner) {
        this.name = name;
        this.owner = owner;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getOwner() {
        return owner;
    }

   
    public void catCall(Boolean owner, Cat cat) {
        if (owner) {
            System.out.println(name + " зовет: " + cat.getName() + " иди ко мне.");
            cat.catCome(cat.getName()); 
            cat.catEating(getOwner());
        } else {
            System.out.println(name + " зовет: " + cat.getName() + " иди ко мне."); 
            cat.catNotComing(cat.getName());
        }
        
    }
    
}
