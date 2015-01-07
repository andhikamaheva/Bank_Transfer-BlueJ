
/**
 * Write a description of class Nasabah here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nasabah
{
    // instance variables - replace the example below with your own
    public static final int MIN_SALDO = 10000;
    private String nama;
    private String noRek;
    private String alamat;
    private String noTelp;
    private int saldo;
    
    private boolean status=false;
    
    /**
     * Constructor for objects of class Nasabah
     */
    public Nasabah()
    {
        // initialise instance variables
        
    }
    
    public void setNama(String nama){
        this.nama=nama;
    }
    
    public String getNama(){
        return nama;
    }
    
    public int getSaldo (){
        return saldo;
    }
    //contoh method ACCES - setter/getter    
    public String getNoRek(){
        return noRek;
    }
        //contoh method IMPLEMENTOR
    public void tarikTunai(int jmlTarikTunai){
        //Check saldo setelah penarikan tunai harus > MIN_SALDO
        status=false;
        if (checkSaldo(jmlTarikTunai)){
        saldo -= jmlTarikTunai;
        status=true;
        }
        else
        System.out.println("Saldo harus lebih dari 10000");
    }
    //contoh method IMPLEMENTOR    
    public void setorTunai(int jmlSetorTunai){
        saldo += jmlSetorTunai;
    }
    //contoh method IMPLEMENTOR
    public void transfer(Nasabah tujuan, int jmlTransfer){
        //1. check saldo
        tarikTunai(jmlTransfer);
        if(status==true){
        tujuan.setorTunai(jmlTransfer);
        System.out.println("TRANSFER BERHASIL!");
        }
        else
        System.out.println("TRANSFER GAGAL!");
    
    }
    
    private boolean checkSaldo(int jml){
        return ((saldo-jml)>=MIN_SALDO);
    }
    
    public Nasabah(String nama, String noRek, String alamat, String noTelp, int saldo){
        this.nama=nama;
        this.noRek=noRek;
        this.alamat=alamat;
        this.noTelp=noTelp;
        this.saldo=saldo;
    }

    
}
