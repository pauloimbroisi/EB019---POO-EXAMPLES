package Pessoa;

public class Main {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa("Preto", "Kakaroto", 180, 100); //Instance
		Pessoa pessoa2 = new Pessoa(); //Instance
		

		//pessoa1
		System.out.printf("\n \n pessoa1:");
		
		System.out.printf("\n Cabelo: $ %s \n", pessoa1.getCor_cabelo());
		System.out.printf("\n None: $ %s \n", pessoa1.getNome());
		System.out.printf("\n Altura: $ %d cm \n", pessoa1.getAltura_cm());
		System.out.printf("\n Peso: $ %d kg \n", pessoa1.getPeso_kg());

		pessoa1.pintar_cabelo("Vermelho");
		
		System.out.printf("\n Nova cor de cabelo: $ %s \n", pessoa1.getCor_cabelo());
		
		pessoa1.aumentar_peso(10);

		System.out.printf("\n Ganhou peso, novo peso: $ %s kg\n", pessoa1.getPeso_kg());

		
		//pessoa2
		System.out.printf("\n \n pessoa2:");
		
		System.out.printf("\n Cabelo: $ %s \n", pessoa2.getCor_cabelo());
		System.out.printf("\n None: $ %s \n", pessoa2.getNome());
		System.out.printf("\n Altura: $ %d cm \n", pessoa2.getAltura_cm());
		System.out.printf("\n Peso: $ %d kg \n", pessoa2.getPeso_kg());

		pessoa2.pintar_cabelo("Rosa");
		
		System.out.printf("\n Nova cor de cabelo: $ %s \n", pessoa2.getCor_cabelo());
		
		pessoa2.aumentar_peso(30);

		System.out.printf("\n Ganhou peso, novo peso: $ %s kg\n", pessoa2.getPeso_kg());
	}
}
