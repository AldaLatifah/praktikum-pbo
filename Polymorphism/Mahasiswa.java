package Polymorphism;

public class Mahasiswa extends Orang{
    private String nim;

    public Mahasiswa(String name, String nim){
        super(name);
        this.nim = nim;
    }

    public String getNim() {
        return this.nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    @Override
    public void displayData(){
        super.displayData();
        System.out.println("NIM : " + this.nim);
    }

    //overloading
    public void displayData(Boolean check){
        if(check){
            System.out.println("NIM : " + this.nim);
        }else{
            displayData();
        }
    }

}
