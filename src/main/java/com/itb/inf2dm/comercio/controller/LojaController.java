package com.itb.inf2dm.comercio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.inf2dm.comercio.model.Produto;

@Controller
@RequestMapping("/comercio/produtos")
public class LojaController {
	
	
	@GetMapping("/listar")
	 
	public String listaProdutos() {
		
		Produto p1 = new Produto();
		p1.setId (201);
		p1.setnome ("maquina de lavar brastemp 12 litros");
		p1.setcodigoBarra("16546416496151646");
		p1.setpreco(3654.12);
		 listaDeProdutos.add(p1);
		 return "produtos";
		
		
	
	}
	@GetMapping("/novo-prod")
	public String NovoProduto() {
	return "novo-prod";
	}
	

}
