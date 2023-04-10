package Interface_Static;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main{
    static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(isr);
    static int pilihan;

    public static void main(String[] args) throws IOException {
        ArrayList<Mahasiswa> dataMahasiswa = new ArrayList<>();
        ArrayList<Dosen> dataDosen = new ArrayList<>();
        dataDosen.add(new Dosen("Dosen 1", "1234", "Dosen 1", "Dosen 1", "Dosen 1", "Dosen 1"));
        dataMahasiswa.add(new Mahasiswa("1234", "1234", "Rizki", "Laki-laki", "Jl.Kebon Jeruk", "1234"));
        while (true) {
            System.out.println("=================================");
            System.out.println("Selamat datang di aplikasi mols");
            System.out.println("=================================");
            System.out.println("1. Login");
            System.out.println("2. Keluar");
            System.out.print("Masukan pilihan : ");
            pilihan = Integer.parseInt(br.readLine());
            if (pilihan == 1) {
                System.out.print("Masukan username : ");
                String username = br.readLine();
                System.out.print("Masukan password : ");
                String password = br.readLine();
                for (Dosen dosen : dataDosen) {
                    if (username.equals(dosen.getUsername()) && password.equals(dosen.getPassword())) {
                        dosen.menu();
                        continue;
                    }
                }
                for (Mahasiswa mahasiswa : dataMahasiswa) {
                    if (username.equals(mahasiswa.getUsername()) && password.equals(mahasiswa.getPassword())) {
                        mahasiswa.menu();
                        continue;
                    }
                }
                System.out.println("Username atau password salah");
            } else {
                System.out.println("Terima kasih");
                break;
            }
        }
    }
}