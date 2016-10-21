package fcu.iecs.oop.password;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Plase enter password:");
		
		String str = scan.next();
		
		PasswordEncorder A = new PasswordEncorder();
		
		str = A.encode(str);
		
		System.out.println(str);
		
		scan.close();
	}

}
