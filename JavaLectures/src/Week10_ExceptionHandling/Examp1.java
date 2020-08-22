package Week10_ExceptionHandling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
 
 
public class Examp1 {
 
    /**
     * readFile metodu projenin bulundugu pathten test.txt adinda bir dosya 
     * okumaya calisiyor.
     * Bu kodu gelistirirken IDE bizi dosyanın orda bulunamama durumuna karsi 
     * uyariyor ve bir hata olabilecegini bunu kontrol altina almamiz 
     * gerektigini belirtiyor.
     */
    public void readFile() {
        try {
            FileInputStream inputStream = new FileInputStream("test.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
 
    /**
     * readAnotherFile metodunda ise readFile metodundaki islemin aynisi 
     * yapiliyor fakat olusabilecek hatanin kontrol edilme yetkisi bir üst 
     * sinifa veriliyor.
     * @throws FileNotFoundException
     */
    public void readAnotherFile() throws FileNotFoundException {
        FileInputStream inputStream = new FileInputStream("test1.txt");
    }
 
    /**
     * readFile metodu kendi icinde hata ile ilgilendigi için direk 
     * kullanilabilirken, readAnotherFile metodu hata ile ilgilenme 
     * yetkisini bir üst sinifa verdigi icin cagrildigi sinif icinde
     * gerekli kontrol islemlerinin yapilmasi gerekiyor.
     * @param args
     */
    public static void main(String[] args) {
        Examp1 ces = new Examp1();
        ces.readFile();
 
        try {
            ces.readAnotherFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}