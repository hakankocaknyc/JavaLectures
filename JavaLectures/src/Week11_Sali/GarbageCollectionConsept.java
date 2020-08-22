package Week11_Sali;
public class GarbageCollectionConsept {
	String obj_name;
	public GarbageCollectionConsept(String name) {
		obj_name = name;
	}
	
	public static void main(String[] args) {
	GarbageCollectionConsept object1 = new GarbageCollectionConsept("t1");
	GarbageCollectionConsept object2 = new GarbageCollectionConsept("t2");
	// Reassigning the references
	object1 = object2;
	System.gc();
	
	// Null references
	GarbageCollectionConsept object3 = new GarbageCollectionConsept("t3");
	object3 = null;
	
	
	// Anonymous(bilinmeyen) Objects
	new GarbageCollectionConsept("t4");
	System.gc();
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println(this.obj_name);
	}
}