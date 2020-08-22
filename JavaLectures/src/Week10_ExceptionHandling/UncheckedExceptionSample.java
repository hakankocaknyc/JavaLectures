package Week10_ExceptionHandling;
import java.util.ArrayList;
 

public class UncheckedExceptionSample {
    
    public static void main(String[] args) {
 
        ArrayList<String> strList = new ArrayList<String>();
        strList.add("Taha");    //0. value
        strList.add("Vehbi");   //1. value
        strList.add("Alper");   //2. value
 
        String val = strList.get(4);
        System.out.println(val);
    }
}