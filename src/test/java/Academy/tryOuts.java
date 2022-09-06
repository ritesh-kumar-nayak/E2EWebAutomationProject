package Academy;

import java.util.Scanner;

public class tryOuts {
	
	public int addition(int a ,int b) {
		
		int c=a+b;
		System.out.println("Enter your address to reverse it"+" "+":");
		Scanner sc=new Scanner(System.in);
		String address=sc.next();
	
		
		StringBuffer sb=new StringBuffer(address);
		System.out.println(sb.reverse());
		
		
		return c;
		
	}
	public static void main(String[] args) {
		
		tryOuts tr=new tryOuts();
		System.out.println(tr.addition(5, 10));
		
		
		// TODO Auto-generated method stub
System.out.println(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties");
	}

}
