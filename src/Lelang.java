
import java.util.ArrayList;

public class Lelang {
    private ArrayList<Integer> idPenawar = new ArrayList<Integer>();
    private ArrayList<Integer> idBarang =  new ArrayList<Integer>();
    private ArrayList<Integer> hargaTawar  = new ArrayList<Integer>();
    private boolean status;
    
    public Lelang(){
        idPenawar.add(1);
        idBarang.add(1);
        hargaTawar.add(600000);
    }
    
     public int getIdPenawar(int a) {
        return idPenawar.get(a);
    }

    public void setIdPenawar(int idPenawar) {
        this.idPenawar.add(idPenawar);
    }

    public int getIdBarang(int a) {
        return idBarang.get(a);
    }

    public void setIdBarang(int idBarang) {
        this.idBarang.add(idBarang);
    }

    public int getHargaTawar(int a) {
        return hargaTawar.get(a);
    }

    public void setHargaTawar(int hargaTawar) {
        this.hargaTawar.add(hargaTawar);
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    //ini overloading
    //ini sebenarnya getJumlah
    public int getHargaTawar(){
        return hargaTawar.size();
    }
}