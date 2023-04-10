package Polymorphism;

public class Orang {
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

    public void displayData(){
        System.out.println("Nama : " + this.name);
    }
}
