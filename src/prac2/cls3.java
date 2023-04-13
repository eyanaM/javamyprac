package prac2;

public class cls3 {

	public static void main(String[] args) {
		cls3.life();
		cls3.life2(8.00, 2.00);

	}
	public static void life() {
		double oil = 1.50;
		double drink = 4.64;
		double dizzel= oil%drink;
		System.out.println(dizzel);
	}
	public static double life2(double a,double b) {
		double c=a/b;
		System.out.println(c);
		return c;
		
	}

}
