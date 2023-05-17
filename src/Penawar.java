public class Penawar implements LelangA{
    
    @Override
    public void bukaLelang(Barang barang) {
        barang.setStatus(true);
    }
    @Override
     public void tutupLelang(Barang barang) {
        barang.setStatus(false);
        int indexPemenang = 0;
        int hargaTertinggi = 0;
        for (int i = 0; i < barang.getJmlBrg(); i++) {
            if (barang.getHargaAwal(i) > hargaTertinggi) {
                hargaTertinggi = barang.getHargaAwal(i);
                indexPemenang = i;
            }
        }
        System.out.println("Pemenang lelang adalah " + barang.getNamaBarang(indexPemenang) +  " dengan harga penawaran " + barang.getHargaAwal(indexPemenang));
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
