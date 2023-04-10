package Inheritance;

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
}
