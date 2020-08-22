package MarchWeek2_0;

public class StaticEx {

	int counter1;
    static int counter2;
    
    void counter(){
        counter1 ++;
    }
    
    static void staticCounter(){
        counter2++;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        StaticEx object1 = new StaticEx(), object2 = new StaticEx();
        
        object1.counter();
        object2.counter();
        
        staticCounter();
        staticCounter();
        object1.staticCounter();
        object2.staticCounter();
        
        System.out.println("This is non-static counter object1 : "  + object1.counter1);
        System.out.println("This is non-static counter object2 : "  + object2.counter1);
        System.out.println("This is static counter object1 : "  + object1.counter2);
        System.out.println("This is static counter object2 : "  + object2.counter2);
        
        
    }
}
