package Week11_Sali;
import java.util.ArrayList;

 
 /*
    //1.dahili sınıf asal sayı hesaplamak için kullanılır
    public class asalSayi {
 
        public boolean asalSayiBul(int sayi) {
            int bolen = 0;
            boolean kontrol;
 
            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    bolen++;
                }
            }
            if (bolen == 0) {
                kontrol = true;  //asaldir.
            } else {
                kontrol = false; //asal değildir.
            }
 
            return kontrol;
        }
    }
 
    //2.dahili sınıf mükemmel sayı hesaplamak için kullanılır.
    protected class mukemmelSayi {
 
        //Bilgi: Kendisi haric bölenleri toplamı kendisine eşit olan sayı mukemmel sayıdır.
 
        protected boolean mukemmleSayiBul(int sayi) {
            int boleanToplam = 0;
            boolean kontrol;
 
            for (int i = 1; i < sayi; i++) {
                if (sayi % i == 0) {
                    boleanToplam += i;
                }
 
            }
            if (boleanToplam == sayi) {
                kontrol = true; //sayi mukemmeldir.
            } else {
                kontrol = false; //sayi mukemmel degildir.
            }
 
            return kontrol;
        }
    }
 
    //3. dahili sınıf fibonacci serisind elemanları bulmak için kullanılır.
    private class fibonacciSerisi {
 
        private ArrayList fibonacciSerisi(int elemanSayisi) {
            ArrayList<Integer> fibo=new ArrayList<>();
            fibo.add(0,1);
            fibo.add(1,1);  //ilk iki indise 1 ekledik. Fibonacci serisinde ilk iki sayi 1 oldugu için.
            
            for (int i = 0; i <elemanSayisi-2; i++) {  
                fibo.add(i+2,fibo.get(i)+fibo.get(i+1)); //Her sayı kendisinden önceki iki sayının toplamından oluşur.
            }
            return fibo;
        }
    }
 
    
    
    public static void main(String[] args) { 
        
        DahiliSinifOrnek.asalSayi asalNesne = new DahiliSinifOrnek().new asalSayi();
        DahiliSinifOrnek.mukemmelSayi mukemmelNesne = new DahiliSinifOrnek().new mukemmelSayi();
        DahiliSinifOrnek.fibonacciSerisi fibonacciNesne = new DahiliSinifOrnek().new fibonacciSerisi();
        
        
        System.out.println("5 sayısı asal mı?: "+ asalNesne.asalSayiBul(5));
        System.out.println("120 sayısı asal mı?: " + asalNesne.asalSayiBul(120));
        
        System.out.println("6 sayısı mükemmel sayı mı?: " + mukemmelNesne.mukemmleSayiBul(6));
        System.out.println("12 sayısı mükemmel sayı mı?: " + mukemmelNesne.mukemmleSayiBul(12));
        
        System.out.println("Fibonacciden 7 tane eleman:" + fibonacciNesne.fibonacciSerisi(7));
        System.out.println("Fibonacciden 11 tane eleman:" + fibonacciNesne.fibonacciSerisi(11));
        
        
    }
}

public class DahiliSinif {

}*/
