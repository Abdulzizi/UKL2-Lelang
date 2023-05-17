import java.util.ArrayList;

public class Barang {
    private ArrayList<Integer> idMasyarakat = new ArrayList<Integer>();
    private ArrayList<String> namaBarang  = new ArrayList<String>();
    private ArrayList<Integer> hargaAwal  = new ArrayList<Integer>();
    private boolean status;
    
    public Barang(){
        
        idMasyarakat.add(1);
        namaBarang.add("Sepeda");
        hargaAwal.add(500000);
        
        idMasyarakat.add(2);
        namaBarang.add("TV");
        hargaAwal.add(700000);
    }
    
     public int getIdMasyarakat(int a) {
        return idMasyarakat.get(a);
    }

    public void setIdMasyarakat(int idMasyarakat) {
        this.idMasyarakat.add(idMasyarakat);
    }

    public String getNamaBarang(int a) {
        return namaBarang.get(a);
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang.add(namaBarang);
    }

    public int getHargaAwal(int a) {
        return hargaAwal.get(a);
    }

    public void setHargaAwal(int hargaAwal) {
        this.hargaAwal.add(hargaAwal);
    }

    public boolean getStatus() {
        return status;
    }
    
    public void setStatus(boolean status) {
        this.status = status;
    }
    public int getJmlBrg(){
        return namaBarang.size();
    }
}
