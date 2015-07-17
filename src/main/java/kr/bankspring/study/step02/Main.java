package kr.bankspring.study.step02;

public class Main {

	public static void main(String arg[]){
		
		//1.생성자로 주입
		A a1 = new A(); //인스턴스가 되는 객체를 bean
		B1 b1 = new B1(a1);
		
		//2. setter로 주입
		A a2 = new A();
		B2 b2 = new B2();
		b2.setA(a2);
		
		
		
	}
}
