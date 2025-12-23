import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class File {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> spotifyMini = new HashMap<>();
        Scanner scanner = new Scanner (System.in);

        while (true) {
            System.out.println("=== SPOTIFY MINI ===");
            System.out.println("1. Buat Playlist Baru");
            System.out.println("2. Tambah Lagu ke Playlist");
            System.out.println("3. Putar Playlist");
            System.out.println("4. Keluar");

            System.out.print("Pilih menu: ");
            int opsi = scanner.nextInt();

            if (opsi == 4) {
                System.out.println("Terimakasih!");
                break;
            }
            else if (opsi > 4 || opsi < 1) {
                System.out.println("Input tidak valid");
                continue;
            }
            else {
                switch (opsi) {
                    case 1:
                        System.out.println("-- Menu Buat Playlist --");
                        System.out.print("Nama Playlist: ");
                        String namaPlaylist = scanner.nextLine();
                        if (spotifyMini.containsKey(namaPlaylist)){
                            System.out.println("Gagal! Playlist '"+ namaPlaylist + "' sudah ada sebelumnya.");
                            break;
                        }
                        else {
                            spotifyMini.put(namaPlaylist, new ArrayList<>());
                            System.out.println("Berhasil! Playlist '" + namaPlaylist + "' telah dibuat.");
                            break;
                        }

                    
                
                    default:
                        break;
                }
            }
        }

    }
}
