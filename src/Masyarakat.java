
import java.util.ArrayList;

public class Masyarakat implements Dataable {
    private ArrayList<String> namaMasyarakat = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();

    public Masyarakat() {
        namaMasyarakat.add("abdul");
        alamat.add("Jl. Bandung No.2");
        telepon.add("0813641732");
    }
    
    @Override
     public String getNama(int index) {
        return namaMasyarakat.get(index);
    }
    @Override
    public void setNama(String nama) {
        this.namaMasyarakat.set(0,nama);
    }

    @Override
    public String getAlamat(int index) {
        return alamat.get(index);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.set(0, alamat);
    }

    @Override
    public String getTelepon(int index) {
        return telepon.get(index);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.set(0, telepon);
    }
    
    public int getJmlOrg(){
        return this.namaMasyarakat.size();
    }
    
}
