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

        personel.ad="ali";
        personel.soyad="türkmen";

        personel.sifreOlustur(personel.ad);

        personel.mailOlustur(personel.ad,personel.soyad);

        System.out.println(personel.ad);
        System.out.println(personel.soyad);
        System.out.println(personel.mailiGetir());

    }




}