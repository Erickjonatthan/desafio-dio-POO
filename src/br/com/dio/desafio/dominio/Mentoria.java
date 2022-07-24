package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
	
	private LocalDate data;
	
	@Override
	public double calcularXp() {
		return XP_PADRAO + 20d;
	}

	public Mentoria() {
	}
	
	public LocalDate getData() {
		return data;
	}
	public void setdata(LocalDate data) {
		this.data = data;
	} 
	@Override
	public String toString() {
		// TODO Auto-generated method stub
	return "Mentoria{" +
			"Titulo = '"+ getTitulo() + '\'' +
			"  Descricao = '"+ getDescricao() + '\'' +
			" , Data = '" + data +
			'}';
	}

	
}
