import java.util.Scanner;
public class Proov2{
	public static void main (String[] args){
		Scanner scan = new Scanner (System.in);
		 System.out.println("Palun sisestage silindri andmed");
		 
		 System.out.print("Korgus: ");
			int h = scan.nextInt();
			
			System.out.print("Raadius: ");
			int r = scan.nextInt();
				
		
		Silinder uus1=new Silinder(h,r);
		System.out.println("Silindri pindala on: "+uus1.pindala()+" ruutsentimeetrit");
		System.out.println("Silindri ruumala on: "+uus1.ruumala()+" kuupsentimeetrit");
		 
	}
}