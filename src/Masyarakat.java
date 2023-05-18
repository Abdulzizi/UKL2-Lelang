
import java.util.ArrayList;

public class Masyarakat implements Dataable {
    private ArrayList<String> namaMasyarakat = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();

    public Masyarakat() {
        namaMasyarakat.add("abdul Qodir");
        alamat.add("Jl. Bandung No.2");
        telepon.add("0813641732");
        
        namaMasyarakat.add("Mahmud Mansul");
        alamat.add("Jl. Sawojajar No.65");
        telepon.add("08234156389");
        
        namaMasyarakat.add("Mr Ironi");
        alamat.add("Jl. Ngawi Selatan No.91");
        telepon.add("081254782395");
    }
    
    @Override
     public String getNama(int a) {
        return namaMasyarakat.get(a);
    }
    @Override
    public void setNama(String nama) {
        this.namaMasyarakat.set(0,nama);
    }

    @Override
    public String getAlamat(int a) {
        return alamat.get(a);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.set(0, alamat);
    }

    @Override
    public String getTelepon(int a) {
        return telepon.get(a);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.set(0, telepon);
    }
    
    public int getJmlOrg(){
        return this.namaMasyarakat.size();
    }
    
}
