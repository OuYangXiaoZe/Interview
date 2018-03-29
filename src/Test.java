import java.util.Date;

public class Test extends Date {
	private static final Integer a = new Integer(7);
	private static int i ;
	protected int p;
	public static void main(String[] args) {
	Test test = new Test();
	test.test2();
	}

	public void test() {
		System.out.println(super.getClass().getName());
	}
	public void test1() {
		String a = new String("foo");
		String b = "foo";
		String c = "foo";
		
		System.out.println("a==b"+a.getBytes()+"---------"+b.getBytes()+"-----"+c.getBytes());
		if(a==b)
			System.out.println("a==b"+a.getBytes()+"---------"+b.getBytes());
		if(a.equals(b))
			System.out.println("a.equals(b)"+a.getBytes()+"---------"+b.getBytes());
	}
	public void test2() {
	    
	    System.out.println(Math.round(11.6));
	}
	
}
