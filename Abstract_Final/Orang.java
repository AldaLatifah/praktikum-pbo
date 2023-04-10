package Abstract_Final;

public abstract class Orang {
    protected String name;

    public Orang(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void displayData();
    abstract void todoList();
}
