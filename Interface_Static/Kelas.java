package Interface_Static;

import java.util.ArrayList;

public class Kelas {
    private String nama;
    private String kode;
    private String dosen;
    private static ArrayList<Kelas> kelas = new ArrayList<>();;

    public Kelas(String nama, String kode, String dosen) {
        this.nama = nama;
        this.kode = kode;
        this.dosen = dosen;
        kelas.add(this);
    }

    public static ArrayList<Kelas> getKelas() {
        return kelas;
    }

    public static void displayKelas() {
        if (kelas.isEmpty()) {
            System.out.println("Kelas kosong");
        } else {
            for (Kelas k : kelas) {
                System.out.println("Nama kelas : " + k.nama);
                System.out.println("Kode kelas : " + k.kode);
                System.out.println("Dosen      : " + k.dosen);
                System.out.println("=========================================================");
            }
        }
    }

    public static void updateKelas(String namaKelas, String kodeKelas, String dosen) {
        for (Kelas k : kelas) {
            if (k.nama.equals(namaKelas) && k.kode.equals(kodeKelas)) {
                k.dosen = dosen;
            }
        }
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getDosen() {
        return dosen;
    }

    public void setDosen(String dosen) {
        this.dosen = dosen;
    }
}
