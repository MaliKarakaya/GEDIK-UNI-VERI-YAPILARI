package ders5;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] sayilar ={3,5,11,19,28,43};
        Scanner input= new Scanner(System.in);
        System.out.println("Bir Sayi giriniz");
        int girilen=input.nextInt();
        
       Binarysearch2 nesne=new Binarysearch2(sayilar);
        
        int sonuc =nesne.ara(girilen);
        if(sonuc == -1){
             System.out.println("Bulunamadi");
         
         }
         else{
             System.out.println("Bulundu: "+sonuc);
         }
        
        
    }
}
class Binarysearch2{
int[] sayilar;

    public Binarysearch2(int[] sayilar) {
        this.sayilar = sayilar;
    }
   public int ara(int aranan){
   int ilk = 0;
   int son =sayilar.length-1;
   
   while(ilk <= son){
   int orta=(ilk+son)/2;
   
   if(aranan == sayilar[orta]){
   return orta ;
   }
   else if(sayilar[orta]<aranan){
   ilk = orta + 1;
   
   }
   else{
   son=orta-1;
   }
   
   }
   
   return-1;
   

}
}

