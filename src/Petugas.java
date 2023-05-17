
import java.util.ArrayList;

public class Petugas {
    private ArrayList<String> namaPetugas;
    private ArrayList<String> alamat;
    private ArrayList<String> telepon;

    public ArrayList<String> getNama() {
        return namaPetugas;
    }

    public void setNama(ArrayList<String> namaPetugas) {
        this.namaPetugas = namaPetugas;
    }

    public ArrayList<String> getAlamat() {
        return alamat;
    }

    public void setAlamat(ArrayList<String> alamat) {
        this.alamat = alamat;
    }

    public ArrayList<String> getTelepon() {
        return telepon;
    }

    public void setTelepon(ArrayList<String> telepon) {
        this.telepon = telepon;
    }
}
