package AccessModifier_Encapsulation;

public class Mahasiswa {
    private String name;
    private String nim;

    public Mahasiswa(String name, String nim){
        this.name = name;
        this.nim = nim;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNim() {
        return this.nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
}
