
public class C extends B implements A {
	public void pX() {
		System.out.println(A.x);
	}

	public void pX1() {
		System.out.println(super.x);
	}

	public static void main(String[] args) {
		new C().pX();
	}

}
