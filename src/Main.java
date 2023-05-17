
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
//     // membuat objek-objek yang diperlukan
//        Masyarakat masyarakat = new Masyarakat();
//        Petugas petugas = new Petugas();
//        Barang barang = new Barang();
//        Lelang lelang = new Lelang();
//        Penawar penawar = new Penawar();
//
//        // mengisi data masyarakat, petugas, barang, dan lelang
//        ArrayList<String> namaMasyarakat = new ArrayList<>();
//        namaMasyarakat.add("Andi");
//        namaMasyarakat.add("Budi");
//        masyarakat.setNama(namaMasyarakat);
//
//        ArrayList<String> namaPetugas = new ArrayList<>();
//        namaPetugas.add("Cici");
//        namaPetugas.add("Dedi");
//        petugas.setNama(namaPetugas);
//
//        ArrayList<Integer> idMasyarakat = new ArrayList<>();
//        idMasyarakat.add(1);
//        idMasyarakat.add(2);
//        barang.setIdMasyarakat(idMasyarakat);
//
//        ArrayList<String> namaBarang = new ArrayList<>();
//        namaBarang.add("Sepatu");
//        namaBarang.add("Baju");
//        barang.setNamaBarang(namaBarang);
//
//        ArrayList<Integer> hargaAwal = new ArrayList<>();
//        hargaAwal.add(100000);
//        hargaAwal.add(50000);
//        barang.setHargaAwal(hargaAwal);
//
//        ArrayList<Integer> idPenawar = new ArrayList<>();
//        idPenawar.add(1);
//        idPenawar.add(2);
//        lelang.setIdPenawar(idPenawar);
//
//        ArrayList<Integer> idBarang = new ArrayList<>();
//        idBarang.add(1);
//        idBarang.add(2);
//        lelang.setIdBarang(idBarang);
//
//        ArrayList<Integer> hargaTawar = new ArrayList<>();
//        hargaTawar.add(150000);
//        hargaTawar.add(75000);
//        lelang.setHargaTawar(hargaTawar);
//
//        // menampilkan data lelang sebelum tutup
//        System.out.println("Data Lelang Sebelum Ditutup");
//        penawar.tampilkanLelang(lelang);
//
//        // menutup lelang
////        penawar.tutupLelang(barang);
//
//        // menampilkan data lelang setelah tutup
//        System.out.println("Data Lelang Setelah Ditutup");
//        penawar.tampilkanLelang(lelang);
//        
//        penawar.tutupLelang(barang);


         Scanner scanner = new Scanner(System.in);

         // Inisialisasi data masyarakat
        Masyarakat masyarakat = new Masyarakat();
        
        
        // Inisialisasi data petugas
        Petugas petugas = new Petugas();
        ArrayList<String> namaPetugas = new ArrayList<>();
        ArrayList<String> alamatPetugas = new ArrayList<>();
        ArrayList<String> teleponPetugas = new ArrayList<>();
        namaPetugas.add("Osama Bin Sama");
        alamatPetugas.add("Jl. Thamrin No. 20");
        teleponPetugas.add("081234567891");
        petugas.setNama(namaPetugas);
        petugas.setAlamat(alamatPetugas);
        petugas.setTelepon(teleponPetugas);
        
        // Inisialisasi data barang
        Barang barang = new Barang();
        
        // Inisialisasi data lelang
        Lelang lelang = new Lelang();
        
        // Inisialisasi objek Penawar
        Penawar penawar = new Penawar();
        
         // Menampilkan data masyarakat
        System.out.println("Data Masyarakat:");
        for (int i = 0; i < masyarakat.getJmlOrg(); i++) {
            System.out.println("Nama: " + masyarakat.getNama(i));
            System.out.println("Alamat: " + masyarakat.getAlamat(i));
            System.out.println("Telepon: " + masyarakat.getTelepon(i));
        }
        
        // Menampilkan data petugas
        System.out.println("\nData Petugas:");
        for (int i = 0; i < petugas.getNama().size(); i++) {
            System.out.println("Nama: " + petugas.getNama().get(i));
            System.out.println("Alamat: " + petugas.getAlamat().get(i));
            System.out.println("Telepon: " + petugas.getTelepon().get(i));
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
        System.out.println("ID Lelang: " + (i+1));
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

    // Cek apakah barang sudah pernah dilelang sebelumnyaa
//    if (lelang.getIdBarang().contains(idBarang1)) {
//        System.out.println("Barang sudah pernah dilelang sebelumnya!");
//    }
    
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
        // Cek apakah ID Penawar sudah pernah melakukan penawaran sebelumnya
//        if (lelang.getIdPenawar().contains(idPenawar1)) {
//            System.out.println("Anda sudah pernah melakukan penawaran sebelumnya!");
//        }
        
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
//           lelang.getIdBarang(idPenawar1);
//           lelang.getIdPenawar(idPenawar1);
//           lelang.getHargaTawar(hargaTawar1);
    
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
        }
         
     }