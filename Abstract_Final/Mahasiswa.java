package Abstract_Final;

public class Mahasiswa extends Orang {
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

    //Override dari method abstract 
    //Semua method abstract harus diturunkan

    public void todoList(){
        System.out.println("Todo List Hari ini");
        System.out.println("1. Makan");
        System.out.println("2. Tidur");
        System.out.println("3. Bernafas");
    }
    
    @Override
    public void displayData(){
        System.out.println("Name : " + super.name);
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
