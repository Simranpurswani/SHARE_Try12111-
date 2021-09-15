package Practise;

public class StringDemo{

	public static void main(String[] args){
		String s= new String("Simran");
		System.out.println(s);
		String a="Icandoit@123";
		String b="Icandoit@123";
		int len = a.length();
		System.out.println("String length "+ len);
		char result = a.charAt(8);
		System.out.println(result);
		
		int r=b.compareTo(a);
		System.out.println(r);
		

	}

}
