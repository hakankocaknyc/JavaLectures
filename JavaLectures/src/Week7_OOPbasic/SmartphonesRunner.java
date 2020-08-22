package Week7_OOPbasic;

public class SmartphonesRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SmartPhones iPhones = new SmartPhones();
		
		iPhones.version= " X plus";
		iPhones.capacity =64;
		iPhones.color = "Blue";
		iPhones.ram=2;
		System.out.println(iPhones.version);
		System.out.println(iPhones.capacity);
		System.out.println(iPhones.color);
		System.out.println(iPhones.ram);
		
		iPhones.sendingEmail();
		iPhones.takingPic();
		
	}}