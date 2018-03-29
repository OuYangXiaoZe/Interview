package package1;

public class B extends A{
	float a =3.0f;
	String d ="fefefef";
	void show(){
		super.show();
		System.out.println(a+d);
	}
	public static void main(String[] args){
		A b = new B();
		b.show();
	}

}
