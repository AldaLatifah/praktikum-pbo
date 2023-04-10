package Interface_Static;

import java.io.IOException;
import java.util.ArrayList;

public class Mahasiswa extends Account implements UserLevelB {
    private ArrayList<Kelas> kelas;
    private String nim;

    // Constructor
    public Mahasiswa(String username, String password, String nama, String jenisKelamin, String alamat, String nim) {
        super(username, password, nama, jenisKelamin, alamat);
        this.nim = nim;
        kelas = new ArrayList<>();
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    @Override
    public void profile() {
        System.out.println("Nama          : " + this.nama);
        System.out.println("Jenis Kelamin : " + this.jenisKelamin);
        System.out.println("Alamat        : " + this.alamat);
        System.out.println("NIM           : " + this.nim);
    }

    @Override
    public void joinKelas() {
        try {
            Kelas.displayKelas();
            System.out.println("Masukan kode kelas : ");
            String kodeKelas = br.readLine();
            for (Kelas k : Kelas.getKelas()) {
                if (k.getKode().equals(kodeKelas)) {
                    kelas.add(k);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void lihatKelas() {
        System.out.println("===============================");
        System.out.println("Kelas yang dimiliki : ");
        System.out.println("===============================");
        for (Kelas kelas2 : kelas) {
            System.out.println("Kelas ke-" + kelas.indexOf(kelas2) + 1 + " : ");
            System.out.println("Nama Kelas : " + kelas2.getNama());
            System.out.println("Kode Kelas : " + kelas2.getKode());
            System.out.println("Dosen      : " + kelas2.getDosen());
            System.out.println("-------------------------------");
        }
    }

    @Override
    public void menu() {
        try {
            while (true) {
                System.out.println("==========================");
                System.out.println("1. Lihat Kelas");
                System.out.println("2. Join  Kelas");
                System.out.println("3. Profile");
                System.out.println("4. Logout");
                System.out.println("==========================");
                System.out.println("Pilih menu: ");
                pilihan = Integer.parseInt(br.readLine());
                switch (pilihan) {
                    case 1:
                        this.lihatKelas();
                        break;
                    case 2:
                        this.joinKelas();
                        break;
                    case 3:
                        this.profile();
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Pilihan tidak tersedia");
                }
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
