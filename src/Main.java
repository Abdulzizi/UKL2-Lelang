import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
         Scanner scanner = new Scanner(System.in);

         // Inisialisasi Object
        Masyarakat masyarakat = new Masyarakat();
        Barang barang = new Barang();
        Penawar penawar = new Penawar();
        Lelang lelang = new Lelang();
        
        
        // Inisialisasi data petugas
        Petugas petugas = new Petugas();
        
        // Menampilkan data masyarakat
        System.out.println("Data Masyarakat:");
        for (int i = 0; i < masyarakat.getJmlOrg(); i++) {
            System.out.println("Nama: " + masyarakat.getNama(i));
            System.out.println("Alamat: " + masyarakat.getAlamat(i));
            System.out.println("Telepon: " + masyarakat.getTelepon(i));
            System.out.println("");
        }
        
        // Menampilkan data petugas
        System.out.println("\nData Petugas:");
        for (int i = 0; i < petugas.getJmlNama(); i++) {
            System.out.println("Nama: " + petugas.getNama(i));
            System.out.println("Alamat: " + petugas.getAlamat(i));
            System.out.println("Telepon: " + petugas.getTelepon(i));
        }
        
        // Menampilkan data barang
    System.out.println("\nData Barang:");
    for (int i = 0; i < barang.getJmlBrg(); i++) {
        System.out.println("ID Barang: " + (i+1));
        System.out.println("ID Masyarakat: " + barang.getIdMasyarakat(i));
        System.out.println("Nama Barang: " + barang.getNamaBarang(i));
        System.out.println("Harga Awal: " + barang.getHargaAwal(i));
        System.out.println();
    }
    
    // Menampilkan data lelang
    System.out.println("\nData Lelang:");
    for (int i = 0; i < lelang.getHargaTawar(); i++) {
        System.out.println("ID Lelang: " + (i + 1));
        System.out.println("ID Penawar: " + lelang.getIdPenawar(i));
        System.out.println("ID Barang: " + lelang.getIdBarang(i));
        System.out.println("Harga Tawar: " + lelang.getHargaTawar(i));
        System.out.println();
    }
    
    // Memulai proses lelang
    System.out.println("\n--- Proses Lelang ---");
    System.out.print("Masukkan ID Barang yang akan dilelang: ");
    int idBarang1 = scanner.nextInt();
    scanner.nextLine(); // membersihkan newline buffer

    // Cek apakah ID Barang yang dimasukkan valid
    if (idBarang1 < 1 || idBarang1 > barang.getJmlBrg()) {
        System.out.println("ID Barang tidak valid!");
    }
    
      // Cetak informasi barang yang bakal dilelang
    System.out.println("\nInformasi Barang:");
    System.out.println("Nama Barang: " + barang.getNamaBarang(idBarang1 - 1));
    System.out.println("Harga Awal: " + barang.getHargaAwal(idBarang1 - 1));

    // Mulai proses penawaran
    System.out.println("\n--- Proses Penawaran ---");
    boolean stop = false;
    while (!stop) {
        System.out.print("Masukkan ID Penawar: ");
        int idPenawar1 = scanner.nextInt();
        scanner.nextLine(); // Kalo kata internet ini buat membersihkan buffer
    
        // Cek apakah ID Penawar yang dimasukkan Valdi
        if (idPenawar1 < 1 || idPenawar1 > masyarakat.getJmlOrg()) {
            System.out.println("ID Penawar tidak valid!");
        }
        
        
        // Cetak informasi penawaran
        System.out.println("\nInformasi Penawaran:");
        System.out.println("ID Barang: " + lelang.getIdBarang(idBarang1 - 1));
        System.out.println("ID Penawar: " + lelang.getIdPenawar(idPenawar1 - 1));
        System.out.println("Harga Tawar: " + barang.getHargaAwal(idBarang1 - 1));
        
        // meminta input harga tawar dari penawar
        System.out.print("Masukkan harga tawaran Anda: ");
        int hargaTawar1 = scanner.nextInt();
        scanner.nextLine(); // bersihin buffer lagi
        
        // Cek apakah harga tawar yang dimasukkan valdi
         if (hargaTawar1 <= barang.getHargaAwal(idBarang1 - 1)) {
        System.out.println("Harga tawaran harus lebih besar dari harga awal!");
         }
    
           // menambahkan data penawaran ke dalam list lelang
            lelang.getIdBarang(idPenawar1);
            lelang.getIdPenawar(idPenawar1);
            lelang.getHargaTawar(hargaTawar1);
    
            // Cek apakah penawaran terakhir atau belum
         System.out.print("Apakah ada penawaran lagi? (y/n): ");
         String lanjut = scanner.nextLine();
         if (lanjut.equalsIgnoreCase("n")) {
         stop = true;
                   }
             }

            // Cetak hasil lelang
            System.out.println("\n--- Hasil Lelang ---");
            
            int idPenawarMenang = lelang.getIdPenawar(idBarang1 - 1);
            int hargaTertinggi = lelang.getHargaTawar(idBarang1 - 1);

            System.out.println("ID Penawar dengan harga tertinggi: " + idPenawarMenang);
            System.out.println("Harga tertinggi: " + hargaTertinggi);

            System.out.println(penawar.tutupLelang(barang));
    
    }
         
     }