package field_method_access.package1;

public class A {
	
	public int field1;
	int field2;
	private int field3;
	
	public A() {
		field1 = 1;
		field2 = 1;
		field3 = 1;
		
		method1();
		method2();
		//method3();     //// 클래스 내부일 경우 접근 제한자의 영향을 받지 않는다.
	}
	
	public void method1() {}
	void method2() {}
	//private method3() {}

}
