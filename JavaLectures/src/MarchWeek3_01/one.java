package MarchWeek3_01;

public class one {
    public static void main(String[] args) {
        three object1 = new three();
        object1.printFullName();
        object1.printMiddleName();
    }
    void printName(){
        System.out.println("Ahmet ");
    }
}
class two extends one{
    void printMiddleName(){
        System.out.println("Can ");
    }
}
class three extends two{
    void lastName(){
        System.out.println("Turk");
    }
    // this keyword is being used to refer to the fields and methods in current class
    // super keyword is being used to refer to the fields and methods in super class
    void printFullName(){
        super.printName();
        super.printMiddleName();
        this.lastName();
    }
}
 



