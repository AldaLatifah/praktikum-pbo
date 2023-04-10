package Class_Object_Constructor;

public class Mahasiswa {
    String name, nim;

    public Mahasiswa(String name, String nim){
        this.name = name;
        this.nim = nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setName(String name) {
        this.name = name;
    }
}
