package java5Features.staticImport;



public class Solution {

	public static void main(String[] args) {
		A a = new A();
		a.test();
		a.sTest();
		
		A b = new B();
		b.test();
		b.sTest(); // Method Hiding 
		
		B c = new B();
		c.test();
		c.sTest();
	}
}

class A {

	public void test() {
		System.out.println("A");
	}
	public static void sTest() {
		System.out.println("sA");
	}
}

class B extends A {

	public void test() {
		System.out.println("B");
	}
	public static void sTest() {
		System.out.println("sB");
	}
}


