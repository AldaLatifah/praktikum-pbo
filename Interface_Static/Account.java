package Interface_Static;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public abstract class  Account {
    protected String username, password, nama, jenisKelamin, alamat;

    //Bakal dipakai di Dosen dan Mahasiswa
    protected InputStreamReader isr = new InputStreamReader(System.in);
    protected BufferedReader br = new BufferedReader(isr);
    protected int pilihan;

    //cek jumlah account dosen dan mhs
    protected static int jumlah = 0;

    // Constructor
    public Account(String username, String password, String nama, String jenisKelamin, String alamat) {
        this.username = username;
        this.password = password;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.alamat = alamat;
        jumlah++;
    }

    //ABSTRACT
    public abstract void profile();

    public static int getJumlah() {
        return jumlah;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
