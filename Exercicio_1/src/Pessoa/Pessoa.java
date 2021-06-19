package Pessoa;

public class Pessoa {
	
	private String cor_cabelo;
	private String nome;
	private int altura_cm;
	private int peso_kg;
	
	public Pessoa(String cor_cabelo, String nome, int altura_cm, int peso_kg) {
		this.cor_cabelo = cor_cabelo;
		this.nome = nome;
		this.altura_cm = altura_cm;
		this.peso_kg = peso_kg;
	}
	
	public Pessoa() {
		cor_cabelo = "azul";
		nome = "goku";
		altura_cm = 185;
		peso_kg = 100;
	}
	
	public void pintar_cabelo(String cor) {
		cor_cabelo = cor;
	}

	public String getCor_cabelo() {
		return cor_cabelo;
	}

	public String getNome() {
		return nome;
	}

	public int getAltura_cm() {
		return altura_cm;
	}

	public int getPeso_kg() {
		return peso_kg;
	}

}
