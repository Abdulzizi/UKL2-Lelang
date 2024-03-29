
import java.util.ArrayList;

public class Petugas implements Dataable{
    private ArrayList<String> namaPetugas = new ArrayList<>();;
    private ArrayList<String> alamat = new ArrayList<>();;
    private ArrayList<String> telepon = new ArrayList<>();;
    
    public Petugas(){
        namaPetugas.add("Osama Bin Sama");
        alamat.add("Jl. Thamrin No. 20");
        telepon.add("081234567891");
        
        namaPetugas.add("Jaeir ibnn Sama");
        alamat.add("Jl. Shhehs No. 20");
        telepon.add("08135363728");
    }

    @Override
    public String getNama(int index) {
        return namaPetugas.get(index);
    }

    @Override
    public void setNama(String nama) {
        this.namaPetugas.add(nama);
    }

    @Override
    public String getAlamat(int index) {
        return alamat.get(index);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public String getTelepon(int index) {
        return telepon.get(index);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }
    
    public int getJmlNama(){
        return this.namaPetugas.size();
    }
}