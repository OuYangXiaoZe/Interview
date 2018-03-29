public class Something {
	public static void main(String[] args) {
		Something s = new Something();
		System.out.println("s.doSomething() returns " + doSomething());
	}

	public String doSomething() {
		return "Do something ...";
	}
}
