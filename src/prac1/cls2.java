package prac1;

public class cls2 {

	public static void main(String[] args) {
		
      cls2 objec=new cls2();
      objec.strg();
	}
   public void strg() {
	   String country= "Bangladesh";
	   String city = " Dhaka";
	   String po = " kaliganj";
	   String vill="  Nagari";
	   String fulladdress=country + city + po+ vill;
	   
	   System.out.println(fulladdress);
   }
}
