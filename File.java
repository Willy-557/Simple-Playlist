import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class File {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> spotifyMini = new HashMap<>();
        Scanner scanner = new Scanner (System.in);

        while (true) {
            System.out.println("\n=== SPOTIFY MINI ===");
            System.out.println("1. Buat Playlist Baru");
            System.out.println("2. Tambah Lagu ke Playlist");
            System.out.println("3. Putar Playlist");
            System.out.println("4. Keluar");

            System.out.print("Pilih menu: ");
            int opsi = scanner.nextInt();
            scanner.nextLine();

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
                        System.out.println("\n-- Menu Buat Playlist --");
                        System.out.print("Nama Playlist: ");
                        String namaPlaylist = scanner.nextLine();
                        if (spotifyMini.containsKey(namaPlaylist)){
                            System.out.println("\nGagal! Playlist '"+ namaPlaylist + "' sudah ada sebelumnya.");
                            break;
                        }
                        else {
                            spotifyMini.put(namaPlaylist, new ArrayList<>());
                            System.out.println("\nBerhasil! Playlist '" + namaPlaylist + "' telah dibuat.");
                            break;
                        }

                    case 2:
                        System.out.println("\n-- Tambah Lagu --");

                        for (String listPlaylist : spotifyMini.keySet()){
                            System.out.println("- " + listPlaylist);
                        }
                        System.out.print("Mau masuk ke playlist mana?: ");
                        String ambilPlaylist = scanner.nextLine();

                        if (!spotifyMini.containsKey(ambilPlaylist)){
                            System.out.println("Error! Playlist '" + ambilPlaylist + "' tidak ditemukan. Buat dulu di menu 1.");
                        }
                        else {
                            System.out.print("Judul Lagu: ");
                            String inputLagu = scanner.nextLine();

                            if (spotifyMini.get(ambilPlaylist).contains(inputLagu)) {
                                System.out.println("Error! Lagu '" + inputLagu + "' sudah ada di playlist ini.");
                            }
                            else {
                                spotifyMini.get(ambilPlaylist).add(inputLagu);
                                System.out.println("Lagu '" + inputLagu + "' berhasil ditambahkan ke 'Galau'!");
                            }
                        }

                        
                        
                
                    default:
                        break;
                }
            }
        }

    }
}
