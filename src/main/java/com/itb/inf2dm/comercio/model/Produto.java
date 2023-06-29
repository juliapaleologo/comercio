package com.itb.inf2dm.comercio.model;

public class Produto {
	private long id;
	private String descricao;
	private String nome;
	private String codigoBarra;
	private double preco;
	// public: modificador de aceeso livre para todas as classes
	// private : modificador de acesso restrito apenas para membros da 
	// propria classe entende-se por "membros (atributos e/oumétodos)
	 
	// métodos Setter´s : Adicionar e recuperar  dados  do atributo "respectivamente"
	
	public void setId(long Id) {
		this.id = id;
	}
	public Long getId() {
		return id;
	}
	
	public void setdescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getdescricao() {
		return descricao;
	}
	public void setnome(String nome) {
		this.nome= nome;
	}
	public String getnome() {
		return nome;
	}
	public void setcodigoBarra(String codigoBarra) {
		this.codigoBarra=codigoBarra;
	}
	public String getcodigoBarra() {
		return codigoBarra;
	}
	public void setpreco(double preco) {
		this.preco = preco;
		}
	 public double getpreco() {
		 return preco;
	 }
	
	
	

}
