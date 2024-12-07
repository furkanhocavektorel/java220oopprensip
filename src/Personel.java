public class Personel {

    //  OOP -> Object  ort prog.
    /*
    * 1_ Encapsulation -> kapsülleme
    * */
    private String ad;
    private String soyad;
    private long TCKN;
    private String mail;
    private String password;
    private int yas;

    // Constructor --> yapıcı metot
    public Personel(long tckn,String soyad){
        this.TCKN=tckn;
    }

    public Personel(String mail, String password) {
        this.mail = mail;
        this.password = password;
    }

    public Personel(String ad, String soyad, int yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }





    // personel dogum tarihi alıp yas ataması gerçekleştirin

    public long getTCKN() {
        return TCKN;
    }


    public void setAd(String ad) {
        this.ad = ad;
    }
    public String getAd() {
        return ad;
    }
    public String getSoyad() {
        return soyad;
    }


    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
}
