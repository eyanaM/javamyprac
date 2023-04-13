package prac2;

public class cls2 {

	public static void main(String[] args) {
		 cls2.eye();
		 cls2.eye2();
		 cls2.eye3(60, 3);

	}
	public static void eye() {
		int d=30;
		int e= 20;
		int f= d+e;
		System.out.println(f);
	}
	
	public static int eye2() {
		int u= 50;
		int v= 10;
		int w= u-v;
		System.out.println(w);
		
		return w;
	}
	
	public static void eye3(int a, int b) {
		int c= a*b;
		System.out.println(c);
		
		
	}

}
