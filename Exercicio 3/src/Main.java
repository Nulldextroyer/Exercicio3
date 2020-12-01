import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Piramide pi = new Piramide();
		System.out.println("digite a lado: ");
		pi.setAb(scan.nextFloat());
        System.out.println("digite a altura: ");
		pi.setH(scan.nextFloat());
		System.out.println("digite o tipo: ");
		pi.setTipot(scan.nextDouble());
		
		//entrada
		System.out.println("area da base: " +pi.getAreab());
		System.out.println("a1: " +pi.getHt());
		System.out.println("area triangulo: " +pi.getAreaTr());
		System.out.println("area total: " +pi.getAreaT());
		System.out.println("litros  usados: " +pi.getLitros());
		System.out.println("latas:" +pi.getLatas());
		System.out.println("tipo: " +pi.getTipot());
		System.out.println("valor: " +pi.getValor());
		
		
		
	}

}
