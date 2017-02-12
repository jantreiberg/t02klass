public class Silinder{
	double h, r;
	public Silinder(double korgus, double raadius){
		if(korgus<=0){throw new RuntimeException("Sisesta sobiv korgus");}
		if(raadius<=0){throw new RuntimeException("Sisesta sobiv raadius");}
		h=korgus;
		r=raadius;
	}
	public double pindala(){
		return 2*3.14*r*(r+h);
	}
	public double ruumala(){
		return 3.14*(r*r)*h;
	}
}