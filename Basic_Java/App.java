package Basic_Java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        String name, search;
        int indeks = 0;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        ArrayList<String> dt = new ArrayList<>();

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
                    System.out.print("Data Nama Mahasiswa B1 : ");
                    name = br.readLine();
                    dt.add(name);
                break;
                case 2:
                    for (int i = 0; i < dt.size(); i++) {
                        System.out.println("Data ke-" + (i + 1) + " : " + dt.get(i));
                    }
                break;
                case 3:
                    
                    System.out.println("Nama yang ingin di Edit :");
                    search = br.readLine();

                    for(int i = 0; i<dt.size(); i++){
                        indeks = dt.indexOf(search);
                    }

                    System.out.print("Masukkan Nama Baru : ");
                    name = br.readLine();
                    dt.set(indeks, name);

                break;
                case 4:
                    System.out.println("Nama yang ingin di Edit :");
                    search = br.readLine();

                    for(int i = 0; i<dt.size(); i++){
                        indeks = dt.indexOf(search);
                    }
                    dt.remove(indeks);
                break;
                case 5:
                    System.exit(0);
                break;
                default :
                    System.out.println("Menu tidak ada");
                break;
            }
        }
    }
}
