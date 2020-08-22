package Week9_Dad;

public class Kid  implements Mam,Dad{
	String name = "Ahmet";
    public String mom(){
        return "Mommy loves you";
    }
	@Override
	public String dad() {
		  
		return  "Dad loves you";
	} 
 

	 
}
