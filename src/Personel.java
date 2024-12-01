public class Personel {

    public String ad;
    public String soyad;
    public long TCKN;
    private String mail;
    private String password;


    public void mailOlustur(String ad,String soyad){
        // ad.soyad@gmail.com
        String olusanMail=ad+"."+soyad+"@gmail.com";
        mail=olusanMail;
    }

    public String mailiGetir(){
        return mail;
    }

    public void sifreOlustur(String ad){
        String pass=ad+123;
        password=pass;
    }

}
