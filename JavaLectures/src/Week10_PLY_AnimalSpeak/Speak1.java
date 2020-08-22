package Week10_PLY_AnimalSpeak;

 
public class Speak1 {
	 public static void main(String[] args) {
		 Animal animal;
		 Bird bird;
		 Dog dog ;
		 Horse horse; 
		 animal = new Dog("Animal");
		 bird = new Bird("Tweet");
		 dog = new Dog("Jack");
		 horse = new Horse("black horse");
		 animal.speak();
		 bird.speak();
		 dog.speak();
		 horse.speak();
	}
}
class Animal{
   private String name;
   public Animal(String name) {
       this.name = name;
   }
   public String getName() {
       return name;
   }
   public void setName(String name) {
       this.name = name;
   }
   public void speak(){
       System.out.println("hayvan konusuyor");
   }
}
class Bird extends Animal{
   public Bird(String name) {
       super(name);
   }
   @Override
   public void speak() {
       System.out.println(getName() + " otuyor");
   }
}
class Dog extends Animal{
   public Dog(String name) {
       super(name);
}
   public void speak(){
       System.out.println(getName() + " havliyor");
   }
}
class Horse extends Animal{
       public Horse(String name) {
           super(name);
       }
       @Override
       public void speak() {
           System.out.println(getName() + " Kisniyor");
       }
}