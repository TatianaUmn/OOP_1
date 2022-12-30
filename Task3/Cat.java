package Task3;

public class Cat {
    private String name;
    private boolean hungry;

    public Cat(String name, boolean hungry) {
        this.name = name;
        this.hungry = hungry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getHungry() {
        return hungry;
    }

    public void catCome(String name) {
        System.out.println(name + " идет к хозяину");
    }

    public void catNotComing(String name) {
        System.out.println(name + " не идет к чужому человеку");
    }

    public void catEating(boolean hungry) {
        if (hungry) {
            System.out.println(name + " просит у хозяина кушать");
        } else {
            System.out.println(name + " не голоден");
        }
    }



    
}
