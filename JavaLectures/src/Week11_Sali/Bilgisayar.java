package Week11_Sali;

public class Bilgisayar {
	
	public class anakart{
        //1.dahili üye sınıf
        public void method(){
            System.out.println("Method merhaba dedi.");
        }
    }
    
    public class islemci{
        //2.dahili üye sınıf
         public void method(){
            System.out.println("Method merhaba dedi.");
        }
    }
    
    private class bellek{
        //3.dahili üye sınıf
    }
    
 
    public static void main(String[] args) {
    //ana sınıfın main metodu
 
        Bilgisayar.islemci icNesne = new Bilgisayar().new islemci();   //dahili sınıftan nesne oluşturma.
     
        Bilgisayar.anakart icNesnee = new Bilgisayar().new anakart();
        
        icNesne.method();
        icNesnee.method();
       
    }
}

 
