package refactor;

public class Class {
	
	public static void main(String[] args) {
		int precioManzanas = 4;
		int precioJudias = 10;
		
		int totalCompra = Utils.suma(precioManzanas, precioJudias);
		
		System.out.println(totalCompra);
	}

}
