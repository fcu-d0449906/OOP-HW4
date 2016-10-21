package fcu.iecs.oop.tiida;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		NissanTiida A = new NissanTiida();
		
		for(int i=1;i<=a;i++){
			A.tiida();
		}
		
		scan.close();
	}

}
