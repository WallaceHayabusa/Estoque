package com.trabalho.dweb.estoque.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.trabalho.dweb.estoque.model.Produto;
import com.trabalho.dweb.estoque.service.ProdutoService;


@Controller
@RequestMapping("/index")
public class IndexController {

	@Autowired
	private ProdutoService produtoService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String index(Model model) {
		
		String mensagem = "Hello World!";
		
		model.addAttribute("mensagem", mensagem);
		
		return "index";
	}
	
	@RequestMapping(value = "/salvar", method = RequestMethod.POST)
	public ModelAndView salvar(@ModelAttribute("produto") Produto produto) {
		ModelAndView model = new ModelAndView("index");
//		produto.setId(1L);
		produtoService.cadastrarProduto(produto);
		model.addObject("produto",	produto);
		return new ModelAndView("redirect:/index");
	}
}
