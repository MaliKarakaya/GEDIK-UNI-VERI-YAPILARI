package uygulamalar;

public class ClasslaraGiris {
    public static void main(String[] args) {
        //1.kisiye ait bilgiler
        String adı="Mali";
        int yas = 20;
        int kilo = 75;
        double boy = 178;
        String tel = "05313111514";
        
        //2. kişiye ait bilgiler
        String adı2="Mali2";
        int yas2 = 20;
        int kilo2 = 75;
        double boy2 = 178;
        String tel2 = "05313111514";
        
        //tek tek her degiskeni bulup yazdırmak gerekiyor
        //sınıf mantigi olmadiginda 
        //ornegin bir kişiye ait bilgileri toplu halde kullanmak çok zor 
        System.out.println(adı);
        System.out.println(yas);
        System.out.println(kilo);
        System.out.println(boy);
        System.out.println(tel);
        System.out.println("----------");
        
        Kisi x = new Kisi("Zeki", 30, 85, 1.74, "02121110011");
        System.out.println(x.ad);
        System.out.println(x.yas);
        System.out.println(x.kilo);
        System.out.println(x.boy);
        System.out.println(x.tel);
        x.method();
    }
}
class Kisi{
String ad;
int yas;
int kilo;
double boy;
String tel;

    public Kisi(String ad, int yas, int kilo, double boy, String tel) {
        this.ad = ad;
        this.yas = yas;
        this.kilo = kilo;
        this.boy = boy;
        this.tel = tel;
    }
public void method(){
    System.out.println("metod calisti");
}

}