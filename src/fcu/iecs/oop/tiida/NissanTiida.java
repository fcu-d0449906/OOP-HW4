package fcu.iecs.oop.tiida;

public class NissanTiida {
	private int n=1;
	
	public void tiida(){
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
		n++;
	}
}
