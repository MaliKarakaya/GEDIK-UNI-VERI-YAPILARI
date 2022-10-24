
package uygulamalar;

//Bu dosyadaki "public" olan class isimi mutlaka dosya ismi ile aynı olmalıdır
//bir java dosyasında ancak 1 ader public class olabilir
//bir class'ın "public" olması onun her yerde erişebilir olduğunu gösterir
public class ClassYapisi {//ilk sınıfımız
    //kodları calistirmak icin mutlaka main methoduna ihdiyac var
    //her class'ta main metofu olmak zorunda değildir
    //tüm programda sadece 1 class'ın icinde main metodu olsa bile
    //her şeyi o metottan başlatabiliriz
    public static void main(String[] args) {
        //her şeyin başladığı yer
        System.out.println("Program Basladi!");
        
        //bir sınıfın özelliklerini kullanabilmek için
        //o sınıftan nesne üretmek gerekir
        Sinif nesne = new Sinif();//newleme işlemi
        
        //artık sınıfımızın tüm üyelerine ve metodlarına erişebliriz
        nesne.deneme();
        nesne.ondalik=3.14;
        nesne.sayi=9;
        nesne.text="Merhaba";
        System.out.println("nesne sayi: "+nesne.sayi);
        System.out.println("nesne ondalık : "+nesne.ondalik);
        System.out.println("nesne text: "+nesne.text);
    }
    
}
class Sinif{//ikinci sınıfımız 
    //sınıf üyeleri (class members or fields)
    int sayi;
    double ondalik;
    String text;
    
    //metodlar
    public void deneme(){//deneme metodunun döndürdüğü bir değer yok (yani void)
        System.out.println("deneme adlı metod calisti");  
    }

}
