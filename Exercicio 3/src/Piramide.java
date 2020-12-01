
public class Piramide {
	private double a1;
	private double Valor;
	private double Areab;
	private float ab;
	private float h;
	private double tipot;
	private double litros;
	private double Latas;
	private double AreaT;
	private double AreaTr;
	private final int capa = 18;
	private final double quant = 4.76;
	private final double T1 = 127.90;
	private final double T2 = 258.98;
	private final double T3 = 344.34;
	//h
	public float getH() {
		return h;
	}
	public void setH(float h) {
		if(h>0) {
			this.h = h;
		}
		
	}
	//ab
	
	public float getAb() {
		return ab;
	}
	public void setAb(float ab) {
		this.ab = ab;
	}
	//tipo 
	 public double getTipot() {
	        return tipot;
	    }

	 public void setTipot(double tipot) {
	        this.tipot = tipot;
	    }
    

	 private void CalculoAreab() {
		 Areab = ab*ab;
	 }
	 public double getAreab() {
		 CalculoAreab();
		 return Areab;
	 }//area da base
	 
	 private void CalculoHdeverdade() {
		double a2 = (ab/2)*(ab/2) + (h)*(h);
		a1 = Math.sqrt(a2);
	 }
	 public double getHt() {
		 CalculoHdeverdade();
		 return a1;
	 }
	
	 private void CalculoAreaTr() {
		 AreaTr = (ab*a1)/2;
	 }
	 public double getAreaTr() {
		 CalculoAreaTr();
		 return AreaTr;
	 }//area triangulo
	 
	 
	 private void CalculoAreaT(){		
		 AreaT = (4*AreaTr)+Areab;
	 }
	 public double getAreaT() {
		 CalculoAreaT();
		 return AreaT;
	 }//area total
	 
	 
	 private void Calculolitros() {
		litros = AreaT/quant;
	 }
	 public double getLitros() {
		 Calculolitros();
		 return litros;
		 
	 }//litros usados
	 
	 private void CalculoLatas() {
		 Latas = litros/capa;
	 }
	 public double getLatas() {
		 CalculoLatas();
		 return Math.ceil(Latas);
	 }//quantidade de latas
	 
	 private void CalculoValor() {
		 	
			if(this.tipot == 1) {
				 Valor = Math.ceil(Latas)*T1;
			}else if(this.tipot == 2) {
				 Valor = Math.ceil(Latas)*T2;
			}else {
				 Valor = Math.ceil(Latas)*T3;
			}
	 }
	 public double getValor() {
		 CalculoValor();
		 return Valor;
	 }
	 //valor pago
	
}
