package com.itb.inf2dm.comercio.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.inf2dm.comercio.model.Produto;

@Controller
@RequestMapping("/comercio/produtos")
public class LojaController {
	List<Produto>listaDeProdutos = new ArrayList<Produto>();
	
	@GetMapping("/listar")
	 
	public String listaProdutos(Model model) {
		
		Produto p1 = new Produto();
		p1.setId (20l);
		p1.setDescricao("maquina de lavar ");
		p1.setNome ("maquina de lavar brastemp 12 litros");
		p1.setCodigoBarra("16546416496151646");
		p1.setPreco(3654.12);
		p1.setCodStatus(true);
		
		Produto p2= new Produto();
		p2.setId (20l);
		p2.setDescricao("microondas eletrolux");
		p2.setNome ("Microondas ");
		p2.setCodigoBarra("855223697412");
		p2.setPreco(40000);
		p2.setCodStatus(true);
		
		 listaDeProdutos.add(p1);
		 listaDeProdutos.add(p2);
		 model.addAttribute("listaDeProdutos",listaDeProdutos);
		 return "produtos";
		}
	@GetMapping("/novo-prod")
	public String NovoProduto() {
	return "novo-prod";
	}

 
}
