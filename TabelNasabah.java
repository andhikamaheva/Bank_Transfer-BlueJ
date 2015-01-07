import java.util.*;

/**
 * Write a description of class TabelNasabah here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TabelNasabah
{
    // instance variables - replace the example below with your own
    private Vector<Nasabah> daftarNasabah=new Vector<Nasabah>();
    private boolean status = false;

    /**
     * Constructor for objects of class TabelNasabah
     */
    public TabelNasabah()
    {
        // initialise instance variables
        
    }
    
    public void tambah(Nasabah nBaru){
        daftarNasabah.add(nBaru);
    }
    
    public void tarikTunai(String noRek, int jmlTarikTunai){
    for(int i=0;i<daftarNasabah.size();i++){
        if(daftarNasabah.elementAt(i).getNoRek().equals(noRek))
        daftarNasabah.elementAt(i).tarikTunai(jmlTarikTunai);

    }
    }
    
    public void cekRek(String noRek){
        for(int i=0;i<daftarNasabah.size();i++){
        if(daftarNasabah.elementAt(i).getNoRek().equals(noRek))
        status=true;
        else
        status=false;
    }
    }
    
    public void transfer(String noRekAsal, String noRekTujuan, int jmlTransfer){
    //1. cari rekAsal
    //2. cari rekTujuan
    //3. jika ketemu semua
    //4. tarik tunai rekAsal
    //5. setor tunai rekTujuan
    cekRek(noRekAsal);
    if(
    cekRek(noRekTujuan);
    }

    
}
