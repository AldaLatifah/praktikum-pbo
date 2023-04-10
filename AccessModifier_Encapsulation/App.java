package AccessModifier_Encapsulation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException{
        String name, nim, search;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        ArrayList<Mahasiswa> dataMahasiswa = new ArrayList<>();

        while (true){
            System.out.print("""
                    1. Tambah
                    2. Lihat
                    3. Edit
                    4. Hapus
                    5. Keluar
                    """);
            System.out.print("Masukkan Pilihan Anda : ");
            int select = Integer.parseInt(br.readLine());

            switch(select){
                case 1:
                    System.out.println("======TAMBAH======");
                    System.out.print("NIM Mahasiswa : ");
                    nim = br.readLine(); 
                    System.out.print("Nama Mahasiswa : ");
                    name = br.readLine();

                    Mahasiswa dt = new Mahasiswa(name,nim);
                    dataMahasiswa.add(dt);
                break;
                case 2:
                    System.out.println("======LIHAT======");
                    for (int i = 0; i < dataMahasiswa.size(); i++) {
                        System.out.println("Data ke-" + (i + 1) + " : ");
                        System.out.println("Nama : " +  dataMahasiswa.get(i).getName());
                        System.out.println("Nim : " +  dataMahasiswa.get(i).getNim());
                    }
                break;
                case 3:
                    System.out.println("======EDIT======");
                    System.out.println(" Masukkan NIM Mhs yang ingin diubah : ");
                    search = br.readLine();

                    //foreach java version
                    for (Mahasiswa mahasiswa : dataMahasiswa) {
                        if (mahasiswa.getNim().equals(search)) {
                            System.out.print("Nama Mahasiswa  : ");
                            mahasiswa.setName(br.readLine());
                            System.out.print("Nim Mahasiswa  : ");
                            mahasiswa.setNim(br.readLine());
                            break;
                        }
                    }
                    // System.out.println(" Masukkan NIM Mhs yang ingin diubah : ");
                    // nim = br.readLine();

                    // //search by index
                    // for (int i = 0; i<dataMahasiswa.size(); i++) {
                    //     if(dataMahasiswa.get(i).getNim().equals(nim)){
                    //         System.out.print("Nama Mahasiswa  : ");
                    //         dataMahasiswa.get(i).setName(br.readLine());
                    //         System.out.print("Nim Mahasiswa  : ");
                    //         dataMahasiswa.get(i).setNim(br.readLine());
                    //         break;
                    //     }
                    // }
                break;
                case 4:
                    System.out.println("======Hapus======");
                    System.out.println(" Masukkan NIM Mhs yang ingin dihapus : ");
                    search = br.readLine();

                    for (int i = 0; i<dataMahasiswa.size(); i++) {
                        if(dataMahasiswa.get(i).getNim().equals(search)){
                            dataMahasiswa.remove(i);
                        }
                    }
                break;
                case 5 :
                    System.exit(0);
                break;
                default:
                    System.out.println("Menu tidak ada");
                break;
            }
        }
    }
}
