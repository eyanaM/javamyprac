package prac2;

public class cls1 {

	public static void main(String[] args) {
		cls1.any();
		cls1.sis("Nitu", " Rosemery");
		cls1.any2();

	}
	public static int  any() {
		int a = 10;
		int b = 20;
		int c =a+b;
		System.out.println(c);
		return c;
	}
	
	public static String sis(String firstname, String lastname) {
		String fullname =firstname+lastname;
		System.out.println(fullname);
		return fullname;
		
	}
	public static double any2() {
		double d=33.99;
		double e = 77.01;
		double f= d+e;
		System.out.println(f);
		
		return f;
	}

}
