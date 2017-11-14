package chapter1;

public class GarbageCollectionOne {
	
	/*		An object becomes eligible for garbage collection when it can no longer be reached by a reference variable.
	 * 
	 *		The java virtual machine reclaim memory from inaccessible object when it feels like it.
	 *
	 * 		You can ask the JVM to run it's garbage collector with:
	 * 		
	 * 				System.gc();
	 * 
	 * 		It might run...
	 * 
	 * 
	 * 		Only objects can be garbage collected.
	 * 
	 * 
	 * 		Several references can refer to one object in memory. Only when the object cannot be reached by any of those references can the object be garbage collected.
	 * */
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello");
		
		
		/*
		 * 		I can dereference my Hello StringBuilder as folows:
		 * 
		 */
		
		sb = new StringBuilder("Hello is gone!!!!");
		
		//or sb = null;
		
		StringBuilder sb1 = new StringBuilder("sb1");
		StringBuilder sb2 = new StringBuilder("sb2");
		
		sb1 =sb2;
		
		// now eligible for garbage collection -----  new StringBuilder("sb1");
		
	}

}
