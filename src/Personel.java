public class Personel {

    private String ad;
    private String soyad;
    private long TCKN;
    private String mail;
    private String password;
    private int yas;

    // personel dogum tarihi alıp yas ataması gerçekleştirin



    public void setYas(int dogumTarihi){
        int yas=2024-dogumTarihi;
        this.yas=yas;
    }


    public int getYas(){
        return yas;
    }


    public long getTCKN(){
        return this.TCKN;
    }

    public void setTCKN(long tckn){
        this.TCKN=tckn;
    }



    public void setSoyad(String soyad){
        this.soyad=soyad;
    }

    public String getSoyad(){
        return soyad;
    }






    public String getAd(){
        return ad;
    }

    public void setAd(String personelAdi){
        ad=personelAdi;
    }





    public void setMail(String ad,String soyad){
        // ad.soyad@gmail.com
        String olusanMail=ad+"."+soyad+"@gmail.com";
        mail=olusanMail;
    }

    public String getMail(){
        return mail;
    }

    public void setPassword(String ad){
        String pass=ad+123;
        password=pass;
    }

    public String getPassword(){
        return password;
    }


}
