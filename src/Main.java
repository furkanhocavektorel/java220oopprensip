public class Main {

    /*
    OOP PRENSIPLERI:
    1_ ENCAPSULATION - KAPSÜLLEME
    2_ INHERITENCE - KALITIM MİRAS ALMA
    3_ POLYMORPHİSM - ÇOK BİÇİMLİLİK
    4_ ABSTRACTION - SOYUTLAMA
    */

    public static void main(String[] args) {

        Personel personel= new Personel();

        personel.setAd("buse");

        personel.setSoyad("koc");

        personel.setPassword(personel.getAd());
        personel.setMail(personel.getAd(),personel.getSoyad());

        personel.setYas(1990);

        System.out.println(personel.getYas()); // ekranda :{ 34 } yazacak



        System.out.println(personel.getAd());
        System.out.println(personel.getSoyad());
        System.out.println(personel.getMail());
        System.out.println(personel.getPassword());
    }




}