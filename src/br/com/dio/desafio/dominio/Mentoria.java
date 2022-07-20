package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {
	private String titulo;
	private String descricao;
	private LocalDate data;
	
	
	public Mentoria() {
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
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
			"Titulo = "+ titulo + '\'' +
			" Descricao = "+ descricao + '\'' +
			", Data = " + data +
			'}';
	}

}
