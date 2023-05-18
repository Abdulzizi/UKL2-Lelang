public class Penawar implements LelangA{
    
    @Override
    public void bukaLelang(Barang barang) {
        barang.setStatus(true);
    }
    @Override
     public void tutupLelang(Barang barang) {
        barang.setStatus(false);
        int indexPemenang = -1;
        int hargaTertinggi = -1;
        
        //mencari bid tertinggi
        for (int i = 0; i < barang.getJmlBrg(); i++) {
            if (barang.getHargaAwal(i) > hargaTertinggi) {
                hargaTertinggi = barang.getHargaAwal(i);
                indexPemenang = i;
            }
        }
        if (indexPemenang != -1) {
            System.out.println("Pemenag lelang adalah : "+barang.getNamaBarang(indexPemenang) + " Dengan Harga Penawaran "+barang.getHargaAwal(indexPemenang));
        } else {
            System.out.println("Tidak Ada Penawar Yang Valid");
        }
    }
    @Override
      public void tampilkanLelang(Lelang lelang) {
        for (int i = 0; i < lelang.getHargaTawar(); i++) {
            System.out.println("ID Barang: " + lelang.getIdBarang(i));
            System.out.println("ID Penawar: " + lelang.getIdPenawar(i));
            System.out.println("Harga Tawar: " + lelang.getHargaTawar(i));
            System.out.println("");
        }
    }
}