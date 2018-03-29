package test2;

public class test1 {

	public static void main(String[] args){
		String a = "abc";
		String b = "abc";
		String c = new String("abc");
		String d = new String("abc");
		System.out.println((a==b));
		System.out.println((a==c));
		System.out.println((d==c));
		System.out.println((a.equals(b)));
		System.out.println((a.equals(c)));
		System.out.println((c.equals(d)));
	}
}
