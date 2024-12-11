package Day14;
//Abstraction

interface A{
	void display1();
	void display2();
}

interface B{
	void display3();
	void display4();
}

interface C{
	void display5();
	void display6();
}
//multiple Inheritance
//in case of interface & interface we use extends keyword
interface D extends A,B,C{
	void display7();
	void display8();
}
//in case of class & interface we use implements keyword
public class demo6 implements D{
	public static void main(String[] args) {
		D obj  = new demo6();
		obj.display1();
		obj.display2();
		obj.display3();
		obj.display4();
		obj.display5();
		obj.display6();
		obj.display7();
		obj.display8();
	}

	@Override
	public void display1() {
		System.out.println("display message-1");
	}

	@Override
	public void display2() {
		System.out.println("display message-2");
	}

	@Override
	public void display3() {
		System.out.println("display message-3");
	}

	@Override
	public void display4() {
		System.out.println("display message-4");
	}

	@Override
	public void display5() {
		System.out.println("display message-5");
	}

	@Override
	public void display6() {
		System.out.println("display message-6");
	}

	@Override
	public void display7() {
		System.out.println("display message-7");
	}

	@Override
	public void display8() {
		System.out.println("display message-8");
	}
}