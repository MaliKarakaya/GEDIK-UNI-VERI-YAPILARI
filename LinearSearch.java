
package ders5;

import java.util.Scanner;

public class soru1 {
    public static void main(String[] args) {
        
        //doğrusal arama
        int[] sayilar={23,45,11,9,78,63};
        Scanner input=new Scanner(System.in);
        System.out.println("Bir Sayi Giriniz");
        int girilen=input.nextInt();
         LinearSearch nesne = new LinearSearch(sayilar);
         int sonuc = nesne.ara(girilen);
         if(sonuc == -1){
             System.out.println("Bulunamadi");
         
         }
         else{
             System.out.println("Bulundu: "+sonuc);
         }
         
         
        
    }
    }
class LinearSearch{

int[] sayilar;
    public LinearSearch(int[] sayilar) {
        
        this.sayilar = sayilar;
    }
    
    public int ara(int aranan){
    int size =sayilar.length;
    
    for(int i=0;i<size;i++){
    if (aranan==sayilar[i]){
    return i;
    }
    }
    return -1;
    
    }
    
    
   

}
    
