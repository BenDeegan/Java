package chapter1;

public class OrderOfInitBlocksWithParent {

	public static void main(String[] args) {
		new Child();
	}

}

class Parent{
	Member m = new Member("Parent");
	
	Parent(){
		System.out.println("In parent constructor");

	}
	
	{
		System.out.println("In parents init");
	}
	
}

class Member{
	Member(String name){
		System.out.println("In member " + name);
	}
}

class Child extends Parent{
	Member m = new Member("Child");
	
	Child(){
		super();
		System.out.println("In childs constructor");
	}
	{
		System.out.println("In childs init");	}
	
}
