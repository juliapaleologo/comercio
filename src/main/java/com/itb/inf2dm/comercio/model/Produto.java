package com.itb.inf2dm.comercio.model;

public class Produto {
	private long Id;
	private String descricao;
	private String nome;
	private String codigoBarra;
	private double preco;
	private boolean CodStatus;
	// public: modificador de aceeso livre para todas as classes
	// private : modificador de acesso restrito apenas para membros da 
	// propria classe entende-se por "membros (atributos e/oumétodos)
	// métodos Setter´s : Adicionar e recuperar  dados  do atributo "respectivamente"

	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCodigoBarra() {
		return codigoBarra;
	}
	public void setCodigoBarra(String codigoBarra) {
		this.codigoBarra = codigoBarra;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public boolean isCodStatus() {
		return CodStatus;
	}
	public void setCodStatus(boolean codStatus) {
		CodStatus = codStatus;
	}
	
	 
	
	
	
	
	
	

}
